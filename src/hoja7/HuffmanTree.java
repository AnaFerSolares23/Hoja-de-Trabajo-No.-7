// Ana Fernanda Solares, 13125
// Jose Rosales, 12576
package hoja7;

/**
 *
 * 
 */
public class HuffmanTree {
    private BinaryTree arbolT;
    private Heap heap = new Heap();
        
    public HuffmanTree(Bloque[] list){
        
        // Se genera el árbol de huffman, a partir de la lista.
        // También se van agnadiendo los elementos el heap.
        Bloque nodo1 = list[0];
        heap.add(nodo1);
        BinaryTree arbol1 = new BinaryTree(nodo1);
        
        Bloque nodo2 = list[1];
        heap.add(nodo2);
        BinaryTree arbol2 = new BinaryTree(nodo2);
        
        int frecuenciaAcumulada = nodo1.getFrecuencia() + nodo2.getFrecuencia();
        
        Bloque total = new Bloque(frecuenciaAcumulada);
        heap.add(total);
        arbolT = new BinaryTree(total, arbol1, arbol2);
        
        for(int i = 2; i < list.length; i++){
        
            nodo1 = list[i];
            heap.add(nodo1);
            arbol1 = new BinaryTree(nodo1);
        
            frecuenciaAcumulada = nodo1.getFrecuencia() + frecuenciaAcumulada;
            
            total = new Bloque(frecuenciaAcumulada);
            heap.add(total);
            arbolT = new BinaryTree(total, arbol1, arbolT);
        }
    }
    
    /**
     * 
     * @return arbol
     */
    public BinaryTree getTree(){
        return arbolT;
    }
    
    /*
     * Genera el código de cada Bloque (nodo) que contiene un caracter en el 
     * árbol de huffman.*/
     
    public void setCodes(){
        String code;
        int count = 0;
        int size = heap.size();
        
        for(int i = 0; i < size; i++){
            
            Bloque removido = heap.remove();
            
            // si el nodo contiene un caracter (es uno de los bloques
            // de la lista original (de caracter, frecuencia)
            if(removido.getLetra() != null){
            
                count++;
                
                //Asigna '1' sólo al que está más a la izquierda
                if(count==1){
                    code = "1";
                }
                        
                //A los nodos que son hijos de un parent que es hijo derecho, 
                //se les asigna '0's (ceros), hasta su última posición que la 
                //abarca un 1, si estos nodos son hijos izquierdos; y un 0, en 
                //caso de que el nodo sea el hijo derecho (el nodo más a la 
                //derecha de todos)
                else{
                    code = "0";
                    for(int k = 2; k < count; k++){
                        code = code + "0";
                    }
                    //Al último nodo derecho, se le asigna '1' al final
                    if(i != size-1){
                        code = code + "1";
                    }
                }
                
                //Por último, se guarda el valor del código en cada objeto Bloque
                removido.setCode(code);
            }
        }
    }
}
