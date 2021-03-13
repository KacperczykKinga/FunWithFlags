package com.hfad.funwithflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void losuj(View view){
        int losowaFlaga=(int) (Math.random()*16);
        System.out.println(losowaFlaga);
        Flagi losujFlage=new Flagi();
        int idOfFlag=losujFlage.getIdOf(losowaFlaga);
        String countryOfFlag=losujFlage.getCountryOf(losowaFlaga);
        Intent intent=new Intent(this,PytanieOFlage.class);
        intent.putExtra("idOfFlag",idOfFlag);
        intent.putExtra("countryOfFlag",countryOfFlag);
        startActivity(intent);
       // finish();
    }
}
