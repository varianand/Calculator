package com.helloworld.calculator;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn20;
    TextView tv1;
    String firstval;
    int num1;
    Boolean add_func = false, multiply_func = false, sub_func = false, divide_func = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn20.setOnClickListener(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num;
                num = (Integer.parseInt(tv1.getText().toString()));
                int num1 = num / 10;
                tv1.setText(num1 + "");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "7");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "8");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "9");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "4");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "5");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "6");
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "1");
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "2");
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "3");
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + "0");
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString() + ".");
            }
        });
    }

    private void initialize() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        btn18 = (Button) findViewById(R.id.btn18);
        btn20 = (Button) findViewById(R.id.btn20);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn12:
                firstval = tv1.getText().toString();
                add_func = true;
                sub_func = false;
                multiply_func = false;
                divide_func = false;
                tv1.setText("");
                break;
            case R.id.btn2:
                firstval = tv1.getText().toString();
                add_func = false;
                sub_func = false;
                multiply_func = false;
                divide_func = true;
                tv1.setText("");
                break;
            case R.id.btn3:
                firstval = tv1.getText().toString();
                add_func = false;
                sub_func = false;
                multiply_func = true;
                divide_func = false;
                tv1.setText("");
                break;
            case R.id.btn8:
                firstval = tv1.getText().toString();
                sub_func = true;
                add_func = false;
                multiply_func = false;
                divide_func = false;
                tv1.setText("");
                break;
            case R.id.btn20:
                if (add_func == true) {
                    tv1.setText(Integer.parseInt(firstval) + Integer.parseInt(tv1.getText().toString()) + "");
                } else if (sub_func == true) {
                    tv1.setText(Integer.parseInt(firstval) - Integer.parseInt(tv1.getText().toString()) + "");
                } else if (multiply_func == true) {
                    tv1.setText(Integer.parseInt(firstval) * Integer.parseInt(tv1.getText().toString()) + "");
                } else if (divide_func == true) {
                    tv1.setText(Integer.parseInt(firstval) / Integer.parseInt(tv1.getText().toString()) + "");
                }

        }
    }
}
 /*  private String add(String val1, String val2)
   {
   val1 = firstval;
   tv1.setText(Integer.parseInt(firstval)+Integer.parseInt(tv1.getText().toString()) + "");

//}
private String sub(String val1, String val2)
{
    val1=firstval;
    tv1.setText(Integer.parseInt(firstval)-Integer.parseInt(tv1.getText().toString()) + "");

//}
    private String multiply(String val1, String val2)
    {
        val1 = firstval;
        tv1.setText(Integer.parseInt(firstval)*Integer.parseInt(tv1.getText().toString()) + "");

//}
*/