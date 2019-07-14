package com.example.emily;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ai.api.AIDataService;
import ai.api.AIListener;
import ai.api.AIServiceException;
import ai.api.android.AIConfiguration;
import ai.api.android.AIService;
import ai.api.model.AIError;
import ai.api.model.AIRequest;
import ai.api.model.AIResponse;
import ai.api.model.Result;


//https://www.youtube.com/watch?v=JAdHKPGlxvQ&t=334s
public class chat extends AppCompatActivity implements AIListener{
    ListView mlista;
    EditText editText;
    ImageButton btn_send_message, btn_voice;
    List<response_model> lista;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        mlista = (ListView) findViewById(R.id.list_of_message);
        lista = new ArrayList<>();
        editText = (EditText) findViewById(R.id.user_message);
        btn_send_message = (ImageButton) findViewById(R.id.keyboard);
        btn_voice = (ImageButton) findViewById(R.id.voice);


        final AIConfiguration config = new AIConfiguration("a876486166af47e49ff70dd8cc2add98",
                AIConfiguration.SupportedLanguages.Korean,
                AIConfiguration.RecognitionEngine.System);

        final AIService aiService = AIService.getService(this, config);
        aiService.setListener((AIListener) this);

        final AIDataService aiDataService = new AIDataService(config);
        final AIRequest aiRequest = new AIRequest();


        btn_send_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String text2 = editText.getText().toString();
                aiRequest.setQuery(text2);
                if(!text2.equals("")){
                    final response_model response = new response_model(text2, 1);


                    aiRequest.setQuery(text2);
                    new AsyncTask<AIRequest, Void, AIResponse>() {
                        @Override
                        protected AIResponse doInBackground(AIRequest... aiRequests) {
                            final AIRequest request = aiRequests[0];
                            try {
                                final AIResponse response = aiDataService.request(aiRequest);
                                return response;
                            } catch (AIServiceException e) {
                            }
                            return null;
                        }

                        @Override
                        protected void onPostExecute(AIResponse aiResponse) {
                            if(aiResponse != null){
                                Result result = aiResponse.getResult();
                                final String speech = result.getFulfillment().getSpeech();
                                response_model response = new response_model(speech, 0);
                                lista.add(new response_model(text2,1));
                                Handler hand = new Handler();
                                hand.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        lista.add(new response_model(speech,0));
                                    }
                                }, 0);
                                AdapMessage adap = new AdapMessage(lista, chat.this);
                                mlista.setAdapter(adap);
                            }
                        }
                    }.execute(aiRequest);

                }else{
                    aiService.startListening();
                }
                editText.setText("");
            }
        });
    }

    @Override
    public void onResult(AIResponse result) {

        Result result1 = result.getResult();
        String message = result1.getResolvedQuery();
        response_model chatMessage0 = new response_model(message, 1);

        String reply = result1.getFulfillment().toString();
        response_model chatMessage = new response_model(reply, 0);
        AdapMessage adap = new AdapMessage(lista, this);
        mlista.setAdapter(adap);
    }

    @Override
    public void onError(AIError error) {

    }

    @Override
    public void onAudioLevel(float level) {

    }

    @Override
    public void onListeningStarted() {

    }

    @Override
    public void onListeningCanceled() {

    }

    @Override
    public void onListeningFinished() {

    }
}
