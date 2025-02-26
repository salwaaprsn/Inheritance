/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti23e;

import java.util.Scanner;

/**
 *
 * @author komputer 35
 */
public class ObjectBangunDatar {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("1.Bujur Sangkar");
        System.out.println("2.Segitiga");
        System.out.println("3.Persegi Panjang");
        System.out.println("-------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Pilihan");
        int pilihan = sc.nextInt();
        
        if(pilihan == 1){
            System.out.print("Isikan Panjang");
            int panjang = sc.nextInt();
            System.out.print("Isikan Lebar");
            int lebar = sc.nextInt();
            if(panjang==lebar){
                BujurSangkar bs = new BujurSangkar(panjang, lebar);
                int l = bs.getLuas();
                int k = bs.getKeliling();
                bs.info();
            }
            else{
                System.out.println("Panjang dan Lebar Harus Sama");
            }
        }
        
        if(pilihan==2){
            System.out.print("Isikan Alas");
            int panjang = sc.nextInt();
            System.out.print("Isikan Tinggi");
            int lebar = sc.nextInt();
            if(panjang==lebar){
                Segitiga st = new Segitiga(panjang, lebar);
                int l = st.getLuas();
                int k = st.getKeliling();
                st.info();
            }
            else{
                System.out.println("Panjang dan Lebar Harus Sama");
            }
        }
        
        if(pilihan==3){
            System.out.print("Isikan Panjang");
            int panjang = sc.nextInt();
            System.out.print("Isikan Lebar");
            int lebar = sc.nextInt();
            if(panjang==lebar){
                PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                int l = pp.getLuas();
                int k = pp.getKeliling();
                pp.info();
            }
            else{
                System.out.println("Panjang dan Lebar Harus Sama");
            }
        }
    }
}
