/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author PC
 */
public class EVA2_9_QUEUE {

    /**
     * @param args
     */

        // TODO code application logic here
        public static void main(String[] args) {
        Cola miCola = new Cola();
        
        miCola.add(0);
        miCola.add(100);
        miCola.add(200);
        miCola.add(300);
        miCola.add(400);
        miCola.add(500);
        
        miCola.printList();
        
        try {
            System.out.println("Peek: " + miCola.peek());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            System.out.println("Poll: " + miCola.poll());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        miCola.printList();
        
        try {
            System.out.println("Peek: " + miCola.peek());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
    
    

