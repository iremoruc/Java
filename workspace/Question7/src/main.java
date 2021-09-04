
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        /*
        STEP1: Kullanıcıdan bir tamsayı alın. Alınan sayının pozitif mi 
               negatif mi olduğunu ekrana yazdırın.

        STEP2: Alınan sayının tek mi çift mi olduğunu ekrana yadırın
        
        */
        
        Scanner scanner = new Scanner(System.in) ;
        
        System.out.print("Lütfen Bir Tamsayı Giriniz : ");
        int sayı = scanner.nextInt();
        int kalan = sayı % 2;
        
        
        if ( sayı < 0 ) {
            System.out.println("Sayı Negatif..");
        }
        else {
            System.out.println("Pozitif..");
        }
        if (kalan == 1) {
            System.out.println("Tek Sayı...");
        }
        else {
            System.out.println("Çift Sayı...");
        }                      
    }    
}
