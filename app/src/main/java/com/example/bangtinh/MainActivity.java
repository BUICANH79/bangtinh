package com.example.bangtinh;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button  exit;
    Button b0;
    Button reset;
    Button Cal;
    RadioButton cong;
    RadioButton tru;
    RadioButton nhan;
    RadioButton chia;
    EditText exita;
    EditText exitb;
    boolean flag = false;
    String a, b;
    TextView txtHt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = "";
        b = "";
        exit = (Button) findViewById(R.id.exit);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        reset = (Button) findViewById(R.id.reset);
        b9 = (Button) findViewById(R.id.b9);
        Cal = (Button) findViewById(R.id.Cal);
        cong = (RadioButton) findViewById(R.id.cong);
        tru = (RadioButton) findViewById(R.id.tru);
        nhan = (RadioButton) findViewById(R.id.nhan);
        chia = (RadioButton) findViewById(R.id.chia);
        exita = (EditText) findViewById(R.id.exita);
        txtHt  = (TextView) findViewById(R.id.txtHt);
        exitb = (EditText) findViewById(R.id.exitb);
        exita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
            }
        });

        exita.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = true;
                }
            }
        });

        exitb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
            }
        });

        exitb.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = false;
                }
            }
        });
    }


    public void so1(View v) {
        if (flag) {
            a += b1.getText().toString();
            exita.setText(a);
        } else {
            b += b1.getText().toString();
            exitb.setText(b);
        }
    }

    public void so2(View v) {
        if (flag) {
            a += b2.getText().toString();
            exita.setText(a);
        } else {
            b += b2.getText().toString();
            exitb.setText(b);
        }
    }

    public void so3(View v) {
        if (flag) {
            a += b3.getText().toString();
            exita.setText(a);
        } else {
            b += b3.getText().toString();
            exitb.setText(b);
        }
    }

    public void so4(View v) {
        if (flag) {
            a += b4.getText().toString();
            exita.setText(a);
        } else {
            b += b4.getText().toString();
            exitb.setText(b);
        }
    }

    public void so5(View v) {
        if (flag) {
            a += b5.getText().toString();
            exita.setText(a);
        } else {
            b += b5.getText().toString();
            exitb.setText(b);
        }
    }

    public void so6(View v) {
        if (flag) {
            a += b6.getText().toString();
            exita.setText(a);
        } else {
            b += b6.getText().toString();
            exitb.setText(b);
        }
    }

    public void so7(View v) {
        if (flag) {
            a += b7.getText().toString();
            exita.setText(a);
        } else {
            b += b7.getText().toString();
            exitb.setText(b);
        }
    }

    public void so8(View v) {
        if (flag) {
            a += b8.getText().toString();
            exita.setText(a);
        } else {
            b += b8.getText().toString();
            exitb.setText(b);
        }
    }

    public void so9(View v) {
        if (flag) {
            a += b9.getText().toString();
            exita.setText(a);
        } else {
            b += b9.getText().toString();
            exitb.setText(b);
        }
    }

    public void so0(View v) {
        if (flag) {
            a += b0.getText().toString();
            exita.setText(a);
        } else {
            b += b0.getText().toString();
            exitb.setText(b);
        }
    }

    public void display(View v) {
        Double a = Double.parseDouble(exita.getText().toString());
        Double b = Double.parseDouble(exitb.getText().toString());
        Double s;
        if (cong.isChecked() == true)
            s = a + b;
        else if (tru.isChecked() == true)
            s = a - b;
        else if (nhan.isChecked() == true)
            s = a * b;
        else
            s = a / b;
        txtHt.setText(String.valueOf(s));
    }

    public void reset(View view) {
        a = "";
        b = "";
        exita.setText("");
        exitb.setText("");
    }


    public void exit(View view) {
        System.exit(0);
    }
}




