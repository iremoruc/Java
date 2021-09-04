
import java.util.Scanner;


public class maiin {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int sayı = scanner.nextInt();
        
        switch (sayı){
            case 1:
                System.out.println("1.sayı");
                break;
            case 2:
                System.out.println("2.sayı");
                break;
            case 6:
                System.out.println("uğurlu sayımmm");
                break;
            default:
                System.out.println("böyle bi sayı yookk");
                
             // eğer her bir case'in sonuna break koymazsak her bir koşul sonuç 
             // üstteki koşul sağlasa da sağlamasa da çalıştırılır.
                
        }
        
        
    }
    
}
