package com.example.android.pushup2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUpload();
    }

    private void TestUpload(){
        int i=1;
        int j = 2;
        i++;
        j++;
    }

    private String branchMethod(){
        return "branch 2 method return!";
    }
}
