/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author pc
 */
public class Problema implements Serializable{
    //Scanner sc = new Scanner (System.in);
    private int aleatorio;
    private int id;
    private HashSet<Usuario> lista=new HashSet<Usuario>();
    private Usuario user=new Usuario("","");
    
    public int getal(){
        return aleatorio;
    }
    public HashSet<Usuario> getLista(){
        return lista;
    }
    public int getId(){
        return id;
    }
    public void setId(int a){
        id=a;
    }
    public void setLista(HashSet<Usuario> user){
        lista=user;
    }
    public void setUsuario(Usuario user){
        this.user=user;
    }
    public Usuario getUsuario(){
        return user;
    }
    public void añadirUsuario(Usuario user){
        lista.add(user);
    }
    
    @Override
    public String toString(){
       
        return user.solonombre()+"\n";
    }
}
