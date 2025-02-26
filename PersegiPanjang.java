/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti23e;

/**
 *
 * @author komputer 35
 */
public class PersegiPanjang extends BangunDatar{
    int luas;
    int keliling;
    
    public PersegiPanjang(int panjang, int lebar){
        super(panjang, lebar);
    }
    
    public int getLuas(){
        luas = super.getPanjang() *  super.getLebar();
        return luas;
    }
    
    public int getKeliling(){
        keliling = 4 * super.getPanjang();
        return keliling;
    }
    
    public void info(){
        System.out.println("Luas Persegi Panjang :" + getLuas());
        System.out.println("Keliling Persegi Panjang :" + getKeliling());
        System.out.println("---------------------------");
    }
}
