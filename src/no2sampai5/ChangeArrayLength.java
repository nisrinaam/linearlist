/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2sampai5;

import java.lang.reflect.Array;

/**
 *
 * @author TOSHIBA
 */
public class ChangeArrayLength {
    public static Object [] changeLength1D(Object [] a, int n, int newLength){
        
        if (n> newLength){
            throw new IllegalArgumentException("ukuran array terlalu kecil");
        }

        Object [] newArray = (Object []) Array.newInstance(a.getClass().getComponentType(), newLength);
        
        System.arraycopy(a, 0, newArray, 0, n);
        
        return newArray;
    }
    
    public static Object [] changeLength1D(Object[] a, int newLength){
        return changeLength1D(a, a.length, newLength);
    }
    
}
