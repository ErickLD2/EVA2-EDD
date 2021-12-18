/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_collections_3;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EVA2_16_COLLECTIONS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Similar al LinkedList, pero trabaja con arreglos
        Mejor para almacenar datos
        Malo para 
        */
        ArrayList arrayList = new ArrayList();
        
        arrayList.add(1000);
        arrayList.add(2000);
        arrayList.add(3000);
        arrayList.add(4000);
        arrayList.add(5000);
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        System.out.println("Ver solo el elemento 4: " + arrayList.get(4) + "\n");
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        arrayList.remove(4);
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        arrayList.clear();
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        
        
    
    }
    
}
