package com.example.ns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;
        public boolean isSquare(){
            double SquareRoot=Math.sqrt(number);
            if(SquareRoot==Math.floor(SquareRoot)){
                return true;
            }else{
                return false;
            }
        }
        public boolean isTriangular(){
            int x=1;
            int triangularnumber=1;
            while (triangularnumber < number){
                x++;
                triangularnumber=triangularnumber+x;
            }
            if(triangularnumber==number){
                return true;

            }else {
                return false;
            }
        }
    }

    public void testnumber(View view){

        EditText e1=(EditText)findViewById(R.id.e1);

        String message;
        if(e1.getText().toString().isEmpty()){
            message="Please enter a number";

        }
        else {
            Number mynumber = new Number();
            mynumber.number = Integer.parseInt(e1.getText().toString());
            message = e1.getText().toString();


            if (mynumber.isSquare() && mynumber.isTriangular()) {
                message += " is square and is triangular";
            } else if (mynumber.isSquare()) {
                message += " is a square not triangular";
            } else if (mynumber.isTriangular()) {
                message += " is a triangular not a square";
            } else {
                message += " is neither a triangular nor a square";
            }
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
