package com.hfad.funwithflags;

public class Flaga {
    String panstwo;
    int imageId;


    public Flaga(String nazwa,int id){
        panstwo=nazwa;
        imageId=id;
    }

    public String getPanstwo(){
        return panstwo;
    }

    public int getId(){
        return imageId;
    }
}
