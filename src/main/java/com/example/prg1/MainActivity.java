package com.example.prg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    TextView tv_result;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            et1 = (EditText) findViewById(R.id.editTextNumber1);
            et2 = (EditText) findViewById(R.id.editTextNumber2);
            tv_result = (TextView) findViewById(R.id.textView_Result);

        }
        public void addition(View view) {
            double n1, n2,res;
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            res = n1+n2;
            String s = String.valueOf(res);
            tv_result.setText(s);
        }
        public void subtraction(View view) {
            double n1, n2,res;
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            res = n1-n2;
            String s = String.valueOf(res);
            tv_result.setText(s);
        }
        public void multiplication(View view) {
            double n1, n2,res;
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            res = n1*n2;
            String s = String.valueOf(res);
            tv_result.setText(s);
        }
        public void division(View view) {
            double n1, n2,res;
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            res = n1/n2;
            String s = String.valueOf(res);
            tv_result.setText(s);
        }



}