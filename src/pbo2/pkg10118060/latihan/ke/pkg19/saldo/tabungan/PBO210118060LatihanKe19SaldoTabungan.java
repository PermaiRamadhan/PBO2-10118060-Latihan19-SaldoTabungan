/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg19.saldo.tabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author 
 * Nama :Permai Ramadhan
 * NIM  :10118060
 * Deskripsi Program    : program saldo tabungan
 */
public class PBO210118060LatihanKe19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("");
        dfs.setMonetaryDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        df.setDecimalFormatSymbols(dfs);
    
        double saldo=2500000;
        String hsl;
        for (int i = 1; i < 7; i++) {
            saldo=saldo+(saldo*0.15);
            hsl = "Rp. " + df.format(saldo);
            System.out.println("Saldo di bulan ke-"+i+" "+hsl);
       
        }
    }
    
}
