package br.com.easydoctor.sqlhelper;

import java.util.HashMap;

/**
 *
 * @author Andre A. Matecki
 */
public interface IDao {
    void bind(HashMap<String, Object> dados);

}
