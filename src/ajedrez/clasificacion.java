/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author pc
 */
public class clasificacion {
    private HashSet<Usuario> users;
    
    public clasificacion(){
        users=new HashSet();
    }
    public void setLista(HashSet<Usuario> l){
        users=l;
    }
    public HashSet<Usuario> getLista(){
        return users;
    }
     public TreeSet<Usuario> ordenar(){
         TreeSet<Usuario> tr=new TreeSet<Usuario>(new comparar());
         for(Object c: this.users){
             tr.add((Usuario)c);
         }
         return tr;
     }  
     public TreeSet<Usuario> ordenarAlternativo(){
         TreeSet<Usuario> tr=new TreeSet<Usuario>(new comparar_numero());
         for(Object c: this.users){
             tr.add((Usuario)c);
         }
         return tr;
     }
}
