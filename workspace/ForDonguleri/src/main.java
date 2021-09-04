
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
       /*
        for ( başlatma ; koşul ; arttırma veya azaltma işlemleri) {
            döngü koşulumuz doğru olduğu sürece burası çalışacak.
        
        }
        */
        /*
        int i; // değişkeni aşağıda dögünün içinde de tanımlayabilirsin.
        for (i = 0 ; i < 5 ; i++) {
        System.out.println("i = " + i);
        }
        
        for (int a = 10 ; a >= 0 ; a--) {
            System.out.println("a = " + a);
        }
        */
        /*
        int b = 5; // bi değer atadığımız için başlatma kısmında yazmadık.
        
        for(; b <= 12 ; b++) {
            System.out.println("Seni Seviyorum Emir");    
        }
        */
        /*
        int k = 10 ;
        int l = 0 ;
        
        for(; k >= 0 && l <= 10 ; k-- , l ++) {
            System.out.println(k);
            System.out.println(l);
        }
        */
        /*
        for(int z = 2 ; z < 100 ; z *= 2) {
            System.out.println(z);            
        }
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Sayı Giriniz : ");
        
        int fakt = 1;
        int sayı = scanner.nextInt();
        
        for(int i = 1 ; i <= sayı ; i++ ) {
            fakt *= i ;
            System.out.println("fakt : " + fakt);
        }
            
    }
}
