package com.mycompany.edd_u4e1;

public class CNodo {
    private CNodo izq;
    private CNodo der;
    private int info;

    public CNodo() {
        this.izq = null;
        this.der = null;
        this.info = 0;
    }

    public CNodo(int info) {
        this.izq = null;
        this.der = null;
        this.info = info;
    }

    public CNodo(CNodo izq, CNodo der, int info) {
        this.izq = izq;
        this.der = der;
        this.info = info;
    }

    public CNodo getIzq() {return izq;}
    public void setIzq(CNodo izq) {this.izq = izq;}

    public CNodo getDer() {return der;}
    public void setDer(CNodo der) {this.der = der;}

    public int getInfo() {return info;}
    public void setInfo(int info) {this.info = info;}
}
