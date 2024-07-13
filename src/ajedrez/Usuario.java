/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;
import java.io.*;
import java.text.DecimalFormat;


/**
 *
 * @author pc
 */
public class Usuario implements Serializable{
    private String nombre;
    private String psw;
    private int problemas_intentados;
    private int problemas_resueltos;
    private int errores;
    private double porcentaje_exito;
    static int nUsuarios;
    private int id;
    private DecimalFormat f1=new DecimalFormat("#.00");

    
    public Usuario(String nombre, String psw){
        this.nombre=nombre;
        this.psw=psw;
        problemas_intentados=0;
        problemas_resueltos=0;
        errores=0;
        porcentaje_exito= 0;
    }
    
    public String getnombre(){
        return(this.nombre);
    }
    
    public String getpsw(){
        return(this.psw);
    }
    public int getproblemas_intentados(){
        return(this.problemas_intentados);
    }
    public int getproblemas_resueltos(){
        return(this.problemas_resueltos);
    }
    public int geterrores(){
        return(this.errores);
    }
    public double getporcentaje_exito(){
        return(this.porcentaje_exito);
    }
    
    public void setproblemas_intentados(int n){
        this.problemas_intentados=n;
    }
    public void seterrores(int n){
        this.errores=n;
    }
   
    public void setprblemas_resueltos(int n){
        this.problemas_resueltos=n;
    }
    public void setNombre(String s){
        nombre=s;
    }
    public void setPorcentaje(){
        porcentaje_exito=((double)problemas_resueltos/(double)problemas_intentados)*100;
    }
    public boolean jugar(String s,int n){
        boolean acierto = false;
        switch (n) 
        {
            case 1: String a="td8"; 
                if(s.equals(a)){
                acierto=true;}
            break;
            
                     
            case 2:  String b="cg6"; 
                if(s.equals(b)){
                acierto=true;}
                     break;
            case 3:  String c="fxg8"; 
                if(s.equals(c)){
                acierto=true;}
                     break;
            case 4:  String d="f8"; 
                if(s.equals(d)){
                acierto=true;}
                     break;
            case 5:  String e="dxe8"; 
                if(s.equals(e)){
                acierto=true;}
                     break;
            case 6:  String f="dc6"; 
                if(s.equals(f)){
                acierto=true;}
                     break;
            case 7:  String g="cd7"; 
                if(s.equals(g)){
                acierto=true;}
                     break;
            case 8:  String h="cxe6"; 
                if(s.equals(h)){
                acierto=true;}
                     break;
            case 9:  String i="h7"; 
                if(s.equals(i)){
                acierto=true;}
                     break;
            case 10:  String j="txc7"; 
                if(s.equals(j)){
                acierto=true;}
                     break;
            
    }
        return acierto;
    }
        
    public String solonombre(){
        return "Usuario:" + nombre +  "\n";
    }   
    
    @Override
    public String toString (){
        return "Usuario:" + nombre + 
                " Intentos:" + problemas_intentados + 
                " Resueltos:" + problemas_resueltos + 
                " Errores:" + errores + 
                " PorcentajeExito:" + f1.format(porcentaje_exito) + "\n";
    }
    
    @Override
    public boolean equals (Object o) {
    if(this== o) return true;
    if(o == null) return false;
    if(getClass() != o.getClass())return false;
    Usuario u = (Usuario) o;
    return nombre.equals(u.nombre);
    }
    @Override
    public int hashCode(){
    return nombre.hashCode();
    }
}
