package com.example.paymentdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Payment extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    private TextView tx1,tx2,tx3,tx4;
    private EditText etx1,etx2,etx3,etx4,etx5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

             btn1=findViewById(R.id.mcard);
             btn2=findViewById(R.id.vcard);
             btn3=findViewById(R.id.acard);
             btn4=findViewById(R.id.paypal);
             btn5=findViewById(R.id.bttn5);
             btn6=findViewById(R.id.bttn6);
             btn7=findViewById(R.id.bttn7);
             tx1=findViewById(R.id.ptxt1);
             tx2=findViewById(R.id.ptxt2);
             tx3=findViewById(R.id.ptxt3);
             tx4=findViewById(R.id.ptxt4);
             etx1=findViewById(R.id.etxt1);
             etx2=findViewById(R.id.etxt2);
             etx3=findViewById(R.id.etxt3);
             etx4=findViewById(R.id.etxt4);
             etx5=findViewById(R.id.etxt5);



    }
}
