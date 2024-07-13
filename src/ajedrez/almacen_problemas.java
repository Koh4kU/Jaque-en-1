/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.util.Pair;

/**
 *
 * @author pc
 */
public class almacen_problemas implements Serializable {

   
    private int id;
    private String[][] tablero;
    private String[] solucion;
    private int totalproblemas=0;
    
    
    public almacen_problemas(String[][] a,String[] b){
       this.tablero=a;
       this.solucion=b;
       this.id=0;
        }
    
    public int getid(){
        return id;
    }
    
    public void setId(int a){
        this.id=a;
    }
    public int gettotalprob(){
        return totalproblemas;
    }
    public void settotalproblemas(int a){
        totalproblemas=a+1;
    }
    public String[][] gettablero(){
        return tablero;
    }
    public void setablero(almacen_problemas p){
        this.tablero=p.gettablero();
    }
    public String[] getsol(){
        return solucion;
    }
     public void setsol(almacen_problemas p){
        this.solucion=p.getsol();
    }
    
    public Pair subirproblema(String archivo) throws FileNotFoundException, IOException {
      String cadena;
      FileReader f = new FileReader(archivo);
      String [] array =new String[8];
      String[][] tablero = new String[8][8];
      String[] sol = new String[1];
      for(int i=0;i<8;i++){
          for(int j=0;j<8;j++){
                  tablero[i][j]="V";   
          }
      }
      
      int j=0;
      try (BufferedReader b = new BufferedReader(f)) {
          while((cadena = b.readLine())!=null) {
                array = cadena.split(","); 
                
                    if(j<8){
                        for(int i=0;i<8;i++){
                            
                            tablero[j][i]=array[i];
                        }
                    }else{
                        sol[0]=array[0];
                    }
                j=j+1;
              }
          }
      Pair problema = new Pair(tablero,sol);
      return problema;
      
      }
    
}
