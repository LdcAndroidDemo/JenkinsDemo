package com.ldc.jenkinsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//keytool -importkeystore -srckeystore keystore.jks -srcstoretype JKS
//-deststoretype PKCS12 -destkeystore keystore.p12
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {
        Toast.makeText(this, "jenkins 打包demo", Toast.LENGTH_SHORT).show();
    }
}