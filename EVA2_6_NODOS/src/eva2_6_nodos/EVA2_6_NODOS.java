/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_nodos;

/**
 *
 * @author PC
 */
public class EVA2_6_NODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo inicio= new Nodo();
        inicio.datos= 100;
        inicio.referencia=new Nodo();
        inicio.referencia.datos=200;
        inicio.referencia.referencia=null;
        System.out.println(inicio);
        System.out.println(inicio.referencia);
        System.out.println(inicio.datos);
        System.out.println(inicio.referencia.datos);
    }
    
}
class Nodo{
    int datos;
    Nodo referencia;
}
