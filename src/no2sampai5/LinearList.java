/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2sampai5;

/**
 *
 * @author TOSHIBA
 */
public interface LinearList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public int indexOf(Object theElement);
    public Object remove(int index);
    public void add(int index, Object theElement);
    @Override
    public String toString();
    public void trimToSize();
    public Object setSize(int no);
    public Object clear();
    public Object removeRange(int index, int index2);
    public Object clone();
}
