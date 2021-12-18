/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_collections_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author PC
 */
public class EVA2_14_COLLECTIONS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              // Queue es una lista, pero con un comportamiento de Queue: 
        // Insertar al final, leer al inicio
        Queue<Integer> cola = new LinkedList();
        
        cola.add(100);
        cola.add(200);
        cola.add(300);
        cola.add(400);
        cola.add(500);
        System.out.println("la cola sin ver nada\n\t" + cola);
        System.out.println("peek(): " + cola.peek());
        System.out.println("La cola viendo el primer elemento\n\t" + cola);
        System.out.println("poll(): " + cola.poll());
        System.out.println("La cola usando poll()\n\t" + cola);
        
        
        Stack<Integer> pila = new Stack();
        
        pila.add(100);
        pila.add(200);
        pila.add(300);
        pila.add(400);
        pila.add(500);
        
        System.out.println("La pila: \n\t" + pila);
        System.out.println("peek(): " + pila.peek());
        System.out.println("La pila: \n\t" + pila);
        System.out.println("pop(): " + pila.pop());
        System.out.println("La pila: \n\t" + pila);
        
    }
    
}
