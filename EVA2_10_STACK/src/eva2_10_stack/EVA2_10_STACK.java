/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack;

/**
 *
 * @author PC
 */
public class EVA2_10_STACK {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        public static void main(String[] args) {
        Pila miPila = new Pila();
        
        miPila.add(0);
        miPila.add(100);
        miPila.add(200);
        miPila.add(300);
        miPila.add(400);
        
        miPila.printList();
        
        try {
            System.out.println("peek(): " + miPila.peek());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        miPila.printList();
        
        try {
            System.out.println("pop(): " + miPila.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        miPila.printList();
    }
    
    
}
