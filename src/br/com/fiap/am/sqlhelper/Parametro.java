package br.com.fiap.am.sqlhelper;
/*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class Parametro {
    
    private Integer indexParametro;
    private Object parametro;

    public Parametro(Integer indexParametro, Object parametro) {
        this.indexParametro = indexParametro;
        this.parametro = parametro;
    }

    public Integer getIndexParametro() {
        return indexParametro;
    }

    public void setIndexParametro(Integer indexParametro) {
        this.indexParametro = indexParametro;
    }

    public Object getParametro() {
        return parametro;
    }

    public void setParametro(Object parametro) {
        this.parametro = parametro;
    }
    
}
