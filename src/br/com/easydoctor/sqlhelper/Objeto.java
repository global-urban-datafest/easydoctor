package br.com.easydoctor.sqlhelper;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre A. Matecki
 */
public class Objeto<T> {

    private T objeto;

    public Objeto() { }

    public Objeto(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }


}
