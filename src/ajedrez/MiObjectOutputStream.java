/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author AlexGis
 */
public class MiObjectOutputStream extends ObjectOutputStream{
    protected void writeStreamHeader() throws IOException{}
    public MiObjectOutputStream() throws IOException{
        super();
    }
    public MiObjectOutputStream(OutputStream o) throws IOException{
        super(o);
    }
}
