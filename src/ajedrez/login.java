/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;


import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pc
 */
public class login implements Serializable{
    private HashSet<Usuario> usuarios =new HashSet<Usuario>();
    
    
    public HashSet<Usuario> getusuarios() {
        return usuarios;
    }
    
    public void registra (Usuario user) throws EProblemasRegistro{
        boolean existe=false;
        for(Usuario u:usuarios){
            if(u.getnombre().equals(user.getnombre()))
                existe=true;
        }
        if (existe)
           throw new EProblemasRegistro("usuario ya registrado");
        else
            usuarios.add(user);
}
public boolean autentica (Usuario user) throws EProblemasRegistro{
    boolean encontrado = false;
    Iterator it = usuarios.iterator();
    while (it.hasNext() && !encontrado){
        Usuario u = (Usuario) it.next();
        if (u.getnombre().equals(user.getnombre()) &&
            u.getpsw().equals (user.getpsw())){
                System.out.println ("bienvenido" + u.getnombre());
                encontrado = true;
                }
        if (encontrado == false)
        throw new EProblemasRegistro("Usuario no encontrado");
    }   
    return encontrado;
}
public boolean autenticanombre (Usuario user) throws EProblemasRegistro{
    
    login log = new login();
        boolean enc=false;
        HashSet userss=log.getusuarios();
       
        try(ObjectInputStream ob=new ObjectInputStream(new FileInputStream("users.bin"))){
            while(true){
                Usuario aux=(Usuario) ob.readObject();
                userss.add(aux);
                System.out.println(userss);/*
                System.out.println(aux.getnombre());
                System.out.println(aux.getpsw());*/
                
            }
            
        }
        catch(EOFException e){System.out.println(e.getMessage());}
        catch(IOException e3){System.out.println(e3.getMessage());}
        catch (ClassNotFoundException ex) {
            Logger.getLogger(interfaz_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //if(log.autentica(user)){
        for(Usuario u : log.getusuarios()){
            if(user.getnombre().equals(u.getnombre())){
                enc=true;
                user=u;
            }
        }
    return enc;
}
public boolean autenticanombreypsw (Usuario user) throws EProblemasRegistro{
    
    login log = new login();
        boolean enc=false;
        HashSet userss=log.getusuarios();
       
        try(ObjectInputStream ob=new ObjectInputStream(new FileInputStream("users.bin"))){
            while(true){
                Usuario aux=(Usuario) ob.readObject();
                userss.add(aux);
                System.out.println(userss);/*
                System.out.println(aux.getnombre());
                System.out.println(aux.getpsw());*/
                
            }
            
        }
        catch(EOFException e){System.out.println(e.getMessage());}
        catch(IOException e3){System.out.println(e3.getMessage());}
        catch (ClassNotFoundException ex) {
            Logger.getLogger(interfaz_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //if(log.autentica(user)){
        for(Usuario u : log.getusuarios()){
            if(user.getnombre().equals(u.getnombre()) && user.getpsw().equals(u.getpsw())){
                enc=true;
                user=u;
            }
        }
    return enc;
}
}

    

