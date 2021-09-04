
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
            
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir Yıl Giriniz : ");
        int yıl = scanner.nextInt();
        int artıkyıl = yıl % 4 ;
        int artıkyıl2 = yıl % 400 ;
        int artıkyıl3= yıl % 100;
        
        if (yıl < 0) {
            System.out.println("Hatalı Yıl Girdiniz!!!");  
        }            
        if(artıkyıl == 0) {
            System.out.println("Artık Yıl...");
            if (((artıkyıl2 == 0) && (artıkyıl3 == 0))){
                System.out.println("Artık Yıl...");
            }          
        }
        else {
            System.out.println("Artık Yıl Diiilll...");
        }       
        
        /*
        else if(artıkyıl == 0 ||(artıkyıl == 0 ||artıktıl2 == 0 && artıkyıl3 == 0) )
        
        
        
        */
        
        
        
        
    }
}
