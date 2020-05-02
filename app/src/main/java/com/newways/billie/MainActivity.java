package com.newways.billie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.newways.billie.Model.Scanner;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        login();
    }

    private void login(){
        LayoutInflater inflator=getLayoutInflater();
        View view=inflator.inflate(R.layout.activity_login, null, false);
        loadwithanimation(view,"l");
        final Button login,signup;
        TextView forgot_pass;
        login=findViewById(R.id.llogin);
        signup=findViewById(R.id.lsignup);
        forgot_pass=findViewById(R.id.forgot_pass);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Scanner.class));
            }
        });
        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgotpass();
            }
        });

    }
    private void signup(){
        LayoutInflater inflator=getLayoutInflater();
        View view=inflator.inflate(R.layout.activity_main, null, false);
        loadwithanimation(view,"s");

        final Button login,signup;
        login=findViewById(R.id.slogin);
        signup=findViewById(R.id.ssignup);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void forgotpass(){
        LayoutInflater inflator=getLayoutInflater();
        View view=inflator.inflate(R.layout.forgot_password, null, false);
        loadwithanimation(view,"f");

        Button requestcode;
        requestcode=findViewById(R.id.requestcode);
        requestcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirm_code();
            }
        });
    }

    private void confirm_code(){
        LayoutInflater inflator=getLayoutInflater();
        View view=inflator.inflate(R.layout.actvity_code_verification, null, false);
        loadwithanimation(view,"c");

        Button confirmcode;
        confirmcode=findViewById(R.id.confirm_code);
        confirmcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_pass();
            }
        });
    }

    private void reset_pass(){
        LayoutInflater inflator=getLayoutInflater();
        View view=inflator.inflate(R.layout.activity_reset_pass, null, false);
        loadwithanimation(view,"r");
    }

    private void loadwithanimation(View view,String whichview){
        if (whichview.equals("s")){
            view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.right_to_left));
            setContentView(view);
        }
        else if (whichview.equals("f")){
            view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.up_from_bottom));
            setContentView(view);
        }
        else {
            view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_to_right));
            setContentView(view);
        }

    }

}
