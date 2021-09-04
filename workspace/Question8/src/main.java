
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        
           Scanner scanner = new Scanner(System.in) ;
        
        System.out.println("Lütfen Kenar Uzunluklarını Giriniz : ");
        
        System.out.print("Kenar1 : ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Kenar2 : ");
        double kenar2 = scanner.nextDouble();
        System.out.print("Kenar3 : ");
        double kenar3 = scanner.nextDouble();
        
        if ((kenar1 + kenar2 <= kenar3) || (kenar1 + kenar3 <= kenar2) || 
                (kenar3 + kenar2 <= kenar1) ) {
            System.out.println("Üçgen Oluşturmazzz");
        }      
        else {
            System.out.println("Üçgen Oluştururrr");   
        }         
    } 
}
