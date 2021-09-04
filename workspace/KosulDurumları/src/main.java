
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        /*
        if (koşul) {
        koşul sağlanırsa (true) bu blok çalışır.
        
        }
        
        else {
        bu bloğun üstündeki herhangi blok çalışmadığı sürece bu çalışır.
        
        }
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen yaşınızı giriniz..");
        
        int yaş = scanner.nextInt();
        
        if (yaş < 18){
            
            System.out.println("mekana giremezsinn");
        }
         
        else {
            
            System.out.println("Hoşgeldiniiiizzz..");
        }
       
      
    }
}
