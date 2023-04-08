/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package browser;

import java.util.Stack;

/**
 *
 * @author guill
 */
public class Pila {
      Stack<String> pila;

    Pila() {
        pila = new Stack<String>();
    }

    public void push(String dato) {
        pila.push(dato);
    }
    public String pop(){
        return pila.pop();
    }
    
    public String top(){
        return pila.peek();
    }
    
    public int size() {
        return pila.size();
    }
    
    public boolean  vacia (){
      return pila.isEmpty();
    }
    
    
    public String toString(){
        String texto="";
        for (int i = pila.size()-1; i >= 0; i--) {
            texto+=pila.get(i)+"\n";
        }
        return texto;
    }
}
