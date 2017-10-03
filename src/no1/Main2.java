/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author TOSHIBA
 */
public class Main2 {
    public static void main(String[] args) {
        
        Object [][] data ={
            {"Arin"  ,"1997" ,"Perempuan"     }, // baris ke-0
            {"Fahmi"   ,"1997" ,"Laki-Laki"     }, // baris ke-1
            {"Nisrina"   ,"1996" ,"Perempuan"     }, // baris ke-2
            {"Imron"   ,"1995" ,"Laki-Laki"     }, // baris ke-3
            {"Maghfiroh","1994" ,"Perempuan"}  // baris ke-4
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 3);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}
