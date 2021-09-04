
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        /*
        STEP1: Kullanıcıdan 3 adet double türünde kenar uzunluğu alın.
        ve bu 3 uzunluğun bir üçgen oluşturup oluşturamayacağını kontrol edin.
        kontrol etmeniz gereken şart şu: bir üçgenin herhangi bir kenarı
        diğer 2 kenarın uzunlukları toplamına eşit ya da daha fazla olamaz.
        
        input: 3/7/11                    ----------->  Üçgen mi: HAYIR (11> 7+3)
        input: 3,5/6/4                 ----------->  Üçgen mi: EVET
        input: 2,5/2,5/2,5           ----------->  Üçgen mi: EVET
        */
        
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
