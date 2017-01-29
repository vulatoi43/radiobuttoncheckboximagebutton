package com.example.thanhvu.radiobuttoncheckboximagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbtn1,rbtn2;
    private CheckBox cb1,cb2,cb3,cb4;
    private ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sologan="";
                if(rbtn1.isChecked())
                    sologan=sologan+rbtn1.getText();
                if(rbtn2.isChecked())
                    sologan=sologan+rbtn2.getText();
                if(cb1.isChecked())
                    sologan=sologan+cb1.getText();
                if(cb2.isChecked())
                    sologan=sologan+cb2.getText();
                if(cb3.isChecked())
                    sologan=sologan+cb3.getText();
                if(cb4.isChecked())
                    sologan=sologan+cb4.getText();
                Toast.makeText(MainActivity.this,sologan,Toast.LENGTH_LONG).show();




            }
        });

    }
    public void anhxa(){
        rbtn1=(RadioButton)findViewById(R.id.gay);
        rbtn2=(RadioButton)findViewById(R.id.less);
        cb1=(CheckBox)findViewById(R.id.tim);
        cb2=(CheckBox)findViewById(R.id.hong);
        cb3=(CheckBox)findViewById(R.id.tam);
        cb4=(CheckBox)findViewById(R.id.tham);
        imgbtn=(ImageButton)findViewById(R.id.ibtn);


    }

}
