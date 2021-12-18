
package eva2_7_lista_simple;

public class EVA2_7_LISTA_SIMPLE {
    
    public static void main(String[] args) {
        // crear una lista
        Lista miLista = new Lista(); // Creo una lista vacia
        /*
        int[] aiArreglo = new int[1000000];
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo((int) (Math.random() * 1000)));
        }
        miLista.printList();
        */
        
        Nodo nodoNuevo = new Nodo(100);
        miLista.add(nodoNuevo);
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.add(new Nodo(500));
        
        miLista.printList(); // Imprimir la lista
        
        /*// Limpiar la lista y probar si se limpio
        miLista.clearList();
        
        System.out.println("\nDespues de limpiar");
        
        miLista.add(new Nodo(600));
        miLista.add(new Nodo(700));
        miLista.add(new Nodo(800));
        miLista.add(new Nodo(900));
        miLista.add(new Nodo(1000));
        miLista.add(new Nodo(1100));
        
        miLista.printList();*/  // Esta quitada del programa debido a que ya vimos que servia limpiar
        
        System.out.println("\nCantidad de nodos: " + miLista.length());
        
        // Intentar, sino, atrapar el exception
        try {
            System.out.println("\nNodo en posicion 4: " + miLista.getPosicion(04));
        } catch (Exception ex) {
            ex.printStackTrace(); // Imrpime el error
        }
        
        // Agregar un nodo en inicio 
        System.out.println("Lista insertando un valor al inicio");
        miLista.insertarEn(0, new Nodo(0));
        miLista.printList();
        
        // Agregar un nodo en cualquier posicion
        System.out.println("Lista insertando un valor en cualquier posicion");
        miLista.insertarEn(2, new Nodo(50));
        miLista.printList();
        
        // Borrar un nodo
        System.out.println("Lista borrando un nodo al inicio");
        miLista.borrarEn(0);
        miLista.printList();
        System.out.println("");
        
        // Borrar un nodo cualquiera
        System.out.println("Lista borrando un nodo cualquiera");
        miLista.borrarEn(2);
        miLista.printList();
    }
    
}
