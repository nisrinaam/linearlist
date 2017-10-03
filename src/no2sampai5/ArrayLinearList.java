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
public class ArrayLinearList implements LinearList, Cloneable {

    protected Object [] element, element2;
    protected int size;

    //edit constructor untuk no 4 hal 172
    public ArrayLinearList (int initialCapacity){
        if(initialCapacity < 1){
            System.out.println("false");
            throw new IllegalArgumentException("panjang array harus lebih dari 1");
        }
        
        element = new Object[initialCapacity];
        
        if(initialCapacity == element.length){
        element = ChangeArrayLength.changeLength1D(element, 2*initialCapacity);
        }
    }

    public ArrayLinearList(){
        this(10);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
 
    @Override
    public int size() {
        return size;
    }

    void checkIndex(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return element[index];
    }

    @Override
    public int indexOf(Object theElement) {
        for (int i = 0; i < size; i++){
            if(element[i].equals(theElement))
                return i;
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement = element[index];
        for(int i = index + 1; i < size; i++){
            element[i-1] = element[i];
        }
        element[--size] = null;  
        return removedElement;

    }
    
    @Override
    public void add(int index, Object theElement) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        }

        if (size == element.length){
            ArrayLinearList ar =  new ArrayLinearList(size);
        }

        if(element.length > size){
        for (int i = size - 1; i>= index; i--){
            element[i+1]= element[i];
        }
        
        element[index] = theElement;
        
        size++;}
    }
    
    @Override
    public String toString(){
        
        StringBuffer s = new StringBuffer("[");
        
        for (int i = 0; i < size; i++){
            if (element[i] == null)
                s.append("null, ");
            else 
                s.append(element[i].toString() + ", ");
        }
        if (size > 0){
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");

        return new String(s);
                    
    }
    
    // coding soal no 5
    @Override
    public void trimToSize(){
        element2 = new Object[size];
        if (size < element.length) {
           System.arraycopy(element, 0, element2, 0, size);
                 
           element = element2;
        }
       
    }
    
    //coding soal no 6
    @Override
    public Object setSize(int no){
        if(size>no){
            int index = size - no;
            Object removedElement = element[no];
            for(int i=0; i<index;i++){
                for(int j = index + 1; j < size; j++)
                element[j-1] = element[j];

            element[--size] = null;
            }
            return removedElement;
        }
        else{
            element2 = new Object[no];
            System.arraycopy(element, 0, element2, 0, size);
                        
            element = element2;
            
        }
        return size;
    }
    
    //coding soal no 8
    @Override
    public Object clear(){
        for(int i = 0; i<size; i++){
            element[i] = null;
        }
        return element;
    }

    //coding soal no 9
    @Override
    public Object removeRange(int index, int index2) {
        checkIndex(index);
        checkIndex(index2);
        if(index<index2){
            for(int i = index2; i>=index; i--){
                remove(i);
            }
        }
        else{
            System.out.println("index pertama harus lebih kecil dari index ke dua");
        }
        return element;
    }

    //coding soal no 12
    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new Error("Something impossible just happened");
        }
    }
}

