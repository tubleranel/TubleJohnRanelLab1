package com.tuble.johnranel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConstraint = (Button)findViewById(R.id.buttonConstraint);

        Button buttonRelative = (Button)findViewById(R.id.buttonRelative);

        Button buttonLinear = (Button)findViewById(R.id.buttonLinear);


        buttonConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveConstraint = new Intent(getApplicationContext(), MainConstraintLayout.class);
                startActivity(moveConstraint);

            }
        });

        buttonRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRelative = new Intent(getApplicationContext(), MainRelativeLayoutActivity.class);
                startActivity(moveRelative);

            }
        });

        buttonLinear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent moveLinear = new Intent(getApplicationContext(), MainLinearLayoutActivity.class);
                startActivity(moveLinear);

            }
        });

    }
}
