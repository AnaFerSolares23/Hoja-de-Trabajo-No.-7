// Ana Fernanda Solares, 13125
// Jose Rosales, 12576

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Hoja7 {

    private static String txt="", cod="", decodificado="";
    private static int l;
    
    public static void main(String[] args) {
        //Ingreso de texto
        System.out.println("Ingrese la secuencia de caracteres: ");
        Scanner t = new Scanner(System.in);
        txt = t.next();
        
        char[] arreglo = txt.toCharArray();
        // Se genera una lista de nodos (Bloque) que almacenan el caracter y la
        // frecuencia con la que apareció en el texto ingresado.
        List<Bloque> freq = new LinkedList<Bloque>();
        for(int indx = 0; indx < txt.length(); indx++){
            
            // Ordenadamente toma cada caracter del arreglo y obtiene su número
            // de apariciones posteriores (únicamente posteriores a él). Así, al
            // final va guardando en nodos (Bloque)el caracter y su frecuencia.
            char caracter0 = arreglo[indx];
            int frecuencia = 1;
            for(int i = indx + 1; i < txt.length(); i++){
                if(arreglo[i]==caracter0){
                    frecuencia++;
                }
            }Bloque nodob1 = new Bloque(caracter0, frecuencia);
            freq.add(nodob1);
            
            // Si el último nodo que se agregó tiene el mismo caracter que algún
            // otro que ya estuviese en la lista, se elimina de dicha lista.
            char lAnt;
            char lActl = (char)nodob1.getLetra();
            for(int j = 0; j < freq.size() - 1; j++){
                lAnt = (char)(freq.get(j)).getLetra();
                if(lActl == lAnt){
                    freq.remove(freq.size() - 1);
                }
            }
        }     
        
        // La lista se convierte en un array de objetos Bloque que son Comparable
        // para luego ordenar dicho array.
        Bloque[] arrayCaracterFrecuencia = new Bloque[freq.size()];
        for(int i = 0; i < freq.size(); i++){
            arrayCaracterFrecuencia[i] = freq.get(i);
        }
        
        // Se crea el Árbol de Huffman y el Heap que almacena toda la foresta
        HuffmanTree arbolDeHuffman = new HuffmanTree(arrayCaracterFrecuencia);
        
        // Se generan los códigos de los nodos (Bloque).
        arbolDeHuffman.setCodes();
        // Finalmente se despliega en pantalla los caracteres, con su frecuencia y su código.
        System.out.println("Caracter  " + "  Frecuencia  " + "  Código");
        System.out.println("__________" + "|______________" + "|________");
        for(int i = 0; i < arrayCaracterFrecuencia.length; i++){
            Bloque nodo = arrayCaracterFrecuencia[i];
            System.out.println("    " + nodo.getLetra() + "     |     " + nodo.getFrecuencia() + "        |  " + nodo.getCode());
        }
        
        //Loop decodificador
        String des="no";
        while (!des.equalsIgnoreCase("si")){
            //Inicia el decodificador
            //se toma la lista de codigos y se ordena de mayor a menor
            String[] cods= new String[arrayCaracterFrecuencia.length]; 
            String[] car= new String[arrayCaracterFrecuencia.length]; 
            for(int i = 0; i < arrayCaracterFrecuencia.length; i++){
                cods[i]=""+arrayCaracterFrecuencia[i].getCode();//toma los valores del codigo
                //System.out.println(""+cods[i].length());
                car[i]=""+arrayCaracterFrecuencia[i].getLetra();//toma las letras
            }
            //Se ingresa el codigo
            System.out.println("Ingrese el codigo a decodificar: ");
            Scanner dec = new Scanner(System.in);
            cod = dec.next();
            //se agrega cada valor a una lista char
            char[] codigo =cod.toCharArray();
            //comparo lo que tengo en la lista con lo que está en el codigo
            l=0;
            decodificado="";
            while(l<codigo.length){
                for(int j=0; j<cods.length; j++){
                    String decodi="";
                    for(int k=0; k<cods[j].length(); k++){
                        decodi+=""+codigo[l+k];
                    }
                    if(decodi.equals(cods[j])){
                        decodificado+=car[j];
                        l+=cods[j].length();
                        j=cods.length;
                    }
                }
            }
            System.out.println("Se decodifico: "+decodificado);
            System.out.println("Desea salir? Si/No");
            Scanner sal = new Scanner(System.in);
            des = dec.next();
        }
        
    }
    
}
