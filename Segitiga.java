/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti23e;

/**
 *
 * @author komputer 35
 */
public class Segitiga extends BangunDatar{
    int luas;
    int keliling;
    
    public Segitiga(int panjang, int lebar){
        super(panjang, lebar);
    }
    
    public int getLuas(){
        luas = super.getPanjang() *  super.getLebar() / 2;
        return luas;
    }
    
    public int getKeliling(){
        keliling = 3 * super.getPanjang();
        return keliling;
    }
    
    public void info(){
        System.out.println("Luas Segitiga :" + getLuas());
        System.out.println("Keliling Segitiga :" + getKeliling());
        System.out.println("---------------------------");
    }
}
