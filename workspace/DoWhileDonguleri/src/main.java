
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        /* 
        int i = 0 ;
        do {
            System.out.println("i : " + i);
            i++;
            
        }while(i < 5 ) ;
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir Sayı giriniz : ");
         int sayı = scanner.nextInt();
         int toplam = 0 ;
         
         do {
             toplam += sayı % 10;
             
             sayı /= 10 ;
             
         }while(sayı > 10 );
         
         System.out.println("Rakamlar toplamı : " + toplam);
         
         
         
         
        
        
        
        
    }
    
}
