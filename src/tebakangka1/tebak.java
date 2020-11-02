/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka1;

/**
 *
 * @author azmig
 */

/*Import Library*/
import java.util.Scanner;
import java.util.Random;

public class tebak {
    /*Membuat Atribut*/
    int angka;
    int tebakan;
    
    /*Membuat Method(s)*/
    void jawab(){
        /*Instansiasi object dari lib scanner dan random*/
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        angka = ran.nextInt(101);
        tebakan = 0;
        System.out.println("Hai, program ini telah memilih satu angka acak dari 1 sampai 100. Silahkan anda tebak!");
        do {
            System.out.println("Masukkan tebakan anda:");
            tebakan = input.nextInt();
            if (tebakan == angka) {
                System.out.println("Yeay tebakan anda benar, terimakasih telah bermain");
                break;
            }
            else{
                if (tebakan < angka){
                    System.out.println("Tebakan anda lebih kecil dari angka yang telah di acak. Silahkan tebak ulang!");
                }
                else if (tebakan > angka){
                    System.out.println("Tebakan anda lebih besar dari angka yang telah di acak. Silahkan tebak ulang!");
                }
            }
        } while (tebakan != angka);
        
    }
}
