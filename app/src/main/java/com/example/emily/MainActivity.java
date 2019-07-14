package com.example.emily;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    ViewGroup container;
    ProgressBar progressBar;
    Button  first_3, first_4, first_7, first_8;                      //https://www.youtube.com/watch?v=JAdHKPGlxvQ&t=334s
    SimpleDateFormat format1 = new SimpleDateFormat("a hh시 mm분");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.main);
        LinearLayout relate = findViewById(R.id.scroll);

        final ScrollView realscroll = findViewById(R.id.realscroll);
        realscroll.post(new Runnable() {
            @Override
            public void run() {
                realscroll.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });



        Handler delayHandler = new Handler();
        delayHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                RelativeLayout relative = findViewById(R.id.main_first);
                relative.setVisibility(VISIBLE);
            }
        }, 1000);

//        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(4000);
//        animationDrawable.start();

        first_3 = findViewById(R.id.first_3);
        first_4 = findViewById(R.id.first_4);
        first_7 = findViewById(R.id.first_7);
        first_8 = findViewById(R.id.first_8);

        first_3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {                                                      //학식 고르기
                RelativeLayout layout31 = findViewById(R.id.main_second);                           //고객 답변 적기
                layout31.setVisibility(VISIBLE);

                TextView request31 = (TextView) layout31.findViewById(R.id.request);
                request31.setText("오늘 학식은 뭐야?");

                TextView time31 = (TextView) layout31.findViewById(R.id.time);
                setTime(time31);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout32 = findViewById(R.id.main_third);                    //Emily 답변 적기
                        layout32.setVisibility(VISIBLE);

                        TextView text232 = (TextView) layout32.findViewById(R.id.text3);
                        text232.setText("해당 식당을 골라주세요!");

                        TextView el = layout32.findViewById(R.id.time4);
                        setTime(el);

                        Button button432 = layout32.findViewById(R.id.button4);
                        button432.setText("카이마루");
                        button432.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                RelativeLayout layout331 = findViewById(R.id.main_fourth);
                                layout331.setVisibility(VISIBLE);

                                TextView request331 = (TextView) layout331.findViewById(R.id.request2);
                                request331.setText("카이마루 알려줘");

                                TextView text331 = (TextView) layout331.findViewById(R.id.time2);
                                setTime(text331);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        RelativeLayout layout3311 = findViewById(R.id.main_fifth);
                                        layout3311.setVisibility(VISIBLE);

                                        TextView textView3311 = layout3311.findViewById(R.id.request1);
                                        textView3311.setText("오늘 조식은 ~~~~, 중식은 ~~~~~ , 후식은 ~~~~입니다.");

                                        TextView time23311 = layout3311.findViewById(R.id.time1);
                                        setTime(time23311);
                                            Handler delayHandler = new Handler();
                                            delayHandler.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    RelativeLayout layout34 = findViewById(R.id.main_sixth);
                                                    layout34.setVisibility(VISIBLE);

                                                    TextView textView314 = layout34.findViewById(R.id.request3);
                                                    textView314.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                                    TextView tex2t = layout34.findViewById(R.id.time3);
                                                    setTime(tex2t);
                                                    layout34.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View view) {
                                                            Intent intent = new Intent(getApplicationContext(),chat.class);
                                                            startActivity(intent);
                                                        }
                                                    });
                                                }
                                            }, 300);

                                    }
                                }, 500);

                            }
                        });


                        Button button2 = layout32.findViewById(R.id.button5);
                        button2.setText("서맛골");
                        button2.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                RelativeLayout layout332 = findViewById(R.id.main_fourth);
                                layout332.setVisibility(VISIBLE);

                                TextView textview = (TextView) layout332.findViewById(R.id.request2);
                                textview.setText("서맛골 알려줘");

                                TextView textview2 = (TextView) layout332.findViewById(R.id.time2);
                                setTime(textview2);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        RelativeLayout layout3321 = findViewById(R.id.main_fifth);
                                        layout3321.setVisibility(VISIBLE);

                                        TextView textView3311 = layout3321.findViewById(R.id.request1);
                                        textView3311.setText("오늘 조식은 ~~~~, 중식은 ~~~~~ , 후식은 ~~~~입니다.");

                                        TextView textview = layout3321.findViewById(R.id.time1);
                                        setTime(textview);
                                        Handler delayHandler = new Handler();
                                        delayHandler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                RelativeLayout layout35 = findViewById(R.id.main_sixth);
                                                layout35.setVisibility(VISIBLE);

                                                TextView textVi1ew33244 = layout35.findViewById(R.id.request3);
                                                textVi1ew33244.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                                TextView tex13t = layout35.findViewById(R.id.time3);
                                                setTime(tex13t);
                                                layout35.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(getApplicationContext(),chat.class);
                                                        startActivity(intent);
                                                    }
                                                });
                                            }
                                        }, 300);

                                    }
                                }, 2000);
                            }
                        });
                        Button button3 = layout32.findViewById(R.id.button6);
                        button3.setText("동맛골");
                        button3.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                RelativeLayout layout333 = findViewById(R.id.main_fourth);
                                layout333.setVisibility(VISIBLE);

                                TextView textview = (TextView) layout333.findViewById(R.id.request2);
                                textview.setText("동맛골 알려줘");

                                TextView textview2 = (TextView) layout333.findViewById(R.id.time2);
                                setTime(textview2);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        RelativeLayout layout3331 = findViewById(R.id.main_fifth);
                                        layout3331.setVisibility(VISIBLE);

                                        TextView textView3311 = layout3331.findViewById(R.id.request1);
                                        textView3311.setText("오늘 조식은 ~~~~, 중식은 ~~~~~ , 후식은 ~~~~입니다.");

                                        TextView textview = layout3331.findViewById(R.id.time1);
                                        setTime(textview);
                                        Handler delayHandler = new Handler();
                                        delayHandler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                RelativeLayout layout324 = findViewById(R.id.main_sixth);
                                                layout324.setVisibility(VISIBLE);

                                                TextView textView3214 = layout324.findViewById(R.id.request3);
                                                textView3214.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                                TextView tdext = layout324.findViewById(R.id.time3);
                                                setTime(tdext);
                                                layout324.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(getApplicationContext(),chat.class);
                                                        startActivity(intent);
                                                    }
                                                });
                                            }
                                        }, 300);


                                    }
                                }, 2000);
                            }
                        });
                        Button button4 = layout32.findViewById(R.id.button7);
                        button4.setText("교수회관");
                        button4.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                RelativeLayout layout334 = findViewById(R.id.main_fourth);
                                layout334.setVisibility(VISIBLE);

                                TextView textview = (TextView) layout334.findViewById(R.id.request2);
                                textview.setText("교수회관 알려줘");

                                TextView textview2 = (TextView) layout334.findViewById(R.id.time2);
                                setTime(textview2);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        RelativeLayout layout3341 = findViewById(R.id.main_fifth);
                                        layout3341.setVisibility(VISIBLE);

                                        TextView textView3311 = layout3341.findViewById(R.id.request1);
                                        textView3311.setText("오늘 조식은 ~~~~, 중식은 ~~~~~ , 후식은 ~~~~입니다.");

                                        TextView textview = layout3341.findViewById(R.id.time1);
                                        setTime(textview);
                                        Handler delayHandler = new Handler();
                                        delayHandler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                RelativeLayout layout38 = findViewById(R.id.main_sixth);
                                                layout38.setVisibility(VISIBLE);

                                                TextView textVie32w34 = layout38.findViewById(R.id.request3);
                                                textVie32w34.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                                TextView tex15t = layout38.findViewById(R.id.time3);
                                                setTime(tex15t);
                                                layout38.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(getApplicationContext(),chat.class);
                                                        startActivity(intent);
                                                    }
                                                });
                                            }
                                        }, 300);

                                    }
                                }, 2000);
                            }
                        });
                    }
                }, 1000);
            }
        });

        first_4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(final View view) {
                RelativeLayout layout41 = findViewById(R.id.main_second);
                layout41.setVisibility(VISIBLE);

                TextView textview = (TextView) layout41.findViewById(R.id.request);
                textview.setText("사이트 바로 연결해줘");

                TextView textview2 = (TextView) layout41.findViewById(R.id.time);
                setTime(textview2);

                Handler delayHandler = new Handler();
                delayHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        RelativeLayout layout42 = findViewById(R.id.main_third);
                        layout42.setVisibility(VISIBLE);

                        TextView textview = (TextView) layout42.findViewById(R.id.text3);
                        textview.setText("어떤 사이트로 접속하고 싶으신가요?\n밑 선택지 중에서 골라주세요!");

                        TextView textview2 = (TextView) layout42.findViewById(R.id.time4);
                        setTime(textview2);

                        Button button = layout42.findViewById(R.id.button4);
                        button.setText("카대전");
                        button.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                RelativeLayout relative = findViewById(R.id.main_fourth);
                                relative.setVisibility(VISIBLE);

                                TextView text3113 = relative.findViewById(R.id.request2);
                                text3113.setText("카대전 접속");

                                TextView kjkl = relative.findViewById(R.id.time2);
                                setTime(kjkl);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        RelativeLayout layout = findViewById(R.id.main_fifth);
                                        layout.setVisibility(VISIBLE);

                                        TextView ew = layout.findViewById(R.id.request1);
                                        TextView re = layout.findViewById(R.id.time1);

                                        ew.setText("카대전으로 접속합니다.");
                                        setTime(re);

                                        Handler delayhand = new Handler();
                                        delayhand.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                RelativeLayout layout31118 = findViewById(R.id.main_sixth);
                                                layout31118.setVisibility(VISIBLE);

                                                TextView text11View34 = layout31118.findViewById(R.id.request3);
                                                text11View34.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                                TextView text3432 = layout31118.findViewById(R.id.time3);
                                                setTime(text3432);
                                                layout31118.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(getApplicationContext(),chat.class);
                                                        startActivity(intent);
                                                    }
                                                });

                                                Handler delayHandler = new Handler();
                                                delayHandler.postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        Uri uri = Uri.parse("https://www.facebook.com/KaDaejeon/");
                                                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                        startActivity(intent);
                                                    }
                                                }, 1000);
                                            }
                                        },300);
                                    }
                                },500);
                            }
                        });
                        Button button2 = layout42.findViewById(R.id.button5);
                        button2.setText("학사요람");
                        button2.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                RelativeLayout relative2 = findViewById(R.id.main_fourth);
                                relative2.setVisibility(VISIBLE);

                                TextView text3113 = relative2.findViewById(R.id.request2);
                                text3113.setText("학사요람 접속");

                                TextView rea2l = relative2.findViewById(R.id.time2);
                                setTime(rea2l);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        RelativeLayout le = findViewById(R.id.main_fifth);
                                        le.setVisibility(VISIBLE);

                                        TextView e1w = le.findViewById(R.id.request1);
                                        TextView r2e = le.findViewById(R.id.time1);

                                        e1w.setText("카대전으로 접속합니다.");
                                        setTime(r2e);

                                        Handler hand = new Handler();
                                        hand.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                RelativeLayout layout31128 = findViewById(R.id.main_sixth);
                                                layout31128.setVisibility(VISIBLE);

                                                TextView textV11iew34 = layout31128.findViewById(R.id.request3);
                                                textV11iew34.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                                TextView t13ext = layout31128.findViewById(R.id.time3);
                                                setTime(t13ext);
                                                layout31128.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(getApplicationContext(),chat.class);
                                                        startActivity(intent);
                                                    }
                                                });

                                                Handler delayHandler = new Handler();
                                                delayHandler.postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        Uri uri = Uri.parse("http://bulletin.kaist.ac.kr/html/kr/#link");
                                                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                        startActivity(intent);
                                                    }
                                                }, 1000);
                                            }
                                        }, 300);


                                    }
                                },500);
                            }
                        });
                        Button button3 = layout42.findViewById(R.id.button6);
                        button3.setText("도서관");
                        button3.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                RelativeLayout relative3 = findViewById(R.id.main_fourth);
                                relative3.setVisibility(VISIBLE);

                                TextView text3113 = relative3.findViewById(R.id.request2);
                                text3113.setText("도서관 접속");

                                TextView e = relative3.findViewById(R.id.time2);
                                setTime(e);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        RelativeLayout layout312118 = findViewById(R.id.main_sixth);
                                        layout312118.setVisibility(VISIBLE);

                                        TextView textV342iew34 = layout312118.findViewById(R.id.request3);
                                        textV342iew34.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                        TextView t64ext = layout312118.findViewById(R.id.time3);
                                        setTime(t64ext);
                                        layout312118.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent = new Intent(view.getContext(),chat.class);
                                                startActivity(intent);
                                            }
                                        });

                                        Handler delayHandler = new Handler();
                                        delayHandler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                Uri uri = Uri.parse("https://library.kaist.ac.kr/main.do");
                                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                startActivity(intent);
                                            }
                                        }, 1000);

                                    }
                                },500);

                            }
                        });
                        Button button4 = layout42.findViewById(R.id.button7);
                        button4.setText("학사공지사항");
                        button4.setOnClickListener(new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                RelativeLayout relative4 = findViewById(R.id.main_fourth);
                                relative4.setVisibility(VISIBLE);

                                TextView text31123 = relative4.findViewById(R.id.request2);
                                text31123.setText("학사 공지사항 접속");

                                TextView a= relative4.findViewById(R.id.time2);
                                setTime(a);

                                Handler delayHandler = new Handler();
                                delayHandler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        RelativeLayout lay = findViewById(R.id.main_fifth);
                                        lay.setVisibility(VISIBLE);

                                        TextView ke = lay.findViewById(R.id.request1);
                                        ke.setText("공지사항 접속하겠습니다.");

                                        TextView timetime = lay.findViewById(R.id.time1);
                                        setTime(timetime);

                                        Handler he = new Handler();
                                        he.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                RelativeLayout layout3121218 = findViewById(R.id.main_sixth);
                                                layout3121218.setVisibility(VISIBLE);

                                                TextView textView3324 = layout3121218.findViewById(R.id.request3);
                                                textView3324.setText("이외에 더 질문할 것이 더 있으면 이 톡을 눌러 Emily와 대화해보세요!");

                                                TextView text234 = layout3121218.findViewById(R.id.time3);
                                                setTime(text234);
                                                layout3121218.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(view.getContext(),chat.class);
                                                        startActivity(intent);
                                                    }
                                                });

                                                Handler delayHandler = new Handler();
                                                delayHandler.postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        Uri uri = Uri.parse("https://www.kaist.ac.kr/_prog/_board/?code=kaist_student&site_dvs_cd=kr&menu_dvs_cd=0603");
                                                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                        startActivity(intent);
                                                    }
                                                }, 1000);
                                            }
                                        },300);

                                    }
                                },500);
                            }
                        });
                    }
                }, 1000);

            }
        });

        first_7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout layout = findViewById(R.id.main_second);
                layout.setVisibility(VISIBLE);

            }
        });

        first_8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chat.class);
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
