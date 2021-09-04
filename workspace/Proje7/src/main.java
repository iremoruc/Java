
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen İlk Vize Notunuzu Giriniz: ");
        int vize1 = scanner.nextInt();
        System.out.print("Lütfen İkinci Vize Notunuzu Giriniz: ");
        int vize2 = scanner.nextInt();
        System.out.print("Lütfen Final Notunuzu Giriniz: ");
        int finalnotu = scanner.nextInt();
        
        double ortalama = vize1 * 0.30 + vize2 * 0.30 + finalnotu * 0.40;
        
        if (ortalama >= 90) {
            System.out.println("AA ile geçtiniz..");
        } 
        else if (ortalama >= 85) {
            System.out.println("BA ile geçtiniz..");
        }
        else if (ortalama >= 80) {
            System.out.println("BB ile geçtiniz..");
        }
        else if (ortalama >= 75) {
            System.out.println("CB ile geçtiniz..");
        }
        else if (ortalama >= 70) {
            System.out.println("CC ile geçtiniz..");
        }
        else if (ortalama >= 65) {
            System.out.println("DC ile geçtiniz..");
        }
        else if (ortalama >= 60) {
            System.out.println("DD ile geçtiniz..");
        }
        else if (ortalama >= 55) {
            System.out.println("FD ile geçtiniz..");
        }
        else if (ortalama < 55) {
            System.out.println("FF ile kaldınız..");
        }
        
        
        
        
        
        
        
        
    }
    
}
