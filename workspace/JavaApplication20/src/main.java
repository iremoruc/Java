
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu Giriniz: ");
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu giriniz (örn: 1.72): ");
        double boy = scanner.nextDouble();
        
        double BKİ = (kilo / (boy * boy));
        
        if ( BKİ < 18.5) {
            System.out.println("Zayıfsınız..");
        }
        else if ( BKİ > 18.5 && BKİ < 25) {
            System.out.println("Normal Kilonuzdasınız..");
        }  
        else if ( BKİ > 25 && BKİ < 30) {
            System.out.println("Fazla Kilolusunuz..");
        }
        else {
            System.out.println("Obezsiniz..");
        }
    }
    
}
