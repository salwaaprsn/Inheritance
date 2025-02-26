/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti23e;

/**
 *
 * @author komputer 35
 */
public class BujurSangkar extends BangunDatar {
    int luas;
    int keliling;
    
    public BujurSangkar(int panjang, int lebar){
        super(panjang, lebar);
    }
    
    public int getLuas(){
        return super.getPanjang() * super.getLebar();
    }
    
    public int getKeliling(){
        return 4 * super.getPanjang();
    }
    
    public void info(){
        System.out.println("Luas Bujur Sangkar :" + getLuas());
        System.out.println("Keliling Bujur Sangkar :" + getKeliling());
        System.out.println("---------------------------");
    }
}
