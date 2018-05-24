package com.moremoregreen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etResult;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnPlus, btnSubtract, btnMultiply, btnDivide, btnDot, btnClear, btnPercent, btnPAS, btnBack, btnEqual;
    private TextView tvHistory, tvFour, tvAfter;
    private String et_Pre, et_After;
    private String flag = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        final String et_Resutlt = etResult.getText().toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(et_Resutlt);
        final StringBuilder sb2 = new StringBuilder();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("0");
                etResult.setText(sb);
                clean();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("1");
                etResult.setText(sb);
                clean();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("2");
                etResult.setText(sb);
                clean();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("3");
                etResult.setText(sb);
                clean();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("4");
                etResult.setText(sb);
                clean();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("5");
                etResult.setText(sb);
                clean();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("6");
                etResult.setText(sb);
                clean();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("7");
                etResult.setText(sb);
                clean();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("8");
                etResult.setText(sb);
                clean();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("9");
                etResult.setText(sb);
                clean();
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arithmetic(sb2, sb);
                tvFour.setText("＋");
                flag = "Plus";
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arithmetic(sb2, sb);
                tvFour.setText("－");
                flag = "Subtract";
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arithmetic(sb2, sb);
                tvFour.setText("×");
                flag = "Multiply";
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arithmetic(sb2, sb);
                tvFour.setText("÷");
                flag = "Divide";
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText("0");
                sb.delete(0, sb.length());
                sb2.delete(0, sb2.length());
                tvFour.setText("");
                tvHistory.setText("");
                tvAfter.setText("");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(".");
                etResult.setText(sb);
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnPAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.delete(sb.length() - 1, sb.length());
                etResult.setText(sb);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_After = etResult.getText().toString();
                double pre = 0, after = 0, sum = 0;
                if (flag.equals("Plus")) {
                    pre = Integer.valueOf(sb2.toString());
                    after = Integer.valueOf(et_After);
                    sum = pre + after;

                } else if (flag.equals("Subtract")) {
                    pre = Integer.valueOf(sb2.toString());
                    after = Integer.valueOf(et_After);
                    sum = pre - after;

                } else if (flag.equals("Multiply")) {
                    pre = Integer.valueOf(sb2.toString());
                    after = Integer.valueOf(et_After);
                    sum = pre * after;

                } else {
                    pre = Integer.valueOf(sb2.toString());
                    after = Integer.valueOf(et_After);
                    sum = pre / after;

                }
                etResult.setText(String.valueOf(sum));
                tvAfter.setText(et_After);
                flag = "sum";
                sb.delete(0, sb.length());
                sb2.delete(0, sb2.length());

            }
        });
    }

    private void clean() {
        if(flag.equals("sum")){
            tvAfter.setText("");
            tvFour.setText("");
            tvHistory.setText("");
        }
    }

    private void Arithmetic(StringBuilder sb2, StringBuilder sb) {
        et_Pre = etResult.getText().toString();
        sb2.append(et_Pre);
        sb.delete(0, sb.length());
        etResult.setText("");
        tvHistory.setText(String.valueOf(sb2));
    }

    private void findViews() {
        etResult = findViewById(R.id.etResult);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnDot = findViewById(R.id.btnDot);
        btnClear = findViewById(R.id.btnClear);
        btnPercent = findViewById(R.id.btnPercent);
        btnPAS = findViewById(R.id.btnPAS);
        btnBack = findViewById(R.id.btnBack);
        btnEqual = findViewById(R.id.btnEqual);
        tvHistory = findViewById(R.id.tvHistory);
        tvFour = findViewById(R.id.tvFour);
        tvAfter = findViewById(R.id.tvAfter);
    }
}
