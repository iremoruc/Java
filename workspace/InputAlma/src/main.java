
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        /*
        
        Scanner scanner = new Scanner(System.in); // ctrl + shift + I
        
         System.out.println("Lütfen Yaşınızı Girin");
        
        int yaş = scanner.nextInt();
        
        System.out.println("yaşınız:" + yaş);    
        
        */
        /*
        Scanner scanner = new Scanner(System.in); 
        
        if (scanner.hasNextInt()){
            int sayı = scanner.nextInt();
            System.out.println("sayı:" + sayı);
        }
        else {
            System.out.println("lütfen sayı giriniz!");
        }
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int yaş = scanner.nextInt();
        
        scanner.nextLine(); // Dummy(salakça)input alma.
                            // eğer bunu koymazsak yaşı girdikten sonra
                            // isimi yazamayız. int değerinden sonra
                            // bunu yazıp daha girilecek değerimiz olduğunu
                            // söylüyoruz.
        
        String isim = scanner.nextLine();
        
        System.out.println("yaş:" + yaş);
        System.out.println("isim:" + isim);
        
        
    }
    
}
