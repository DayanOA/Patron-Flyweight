/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Tonny
 */
public class BorradorPequeño implements Borrador {

    final EGrosor pequeño = EGrosor.PEQUEÑO;    //Estado intrínseco - compartido
    private String forma = null;                //Estado extrpinseco - entregado por el cliente

    @Override
    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public void borrar(String contenido) {
        System.out.println("Borrando con borrador " + pequeño + " - Forma: " + forma);
        System.out.println(contenido);
        System.out.println(this.hashCode());
    }

}
