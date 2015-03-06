package br.com.fiap.am.sqlhelper;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rm66288
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
