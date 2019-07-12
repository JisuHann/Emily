package com.example.emily;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


                                                                                                                                            //https://www.youtube.com/watch?v=JAdHKPGlxvQ&t=334s
public class chat extends AppCompatActivity {
    ListView listView;
    EditText editText;
    List<response_model> list_chat = new ArrayList<>();
    FloatingActionButton btn_send_message;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        listView = (ListView) findViewById(R.id.list_of_message);
        editText = (EditText) findViewById(R.id.user_message);
        btn_send_message = (FloatingActionButton) findViewById(R.id.keyboard);

        btn_send_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                response_model model = new response_model(text, true);
//                list_chat add(model);
            }
        });


    }
}
