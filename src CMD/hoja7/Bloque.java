
// Ana Fernanda Solares, 13125
// Jose Rosales, 12576
public class Bloque<E> implements Comparable{
    private E letra;
    private int frecuencia;
    private String codigo;
    
    public Bloque(E letter, int frequency){
        letra = letter;
        frecuencia = frequency;
    }
    
    public Bloque(int frequency){
        frecuencia = frequency;
        letra = null;
    }
    
    public E getLetra(){
        return letra;
    }
    
    public int getFrecuencia(){
        return frecuencia;
    }
    
    public void setFrecuencia(int frequency){
        frecuencia = frequency;
    }
    
    public int compareTo(Object other){
        if(frecuencia < ((Bloque)other).getFrecuencia()){
            return -1;
        }else{
            return 1;
        }
    }
    
    public void setCode(String cod){
        codigo = cod;
    }
    
    public String getCode(){
        return codigo;
    }
}
