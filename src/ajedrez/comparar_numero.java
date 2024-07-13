/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Comparator;

/**
 *
 * @author AlexGis
 */
public class comparar_numero implements Comparator{
    @Override
    public int compare(Object arg0, Object arg1) {
        Usuario c1=(Usuario)arg0;
        Usuario c2=(Usuario)arg1;
        if ((c1.getproblemas_intentados()) > c2.getproblemas_intentados()) return -1;
        if((c1.getproblemas_intentados()) < c2.getproblemas_intentados()) return 1;
        if((c1.getproblemas_intentados())== c2.getproblemas_intentados()) return 1;
        else return 0;
    }
}
