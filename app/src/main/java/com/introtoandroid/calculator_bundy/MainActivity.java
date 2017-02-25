package com.introtoandroid.calculator_bundy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView operation;

    String txt = "";
    String pt1;
    String op = "";
    String pt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView3);
        operation = (TextView) findViewById(R.id.operation);


    }

    public void zero(View view) {
        txt += "0";
        tv.setText(txt);
    }

    public void one(View view){
        txt += "1";
        tv.setText(txt);
    }

    public void two(View view){
        txt += "2";
        tv.setText(txt);
    }

    public void three(View view){
        txt += "3";
        tv.setText(txt);
    }

    public void four(View view){
        txt += "4";
        tv.setText(txt);
    }

    public void five(View view){
        txt += "5";
        tv.setText(txt);
    }

    public void six(View view){
        txt += "6";
        tv.setText(txt);
    }

    public void seven(View view){
        txt += "7";
        tv.setText(txt);
    }

    public void eight(View view){
        txt += "8";
        tv.setText(txt);
    }

    public void nine(View view){
        txt += "9";
        tv.setText(txt);
    }

    public void point(View view){
        txt += ".";
        tv.setText(txt);
    }



    public void c(View view){
        txt = "";
        tv.setText(txt);
    }

    public void add(View view){
        String old = tv.getText().toString();
        //int oldNum = Integer.parseInt(old);

        pt1 = old;

        op = "+";
        operation.setText(op);

        //tv.setText(txt);
        txt = "";
    }

    public void sub(View view){
        pt1 = tv.getText().toString();

        op = "-";
        operation.setText(op);

        //tv.setText(txt);
        txt = "";
    }

    public void mult(View view){
        pt1 = tv.getText().toString();

        op = "x";
        operation.setText(op);

        //tv.setText(txt);
        txt = "";
    }

    public void div(View view){
        pt1 = tv.getText().toString();

        op = "d";
        operation.setText(op);

        //tv.setText(txt);
        txt = "";
    }

    public void equal(View view){
        pt2 = tv.getText().toString();

        String whichOp = operation.getText().toString();

        String ans;

        int part1 = Integer.parseInt(pt1);
        int part2 = Integer.parseInt(pt2);

        if (whichOp.equals("+")){
            Integer answer = part1+part2;
            ans = answer.toString();
            tv.setText(ans);
        }

        else if (whichOp.equals("-")){
            Integer answer = part1-part2;
            ans = answer.toString();
            tv.setText(ans);
        }

        else if (whichOp.equals("x")){
            Integer answer = part1*part2;
            ans = answer.toString();
            tv.setText(ans);
        }

        else if (whichOp.equals("d")){
            Integer answer = part1/part2;
            ans = answer.toString();
            tv.setText(ans);
        }
    }
}
