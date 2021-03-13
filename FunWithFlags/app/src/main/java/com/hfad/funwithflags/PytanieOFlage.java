package com.hfad.funwithflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class PytanieOFlage extends AppCompatActivity {
String panstwo;
int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytanie_oflage);
        Intent intent=this.getIntent();
        panstwo=intent.getStringExtra("countryOfFlag");
        id=intent.getIntExtra("idOfFlag",0);
        ImageView obraz=(ImageView)findViewById(R.id.photo);
        obraz.setImageResource(id);
    }

    public void sprawdz(View view){
        EditText odp=(EditText) findViewById(R.id.odpEdit);
        String dana=odp.getText().toString();
        Intent intent=new Intent(this,Odpowiedz.class);
        intent.putExtra("odp",dana);
        intent.putExtra("kraj",panstwo);
        startActivity(intent);
        finish();
    }
}
