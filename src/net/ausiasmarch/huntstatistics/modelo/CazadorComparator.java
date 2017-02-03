/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.huntstatistics.modelo;

import java.util.Comparator;

/**
 *
 * @author a053380739q
 */
public class CazadorComparator implements java.util.Comparator<Cazador>{

    @Override
    public int compare(Cazador c1, Cazador c2) {
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }
    
}
