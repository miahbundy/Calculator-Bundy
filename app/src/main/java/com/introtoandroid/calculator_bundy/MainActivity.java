package com.introtoandroid.calculator_bundy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView operation;
    TextView past;
    TextView past2;
    TextView past3;
    TextView lastPast;


    String txt = "";
    String pt1= "";
    String op = "";
    String pt2="";
    String lastPressed = "";
    String pastOp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView3);
        operation = (TextView) findViewById(R.id.operation);
        operation.setText("");
        tv.setText(txt);

        past = (TextView)findViewById(R.id.textView6);
        past2 = (TextView)findViewById(R.id.textView4);
        past3 = (TextView)findViewById(R.id.tv8);
        lastPast = (TextView)findViewById(R.id.textView14);



        if(savedInstanceState!=null){
            pt1 = savedInstanceState.getString("inTV");
            op = savedInstanceState.getString("inOP");
        }


    }

    public void zero(View view) {
        txt += "0";
        tv.setText(txt);
        lastPressed = "num";
    }

    public void one(View view){
        txt += "1";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void two(View view){
        txt += "2";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void three(View view){
        txt += "3";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void four(View view){
        txt += "4";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void five(View view){
        txt += "5";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void six(View view){
        txt += "6";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void seven(View view){
        txt += "7";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void eight(View view){
        txt += "8";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void nine(View view){
        txt += "9";
        tv.setText(txt);
        lastPressed = "num";

    }

    public void point(View view){
        txt += ".";
        tv.setText(txt);
        lastPressed = "num";
    }

    public void ce(View view){
        txt = "";
        pt1 = "";
        pt2 = "";
        op = "";
        tv.setText(txt);
        operation.setText(op);
    }

    public void add(View view){
        lastPressed = "op";
        pt1 = tv.getText().toString();

        if(operation.getText().toString() == "") {
            op = "+";
            operation.setText(op);

            txt = "";
            //tv.setText(txt);
        }
        else{
            equal(view);
            op = "+";
            operation.setText(op);
            txt = "";
            //tv.setText(txt);
        }
    }

    public void sub(View view){
        lastPressed = "op";
        pt1 = tv.getText().toString();

        if(operation.getText().toString() == "") {

            op = "-";
            operation.setText(op);

            txt = "";
            //tv.setText(txt);

        }
        else{
            equal(view);
            op = "-";
            operation.setText(op);
            txt = "";
            //tv.setText(txt);

        }
    }

    public void mult(View view){
        lastPressed = "op";
        pt1 = tv.getText().toString();

        if(operation.getText().toString() == "") {

            op = "x";
            operation.setText(op);

            txt = "";
            //tv.setText(txt);

        }
        else{
            equal(view);
            op = "x";
            operation.setText(op);
            txt = "";
            //tv.setText(txt);

        }
    }

    public void div(View view) {
        lastPressed = "op";
        pt1 = tv.getText().toString();
        if(operation.getText().toString().equals("")) {

            op = "/";
            operation.setText(op);

            txt = "";
            //tv.setText(txt);

        }
        else{
            equal(view);
            op = "/";
            operation.setText(op);
            txt = "";
            //tv.setText(txt);


        }
    }

    public void posOrNeg(View view){
        lastPressed = "num";
        String input = tv.getText().toString();

        if (input == "" | input=="0"){}

        else {

            Double intInput = Double.parseDouble(input);

            intInput = -intInput;

            input = intInput.toString();

            tv.setText(input);
        }

    }

    public void equal(View view){


        if(operation.getText().toString() != "=") {

            String whichOp = operation.getText().toString();

            op = "=";
            operation.setText(op);

            pt2 = tv.getText().toString();

            String ans = "";

            if (whichOp== "") {

            }

            else {



                Double part1 = Double.parseDouble(pt1);
                Double part2 = Double.parseDouble(pt2);

                if (whichOp.equals("+")) {
                    Double answer = part1 + part2;
                    ans = answer.toString();
                    tv.setText(ans);
                }

                else if (whichOp.equals("-")) {
                    Double answer = part1 - part2;
                    ans = answer.toString();
                    tv.setText(ans);
                }

                else if (whichOp.equals("x")) {
                    Double answer = part1 * part2;
                    ans = answer.toString();
                    tv.setText(ans);
                }

                else if (whichOp.equals("/")) {
                    Double answer = part1 / part2;
                    ans = answer.toString();
                    tv.setText(ans);
                }
                if(past.getText().toString().equals("")){
                    pastOp = pt1+whichOp+pt2+"="+ans;
                    past.setText(pastOp);
                    }

                else if(past2.getText().toString().equals("")){
                    pastOp = pt1+whichOp+pt2+"="+ans;
                    past2.setText(pastOp);}

                else if(past3.getText().toString().equals("")){
                    pastOp = pt1+whichOp+pt2+"="+ans;
                    past3.setText(pastOp);
                    }

                else if(lastPast.getText().toString().equals("TextView")){
                    pastOp = pt1+whichOp+pt2+"="+ans;
                    past.setText(past2.getText().toString());
                    past2.setText(past3.getText().toString());
                    past3.setText(pastOp);
                }

                pt1 = ans;
                pt2 = "";
                txt = "";
            }

        }
    }

    public void c(View view){
        if (lastPressed == "num"){
            txt = "";
            tv.setText(txt);
        }
        else if(lastPressed == "op"){
            op = "";
            operation.setText(op);
        }

    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("inTV", tv.getText().toString());
        outState.putString("inOP", operation.getText().toString());
        outState.putString("past", past.getText().toString());
        outState.putString("past2", past2.getText().toString());
        outState.putString("past3", past3.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        tv.setText(savedInstanceState.getString("inTV"));
        operation.setText(savedInstanceState.getString("inOP"));
        past.setText(savedInstanceState.getString("past"));
        past2.setText(savedInstanceState.getString("past2"));
        past3.setText(savedInstanceState.getString("past3"));
    }
}
