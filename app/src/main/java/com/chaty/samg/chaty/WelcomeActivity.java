package com.chaty.samg.chaty;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;

    RelativeLayout relativeLayout;

    private Button loginRegister;
    private LinearLayout loginView;
    private LinearLayout registerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        relativeLayout = findViewById(R.id.relativeLayout);

        animationDrawable = (AnimationDrawable) relativeLayout.getBackground();

        animationDrawable.setEnterFadeDuration(5000);

        animationDrawable.setExitFadeDuration(2000);

        loginRegister = findViewById(R.id.btn_loginRegister);

        loginRegister.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v)
            {
                loginView = findViewById(R.id.view_login);
                registerView = findViewById(R.id.view_register);

               if (loginRegister.getText() == "Login" ) {
                   loginRegister.setText("Register");
                   registerView.setVisibility(View.GONE);
                   loginView.setVisibility(View.VISIBLE);
               }
               else{
                   loginRegister.setText("Login");
                   registerView.setVisibility(View.VISIBLE);
                   loginView.setVisibility(View.GONE);
               }
            }
        });
    }


    @Override

    protected void onResume() {

        super.onResume();

        if (animationDrawable != null && !animationDrawable.isRunning())

            animationDrawable.start();

    }

    @Override

    protected void onPause() {

        super.onPause();

        if (animationDrawable != null && animationDrawable.isRunning())

            animationDrawable.stop();
    }
}
