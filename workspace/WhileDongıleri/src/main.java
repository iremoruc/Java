
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        /*
         while (döngü koşulu
             koşul doğru old sürece çalışır.
        */
        
        /*       int i = 0 ;
        while(i < 10) {
            System.out.println("i : " + i);
            i++ ;
        }
        */
        /*
        int a = 10 ;
        while(a < 100) {
            System.out.println("a : " + a);
            a += 5 ;
        }*/
        
        System.out.print("Bir Sayı Giriniz : ");
        
        Scanner scanner = new Scanner(System.in) ; 
        
        int sayı = scanner.nextInt();
        int fakt = 1 ;
        
        while(sayı > 0) {
            fakt *= sayı ;
            sayı-- ;
        }
        System.out.println("Faktoriyel : " + fakt);
        
        
        
    }
}
