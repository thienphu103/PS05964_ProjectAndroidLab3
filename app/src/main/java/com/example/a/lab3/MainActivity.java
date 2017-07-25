package com.example.a.lab3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtN, txtP, txtRP, txtF, txtE, txtT;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;
Button btn,btnR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtN = (EditText) findViewById(R.id.txtName);
        txtP = (EditText) findViewById(R.id.txtPass);
        txtRP = (EditText) findViewById(R.id.txtRePass);
        txtF = (EditText) findViewById(R.id.txtFullName);
        txtE = (EditText) findViewById(R.id.txtEmail);
        txtT = (EditText) findViewById(R.id.txtTel);
        txt1=(TextView) findViewById(R.id.txtToast1);
        txt2=(TextView) findViewById(R.id.txtToast2);
        txt3=(TextView) findViewById(R.id.txtToast3);
        txt4=(TextView) findViewById(R.id.txtToast4);
        txt5=(TextView) findViewById(R.id.txtToast5);
        txt6=(TextView) findViewById(R.id.txtToast6);
        btn =(Button) findViewById(R.id.btnCheck);
        btnR =(Button) findViewById(R.id.btnReset);
        CheckForm();
    }

    public void CheckForm() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = txtN.getText().toString();
                String text2 = txtP.getText().toString();
                String text3 = txtRP.getText().toString();
                String text4 = txtF.getText().toString();
                String text5 = txtE.getText().toString().trim();
                String emailtest = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String teltest ="(\\+84|0)\\d{9,10}";
                String text6 = txtT.getText().toString();

                if (text1.equals("")) {
                    txt1.setText("Enter User. Please!!!");
                    txt1.setTextColor(Color.RED);
                    txtN.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txt1.setText("");
                            return false;
                        }
                    });
                }else if (!(text1.length()<13&&text1.length()>5)) {
                    txt1.setText("User must have at 6-12 characters");
                    txt1.setTextColor(Color.RED);
                    txtN.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txt1.setText("");
                            return false;
                        }
                    });

                } else {
                    txt1.setText("User Ok");
                    txt1.setTextColor(Color.GREEN);

                }

                if (text2.equals("")||text2.length()<16&&text2.length()<7) {
                    txt2.setText("Pass must have at 8-15 characters");
                    txt2.setTextColor(Color.RED);
                    txtP.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txt2.setText("");
                            return false;
                        }
                    });
                } else {
                    txt2.setText("Password Ok");
                    txt2.setTextColor(Color.GREEN);
                }
                if (text3.equals("")||text3.length()<16&&text2.length()<7) {
                    txt3.setText("Pass must have at 8-15 characters");
                    txt3.setTextColor(Color.RED);
                    txtRP.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txt3.setText("");
                            return false;
                        }
                    });
                } else if (!text3.equalsIgnoreCase(text2)) {
                    txt3.setText("Does not match password.");
                    txt3.setTextColor(Color.RED);
                    txtRP.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txt3.setText("");
                            return false;
                        }
                    });
                }else {
                    txt3.setText("Password Ok");
                    txt3.setTextColor(Color.GREEN);
                }

                if (text4.equals("")) {
                    txt4.setText("Enter Full Name. Please!!!");
                    txt4.setTextColor(Color.RED);
                    txtF.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txt4.setText("");
                            return false;
                        }
                    });


                } else {
                    txt4.setText("Full Name Ok");
                    txt4.setTextColor(Color.GREEN);

                }

                if(!(text5.matches(emailtest))) {
                        txt5.setText("Email in invalid format!!!");
                        txt5.setTextColor(Color.RED);
                        txtE.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {
                                txt5.setText("");
                                return false;
                            }
                    });

                } else {
                    txt5.setText("Email Ok");
                    txt5.setTextColor(Color.GREEN);

                }

                if (!(text6.matches(teltest))) {
                    txt6.setText("Tel in invalid format!!!");
                    txt6.setTextColor(Color.RED);
                    txtT.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txt6.setText("");
                            return false;
                        }
                    });

                } else {
                    txt6.setText("Tel Ok");
                    txt6.setTextColor(Color.GREEN);

                }
                btnR.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtN.setText("");
                        txtP.setText("");
                        txtRP.setText("");
                        txtF.setText("");
                        txtE.setText("");
                        txtT.setText("");
                        txt1.setText("");
                        txt2.setText("");
                        txt3.setText("");
                        txt4.setText("");
                        txt5.setText("");
                        txt6.setText("");

                    }
                });


            }
        });
    }
}




