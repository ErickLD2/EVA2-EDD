/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arbol_binarie;

/**
 *
 * @author PC
 */
public class EVA2_11_ARBOL_BINARIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arbolbinario arbol = new Arbolbinario();
        
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        
        System.out.println("PreOrder: ");
        arbol.printPreOrder();
        
        System.out.println("PostOrder: ");
        arbol.printPostOrder();
        
        System.out.println("InOrder: ");
        arbol.printInOrder();
        
        System.out.println("OtherOrder: ");
        arbol.printOtherOrder();
        
    }
    
    
}
