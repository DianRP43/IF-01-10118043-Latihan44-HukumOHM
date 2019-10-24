
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner inpu = new Scanner(System.in);
        System.out.println("Kuat Arus\t\t: ");        
        float ka = inpu.nextFloat();
        
        System.out.println("Hambatan\t\t: ");
        float h = inpu.nextFloat();
        Baterai b = new Baterai(ka ,h);
        System.out.println("Hasil Tegangan\t: "+b.hitungTegangan());
    }
    
}
