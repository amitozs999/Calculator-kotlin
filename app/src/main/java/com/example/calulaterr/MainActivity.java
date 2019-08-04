package com.example.calulaterr;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusclicked(View view) {

        TextView operator = (TextView) findViewById(R.id.textView3);
        operator.setTextColor(Color.WHITE);
        operator.setBackgroundColor(Color.MAGENTA);
        operator.setText("+");



    }



    public void multilpyclicked(View view) {
        TextView operator = (TextView) findViewById(R.id.textView3);
        operator.setTextColor(Color.WHITE);
        operator.setBackgroundColor(Color.BLUE);
        operator.setText("*");
    }

    public void divideclicked(View view) {
        TextView operator = (TextView) findViewById(R.id.textView3);
        operator.setTextColor(Color.YELLOW);
        operator.setBackgroundColor(Color.BLACK);
        operator.setText("/");
    }

    public void minusclicked(View view) {
        TextView operator = (TextView) findViewById(R.id.textView3);
        operator.setTextColor(Color.RED);
        operator.setBackgroundColor(Color.BLACK);
        operator.setText("-");
    }

    public void calculateclicked(View view) {

        EditText firstOperand = (EditText)findViewById(R.id.editText);
        EditText secondOperand = (EditText) findViewById(R.id.editText2);
        TextView operator = (TextView) findViewById(R.id.textView3);
        TextView result = (TextView) findViewById(R.id.textView2);

        String firstOperandString = firstOperand.getText().toString();
        String secondOperandString = secondOperand.getText().toString();
        String operatorString = operator.getText().toString();

        double firstOperandDouble = Double.parseDouble(firstOperandString);
        double secondOperandDouble = Double.parseDouble(secondOperandString);

        double value = 0.0;
        switch (operatorString)
        {
            case "/":
                value = firstOperandDouble / secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            case "*":
                value = firstOperandDouble * secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            case "-":
                value = firstOperandDouble - secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            case "+":
                value = firstOperandDouble + secondOperandDouble;
                result.setText(Double.toString(value));
                break;
            default:
                break;
        }

    }
}
