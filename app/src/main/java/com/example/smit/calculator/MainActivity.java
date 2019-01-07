package com.example.smit.calculator;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,buttonAdd,buttonSub,buttonMulti,buttonDivision,clear,equal;
    EditText display;
    int value1,value2;
    boolean add,sub,div,multi;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        num3 =findViewById(R.id.num3);
        num4 =findViewById(R.id.num4);
        num5 =findViewById(R.id.num5);
        num6 =findViewById(R.id.num6);
        num7 =findViewById(R.id.num7);
        num8 =findViewById(R.id.num8);
        num9 =findViewById(R.id.num9);
        num0 =findViewById(R.id.num0);
        buttonAdd = findViewById(R.id.plus);
        buttonSub = findViewById(R.id.minus);
        buttonMulti = findViewById(R.id.multiplication);
        buttonDivision = findViewById(R.id.division);
        display = findViewById(R.id.display);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        display.setShowSoftInputOnFocus(false);
        display.setCursorVisible(false);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = display.length();
                if (display.length()==0)
                {
                    display.setText(display.getText());
                }
                else
                {
                    display.setText(display.getText() + "");
                }
                //display.setText(display.getText() );
            }
        });;


       buttonAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (display == null)
               {
                   display.setText("");
               }
               else
               {
                   value1 = Integer.parseInt(display.getText() + "");
                   add = true;
                   display.setText("");
               }
           }
       });

       buttonSub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               value1 = Integer.parseInt( display.getText() + "");
               sub = true;
               display.setText("");
           }
       });

       buttonMulti.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               value1 = Integer.parseInt(display.getText() + "");
               multi = true;
               display.setText("");
           }
       });

       buttonDivision.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               value1 = Integer.parseInt(display.getText() + "");
               div = true;
               display.setText("");
           }
       });

       equal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               value2 = Integer.parseInt(display.getText() + "");

               if(add == true)
               {
                   display.setText(value1+value2 + "");
                   add = false;
               }

               if(sub == true)
               {
                   display.setText(value1-value2 + "");
                   sub = false;
               }

               if(multi == true)
               {
                   display.setText(value1*value2 + "");
                   multi = false;

               }

               if (div == true)
               {
                   display.setText(value1/value2 + "");
                   div = false;
               }
           }
       }


       );
    }
}
