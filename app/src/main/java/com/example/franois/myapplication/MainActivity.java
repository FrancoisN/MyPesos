package com.example.franois.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text = null;
    private String hello = null;
    private Button b = null;
    private Button big = null;
    private int p = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.textView2);
        b = (Button)findViewById(R.id.button);
/*
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = p+100;
                text.setText(p + " Pesos");
                if (p==1000)
                    Toast.makeText(MainActivity.this, "Un maaax de pessoooss", Toast.LENGTH_SHORT).show();
            }
        });
*/




//        big.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent event) {
//                int largeur = big.getWidth();
//                int hauteur = big.getHeight();
//                big.setTextSize(Math.abs(event.getX() / largeur * 2) + Math.abs(event.getY() / hauteur * 2));
//                text.setText("coordinées x :" + event.getX() + "\ncoordinées y :" + event.getY());
//                return true;
//            }
//        });


    }
    public void pesositos(View v) {
        p = p*10;
        text.setText(p + " Pesos");
    }

}
