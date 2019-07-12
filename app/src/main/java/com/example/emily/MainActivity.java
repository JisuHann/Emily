package com.example.emily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.zip.Inflater;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    ViewGroup container;
    ProgressBar progressBar;
    Button first_1, first_2, first_3, first_4, first_5, first_6, first_7, first_8;                      //https://www.youtube.com/watch?v=JAdHKPGlxvQ&t=334s
    SimpleDateFormat format1 = new SimpleDateFormat("a hh시 mm분");
    List<response_model> list_model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.main);
        RelativeLayout relate = findViewById(R.id.scroll);

//        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(4000);
//        animationDrawable.start();

        first_1 = findViewById(R.id.first_1);
        first_2 = findViewById(R.id.first_2);
        first_3 = findViewById(R.id.first_3);
        first_4 = findViewById(R.id.first_4);
        first_5 = findViewById(R.id.first_5);
        first_6= findViewById(R.id.first_6);
        first_7 = findViewById(R.id.first_7);
        first_8 = findViewById(R.id.first_8);

        first_1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout layout = findViewById(R.id.main_second);
                layout.setVisibility(VISIBLE);

                TextView textview = (TextView) layout.findViewById(R.id.request);
                textview.setText("위치 검색해줘");

                TextView textview2 = (TextView) layout.findViewById(R.id.time);
                setTime(textview2);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout2 = findViewById(R.id.main_third);
                        layout2.setVisibility(VISIBLE);

                        TextView textview = (TextView) layout2.findViewById(R.id.request2);
                        textview.setText("어떤 기관 위치를 찾고 싶으신지 적어주세요! 구글맵 지도로 찍어드리겠습니다.\nex)태울관");

                        TextView textview2 = (TextView) layout2.findViewById(R.id.time2);
                        setTime(textview2);                                                                                                                         //대답 받고 구글 지도 api로 연결
                    }
                }, 2000);
            }
        });

        first_2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout layout3 = findViewById(R.id.main_second);
                layout3.setVisibility(VISIBLE);

                TextView textview = (TextView) layout3.findViewById(R.id.request);
                textview.setText("연락처 검색해줘");

                TextView textview2 = (TextView) layout3.findViewById(R.id.time);
                setTime(textview2);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout2 = findViewById(R.id.main_third);
                        layout2.setVisibility(VISIBLE);                                                                                                   //연결                                                            //

                    }
                }, 2000);
            }
        });

        first_3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout layout = findViewById(R.id.main_second);
                layout.setVisibility(VISIBLE);

                TextView textview = (TextView) layout.findViewById(R.id.request);
                textview.setText("오늘 학식은 뭐야?");

                TextView textview2 = (TextView) layout.findViewById(R.id.time);
                setTime(textview2);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout2 = findViewById(R.id.main_third);
                        layout2.setVisibility(VISIBLE);

                        TextView textview = (TextView) layout2.findViewById(R.id.text2);
                        textview.setText("해당 식당을 골라주세요!");
                        Button button = findViewById(R.id.button4);
                        button.setText("카이마루");
                        button.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                RelativeLayout layout = findViewById(R.id.main_fourth);
                                layout.setVisibility(VISIBLE);

                                TextView textview = (TextView) layout.findViewById(R.id.request);
                                textview.setText("카이마루 알려줘");

                                Date time = new Date();
                                String time2 = format1.format(time);
                                TextView textview2 = (TextView) layout.findViewById(R.id.time);
                                textview2.setText(time2);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                    }
                                }, 2000);

                            }
                        });
                        Button button2 = findViewById(R.id.button5);
                        button2.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            }
                        });
                        Button button3 = findViewById(R.id.button6);
                        button3.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            }
                        });
                        Button button4 = findViewById(R.id.button7);
                        button4.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            }
                        });
                    }
                }, 1000);
            }
        });

        first_4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(final View view) {
                RelativeLayout layout = findViewById(R.id.main_second);
                layout.setVisibility(VISIBLE);

                TextView textview = (TextView) layout.findViewById(R.id.request);
                textview.setText("사이트 바로 연결해줘");

                TextView textview2 = (TextView) layout.findViewById(R.id.time);
                setTime(textview2);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout2 = findViewById(R.id.main_third);
                        layout2.setVisibility(VISIBLE);

                        TextView textview = (TextView) layout2.findViewById(R.id.request2);
                        textview.setText("어떤 사이트로 접속하고 싶으신가요?\n밑 선택지 중에서 골라주세요!");

                        TextView textview2 = (TextView) layout2.findViewById(R.id.time2);
                        setTime(textview2);

                        Button button = findViewById(R.id.button4);
                        button.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Uri uri = Uri.parse("https://www.facebook.com/KaDaejeon/");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                            }
                        });
                        Button button2 = findViewById(R.id.button5);
                        button2.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Uri uri = Uri.parse("http://bulletin.kaist.ac.kr/html/kr/#link");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                            }
                        });
                        Button button3 = findViewById(R.id.button6);
                        button3.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Uri uri = Uri.parse("https://library.kaist.ac.kr/main.do");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                            }
                        });
                        Button button4 = findViewById(R.id.button7);
                        button4.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Uri uri = Uri.parse("https://www.kaist.ac.kr/_prog/_board/?code=kaist_student&site_dvs_cd=kr&menu_dvs_cd=0603");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                            }
                        });
                    }
                }, 1000);

            }
        });

        first_5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout layout = findViewById(R.id.main_second);
                layout.setVisibility(VISIBLE);

                TextView textview = (TextView) layout.findViewById(R.id.request);
                textview.setText("학사 일정 검색해줘");

                TextView textview2 = (TextView) layout.findViewById(R.id.time);
                setTime(textview2);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout2 = findViewById(R.id.main_third);
                        layout2.setVisibility(VISIBLE);

                        TextView textview = (TextView) layout2.findViewById(R.id.request2);
                        textview.setText("어떤 행사를 찾고 싶으신지 적어주세요! \nex)가을학기수강신청(띄어쓰기 빼주세요.)");

                        TextView textview2 = (TextView) layout2.findViewById(R.id.time4);
                        setTime(textview2);
                    }
                }, 2000);
            }
        });

        first_6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout layout = findViewById(R.id.main_second);
                layout.setVisibility(VISIBLE);

                TextView textview = (TextView) layout.findViewById(R.id.request);
                textview.setText("시설 정보 알고 싶어");

                TextView textview2 = (TextView) layout.findViewById(R.id.time);
                setTime(textview2);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout2 = findViewById(R.id.main_third);
                        layout2.setVisibility(VISIBLE);


                        TextView textview = (TextView) layout2.findViewById(R.id.request2);
                        textview.setText("어떤 기관을 찾고 싶으신지 적어주세요! \nex)N1");


                        TextView textview2 = (TextView) layout2.findViewById(R.id.time4);
                        setTime(textview2);

                        LinearLayout layout = findViewById(R.id.main_send_message);
                        layout.setVisibility(VISIBLE);
                        FloatingActionButton btn_send_message = findViewById(R.id.keyboard1);
                        final EditText editText = findViewById(R.id.user_message1);
                        editText.setOnKeyListener(new View.OnKeyListener() {
                            @Override
                            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                                if((keyEvent.getAction() == KeyEvent.ACTION_DOWN)&& (i == KeyEvent.KEYCODE_ENTER)){
                                    String text = editText.getText().toString();
                                    //대답 적용
                                    return true;
                                }
                                return false;
                            }
                        });

                    }
                }, 2000);
            }
        });

        first_7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout layout = findViewById(R.id.main_second);
                layout.setVisibility(VISIBLE);
//
//                TextView textview = (TextView) layout.findViewById(R.id.request);
//                textview.setText("");
//
//                TextView textview2 = (TextView) v.findViewById(R.id.time);
//                setTime(textview2);
            }
        });

        first_8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),chat.class);
                startActivity(intent);
            }
        });

    }


    public void setTime(TextView textView){
        Date time = new Date();
        String time2 = format1.format(time);
        textView.setText(time2);
    }
}
