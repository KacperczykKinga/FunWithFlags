package com.hfad.funwithflags;

public class Flagi {
    Flaga[] doAplikacji={
            new Flaga("Argentyna", R.drawable.argentyna),
            new Flaga("Australia",R.drawable.australia),
            new Flaga("Bialorus",R.drawable.bialorus),
            new Flaga("Brazylia",R.drawable.brazylia),
            new Flaga("Chorwacja",R.drawable.chorwacja),
            new Flaga("Francja",R.drawable.francja),
            new Flaga("Indie",R.drawable.indie),
            new Flaga("Japonia",R.drawable.japonia),
            new Flaga("Litwa",R.drawable.litwa),
            new Flaga("Meksyk",R.drawable.meksyk),
            new Flaga("Niemcy",R.drawable.niemcy),
            new Flaga("Rosja",R.drawable.rosja),
            new Flaga("SriLanka",R.drawable.srilanka),
            new Flaga("Szwajcaria",R.drawable.szwajcaria),
            new Flaga("Grenlandia",R.drawable.grenlandia),
            new Flaga("Wlochy",R.drawable.wlochy),
            new Flaga("Wietnam",R.drawable.wietnam),
            new Flaga("WielkaBrytania",R.drawable.uk),
            new Flaga("Wegry",R.drawable.wegry),
            new Flaga("Wenezuela",R.drawable.wenezuela),
            new Flaga("Watykan",R.drawable.watykan),
            new Flaga("Uzbekistan",R.drawable.uzbekistan)
    };

    public int getIdOf(int numerFlagi){
        int id=doAplikacji[numerFlagi].getId();
        return id;
    }

    public String getCountryOf(int numerFlagi){
        String panstwo=doAplikacji[numerFlagi].getPanstwo();
        return panstwo;
    }
}
