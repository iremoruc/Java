
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        /*
        STEP1: Kullanıcıdan bir yıl isteyin. Girilen yılın milattan sonra olup
        olmadığını (yani pozitif bir tamsayı olup olmadığını kontrol edin). 
        Değilse uyarı verin.

        STEP2: Girilen yılın artık yıl (yılın 366 gün) olup olmadığını 
        kontrol edin. Bir yılın 366 gün olması için şart şu. Yılın 4 ile 
        tam bölünmesi. AMA yıl 100'ün katı ise (örn 1700, 3000, 2100, 2000)
        bu yılın artık yıl olması için 400 ile tam bölünebilmesi .
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir Yıl Giriniz : ");
        int yıl = scanner.nextInt();
        int artıkyıl = yıl % 4 ;
        int artıkyıl2 = yıl % 100 ;
        int artıkyıl3 = yıl % 400 ;
        
        
        if (yıl < 0) {
                System.out.println("Hatalı Yıl Girdiniz!!!");
            } 
        else {
            
        }
        if (artıkyıl == 0 && artıkyıl2 != 0 && artıkyıl3 != 0) {
                System.out.println("Artık Yıl...");                 
            }
            else if (artıkyıl == 0 && artıkyıl2 == 0 && artıkyıl3 == 0) {
                System.out.println("Artık Yıl...");
            }
            else {
                System.out.println("Artık Yıl Diiil...");
            }
               
        
    }
    
}
