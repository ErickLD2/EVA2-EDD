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
public class Pila extends Lista{
    // Necesitamos el metodo peel()
    public int peek() throws Exception{
        return getPosicion(tamanoLista() - 1);
    }
    
    // Necesitamos el metodo pop()
    public int pop() throws Exception{
        int temp = getPosicion(tamanoLista() - 1);
        borrarEn(tamanoLista() - 1);
        return temp;
    }
}
    

