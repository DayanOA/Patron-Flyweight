/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.HashMap;

/**
 *
 * @author Tonny
 */
public class BorradorFactory {

    private static final HashMap<String, Borrador> borradorMap = new HashMap<>();

    public static Borrador getBorradorGrande(String forma) {

        String key = forma + " - GRANDE";

        Borrador borrador = borradorMap.get(key);

        if (borrador != null) {
            return borrador;
        } else {
            borrador = new BorradorGrande();
            borrador.setForma(forma);
            borradorMap.put(key, borrador);
        }

        return borrador;
    }

    public static Borrador getBorradoMediano(String forma) {

        String key = forma + " - MEDIANO";

        Borrador borrador = borradorMap.get(key);

        if (borrador != null) {
            return borrador;
        } else {
            borrador = new BorradorMediano();
            borrador.setForma(forma);
            borradorMap.put(key, borrador);
        }

        return borrador;
    }

    public static Borrador getBorradorPequeño(String forma) {

        String key = forma + " - PEQUEÑO";

        Borrador borrador = borradorMap.get(key);

        if (borrador != null) {
            return borrador;
        } else {
            borrador = new BorradorPequeño();
            borrador.setForma(forma);
            borradorMap.put(key, borrador);
        }

        return borrador;
    }
}
