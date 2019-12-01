package com.example.systemservice;

public class Chiamata {
    public String numero,data,durata,tipo,contatto;

    public Chiamata(String numero,String data,String durata,String tipo,String contatto)
    {
        this.numero=numero;
        this.data=data;
        this.durata=durata;
        this.tipo=tipo;
        this.contatto=contatto;
    }

    public String toString()
    {
        return contatto + " " + numero + " " + data + " " + durata + " "  + tipo;
    }
}
