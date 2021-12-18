/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_collections_4;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author PC
 */
public class EVA2_18_COLLECTIONS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
         * Conjuntos: matematicas discretas -> No tiene elementos repetidos
         * 
        */
        Set<Integer> conjunto = new LinkedHashSet<>();
        
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        conjunto.add(400);
        conjunto.add(500);
        conjunto.add(600);
        conjunto.add(600);
        
        System.out.println(conjunto);
    }
    
}
