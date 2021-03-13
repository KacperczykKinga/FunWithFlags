package com.hfad.funwithflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

public class Odpowiedz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odpowiedz);
        tworzOdpowiedz();
    }

    public void doPoczatku(View view){
        int losowaFlaga=(int) (Math.random()*16);
      //  System.out.println(losowaFlaga);
        Flagi losujFlage=new Flagi();
        int idOfFlag=losujFlage.getIdOf(losowaFlaga);
        String countryOfFlag=losujFlage.getCountryOf(losowaFlaga);
        Intent intent=new Intent(this,PytanieOFlage.class);
        intent.putExtra("idOfFlag",idOfFlag);
        intent.putExtra("countryOfFlag",countryOfFlag);
        startActivity(intent);
        finish();
        //Intent intent=new Intent(this,MainActivity.class);
        //startActivity(intent);
        //finish();
    }

    public void tworzOdpowiedz(){
        Intent intent=getIntent();
        String odp=intent.getStringExtra("odp");
        String kraj=intent.getStringExtra("kraj");
        TextView wyswietl=(TextView)findViewById(R.id.odpowiedz);
        if(kraj.equals("Bialorus")){
            if(odp.equals("Białorusś")){
                wyswietl.setText("Wspaniale! Ten kraj to Białoruś!");
            }
            else{
                wyswietl.setText("Niestety nie udało Ci się... Ten kraj to Białoruś!");
            }
        }
        else if(kraj.equals("Meksyk")){
            if(odp.equals("Meksyk")){
                wyswietl.setText("Dokładnie! Ten kraj to Meksyk!");
            }
            else{
                wyswietl.setText("Niestety nie udało Ci się... Ten kraj to Meksyk!");
            }
        }
        else if(kraj.equals("Grenlandia")){
            if(odp.equals("Grenlandia")){
                wyswietl.setText("Właśnie tak! To flaga Grenlandii!");
            }
            else{
                wyswietl.setText("Niestety nie udało Ci się... To flaga Grenlandii!");
            }
        }
        else if(kraj.equals("SriLanka")){
            if(odp.equals("Sri Lanka")){
                wyswietl.setText("Dokładnie! To flaga Sri Lanki!");
            }
            else{
                wyswietl.setText("Pomyliłeś się... To flaga Sri Lanki!");
            }
        }
        else if(kraj.equals("Argentyna")){
            if(odp.equals("Argentyna")){
                wyswietl.setText("Zgadza się! To flaga Argentyny!");
            }
            else{
                wyswietl.setText("Pomyliłeś się... To flaga Argentyny!");
            }
        }
        else if(kraj.equals("Australia")){
            if(odp.equals("Australia")){
                wyswietl.setText("Zgadza się! Ta flaga należy do Australii!");
            }
            else{
                wyswietl.setText("Niestety to błędna odpowiedź... To flaga Australii!");
            }
        }
        else if(kraj.equals("Brazylia")){
            if(odp.equals("Brazylia")){
                wyswietl.setText("Zgadza się! Ta flaga należy do Brazylii!");
            }
            else{
                wyswietl.setText("Niestety to błędna odpowiedź... To flaga Brazylii!");
            }
        }
        else if(kraj.equals("Chorwacja")){
            if(odp.equals("Chorwacja")){
                wyswietl.setText("Owszem! To flaga Chorwacji!");
            }
            else{
                wyswietl.setText("To nieprawda... To flaga Chorwacji!");
            }
        }
        else if(kraj.equals("Francja")){
            if(odp.equals("Francja")){
                wyswietl.setText("Dokładnie tak! To flaga Francji!");
            }
            else{
                wyswietl.setText("To nieprawda... To flaga Francji!");
            }
        }
        else if(kraj.equals("Indie")){
            if(odp.equals("Indie")){
                wyswietl.setText("Dokładnie tak! To flaga Indii!");
            }
            else{
                wyswietl.setText("To błędna odpowiedź... To flaga Indii!");
            }
        }
        else if(kraj.equals("Japonia")){
            if(odp.equals("Japonia")){
                wyswietl.setText("Dokładnie tak! Ta flaga należy do Japonii!");
            }
            else{
                wyswietl.setText("To błędna odpowiedź... To flaga Japonii!");
            }
        }
        else if(kraj.equals("Litwa")){
            if(odp.equals("Litwa")){
                wyswietl.setText("Gratulacje! To właśnie flaga Litwy!");
            }
            else{
                wyswietl.setText("Nieprawidłowa odpowiedź... To flaga Litwy!");
            }
        }
        else if(kraj.equals("Niemcy")){
            if(odp.equals("Niemcy")){
                wyswietl.setText("Gratulacje! To właśnie flaga Niemiec!");
            }
            else{
                wyswietl.setText("Nieprawidłowa odpowiedź... To flaga Niemiec!");
            }
        }
        else if(kraj.equals("Rosja")){
            if(odp.equals("Rosja")){
                wyswietl.setText("Gratulacje! To właśnie flaga Rosji!");
            }
            else{
                wyswietl.setText("Błędna odpowiedź... To flaga Rosji!");
            }
        }
        else if(kraj.equals("Szwajcaria")){
            if(odp.equals("Szwajcaria")){
                wyswietl.setText("Dokładnie tak! To właśnie flaga Szwajcarii!");
            }
            else{
                wyswietl.setText("Błędna odpowiedź... To flaga Szwajcarii!");
            }
        }
        else if(kraj.equals("Wlochy")){
            if(odp.equals("Włochy")){
                wyswietl.setText("Dokładnie tak! To jest flaga Włoch!");
            }
            else{
                wyswietl.setText("Błędna odpowiedź... To flaga Włoch!");
            }
        }
    }
}
