package br.com.easydoctor.sqlhelper;

import java.util.HashMap;

/**
 *
 * @author André A. Matecki
 */
public interface IDao {
    void bind(HashMap<String, Object> dados);

}
