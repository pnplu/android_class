package com.plupasit.hw01_w_13560220;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    boolean sum_number , minus_number ,multiple_number ,divide_number ;
    float ValOne, ValTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn_zero = (Button)findViewById(R.id.BTNZero);
        Button Btn_nine = (Button)findViewById(R.id.BTNNine);
        Button Btn_eight = (Button)findViewById(R.id.BTNEight);
        Button Btn_seven = (Button)findViewById(R.id.BTNSeven);
        Button Btn_six = (Button)findViewById(R.id.BTNSix);
        Button Btn_five = (Button)findViewById(R.id.BTNFive);
        Button Btn_four = (Button)findViewById(R.id.BTNFour);
        Button Btn_three = (Button)findViewById(R.id.BTNThree);
        Button Btn_two = (Button)findViewById(R.id.BTNTwo);
        Button Btn_one = (Button)findViewById(R.id.BTNOne);

        Button Btn_equal = (Button)findViewById(R.id.BTNEqual);
        Button Btn_plus = (Button)findViewById(R.id.BTNPlus);
        Button Btn_minus = (Button)findViewById(R.id.BTNMinus);
        Button Btn_multiple = (Button)findViewById(R.id.BTNMultiple);
        Button Btn_devide = (Button)findViewById(R.id.BTNDevide);

        Button Btn_del = (Button)findViewById(R.id.BTNDelete);
        Button Btn_dot = (Button)findViewById(R.id.BTNDot);

        final EditText Et_number = (EditText)findViewById(R.id.ETNumber);

        Btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"0");
            }
        });

        Btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"1");
            }
        });

        Btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"2");
            }
        });

        Btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"3");
            }
        });

        Btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"4");
            }
        });

        Btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"5");
            }
        });

        Btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"6");
            }
        });

        Btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"7");
            }
        });

        Btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"8");
            }
        });

        Btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et_number.setText(Et_number.getText()+"9");
            }
        });

        Btn_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (Et_number == null){
                    Et_number.setText("");
                } else {
                    ValOne = Float.parseFloat(Et_number.getText()+"");
                    sum_number = true;
                    Et_number.setText(null);
                }
            }
        });

        Btn_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ValOne = Float.parseFloat(Et_number.getText()+"");
                minus_number = true;
                Et_number.setText(null);
            }
        });

        Btn_multiple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ValOne = Float.parseFloat(Et_number.getText()+"");
                multiple_number = true;
                Et_number.setText(null);
            }
        });

        Btn_devide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ValOne = Float.parseFloat(Et_number.getText()+"");
                divide_number = true;
                Et_number.setText(null);
            }
        });

        Btn_equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ValTwo = Float.parseFloat(Et_number.getText()+"");

                if (sum_number == true)
                {
                    Et_number.setText(ValOne + ValTwo + "");
                    sum_number = false;
                }
                if (minus_number == true)
                {
                    Et_number.setText(ValOne - ValTwo + "");
                    minus_number = false;
                }
                if (multiple_number == true)
                {
                    Et_number.setText(ValOne * ValTwo + "");
                    multiple_number = false;
                }
                if (divide_number == true)
                {
                    Et_number.setText(ValOne / ValTwo + "");
                    divide_number = false;
                }
            }
        });

        Btn_del.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Et_number.setText("");
            }
        });

        Btn_dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Et_number.setText(Et_number.getText()+".");
            }
        });

    }
}
