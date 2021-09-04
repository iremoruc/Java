
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen 4 Basamaklı Bir Sayı Giriniz : ");
        int sayı = scanner.nextInt();
        
        if (sayı < 999 || sayı > 9999) {
            System.out.println("Hatalı Sayı Girdiniz!!!");
        }
        
        int bb ;
        int ob ;
        int yb ;
        int bnb ;
        
        bb = sayı % 10 ;
        ob = (sayı / 10) % 10 ;
        yb = ((sayı / 10) / 10) % 10 ;
        bnb = (((sayı / 10) / 10) / 10) % 10 ;
        
        System.out.println("Sayının Rakamlar Toplamı: " + (bb + ob + yb + bnb));
        
        int ters = bb * 1000 + ob * 100 + yb * 10 + bnb ;
        System.out.println("Sayının Tersi : " + ters);
        
        
        
        
                
       
                
        
        
    }
   











}