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

    public class Cola extends Lista{
    // Agregamos al final de la lista
        // El metodo add -- > Nada nuevo
    // Leemos al inicio de la lista:
    //Regresa el valor del elemento al inicio de la lista
    public int peek() throws Exception{
        return getPosicion(0);
    }
    
    // Regresa y remueve el elemento al inicio de la lista
    public int poll() throws Exception{
        // Guardar el valor antes de eliminarlo
        int temp = getPosicion(0);
        // Eliminar el valor
        borrarEn(0);
        // Devolver el valor
        return temp;
    }
}

