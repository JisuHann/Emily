package com.example.emily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {
    List<response_model> list_chat_models;
    Context context;

    LayoutInflater layoutInflater;

    public adapter(List<response_model> list_chat_models, Context context){
        this.list_chat_models = list_chat_models;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list_chat_models.size();
    }

    @Override
    public Object getItem(int i) {
        return list_chat_models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        if(view2 == null){
            if(list_chat_models.get(i).isSend){
                view2 = layoutInflater.inflate(R.layout.emily_text, null);
            }else{
                view2 = layoutInflater.inflate(R.layout.response, null);
            }
            TextView text_message = view.findViewById(R.id.request2);
            //text_message.setText(response_model.get(i).message);                                                                                                      https://www.youtube.com/watch?v=JAdHKPGlxvQ&t=334s
        }
        return view2;
    }
}
