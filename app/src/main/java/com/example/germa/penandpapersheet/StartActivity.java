package com.example.germa.penandpapersheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button btContinue;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btContinue = (Button) findViewById(R.id.btContinue);

        btContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Intent mainIntent = new Intent(view.getContext(), MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
