package praktikum21;
import java.util.Scanner;

public class Praktikum2Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi;
        //input
        System.out.print("Panjang: "); panjang = input.nextInt();
        System.out.print("Lebar: ");  lebar = input.nextInt();
        System.out.print("Tinggi: "); tinggi = input.nextInt();
        
        //deklarasi total hasil dari volume balok
        double volume = (double) panjang*lebar*tinggi;
        //output dari volume balok
        System.out.println("Volume balok adalah " + volume);
    }
    
}
