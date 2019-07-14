package com.example.emily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapMessage extends BaseAdapter {
    List<response_model> lista;
    Context context;
    LayoutInflater inflater;

    public AdapMessage(List<response_model> lista, Context context) {
        this.lista = lista;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class holder{
        TextView bot_message;
        TextView client_message;
        ImageView bot;
        ImageView client;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = inflater.inflate(R.layout.chat_text_main, null);
        holder h = new holder();

        h.bot = (ImageView) v.findViewById(R.id.imageView2);
        h.client = (ImageView) v.findViewById(R.id.imageView);
        h.bot_message = (TextView) v.findViewById(R.id.request);
        h.client_message = (TextView) v.findViewById(R.id.request1);


        if(lista.get(i).tipo==1){
            h.bot_message.setText(lista.get(i).getMessage());
            h.client_message.setVisibility(View.GONE);
            h.client.setVisibility(View.GONE);
        }else{
            h.client_message.setText(lista.get(i).getMessage());
            h.bot_message.setVisibility(View.GONE);
            h.bot.setVisibility(View.GONE);
        }

        return v;
    }
}
