package com.example.arnau.loggindemo.Juego;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.arnau.loggindemo.Clases.Usuario;
import com.example.arnau.loggindemo.Proves;
import com.example.arnau.loggindemo.R;

public class Pintarescenario extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GameView newGameView= new GameView(this);
        Intent i = this.getIntent();
        newGameView.setJugador((Usuario)i.getExtras().getSerializable("usuario"));

        // Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);



        setContentView(newGameView);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);





    }

}
