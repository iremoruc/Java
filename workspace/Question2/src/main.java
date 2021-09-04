
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);    
       
        int agirliktürü;
        int uzunluktürü;
        
        System.out.print("Lütfen Ağırlık Türünüzü Giriniz : \n Kilogram için= 1 "
                + "\n Gram için= 2 \n  ");   
        agirliktürü = scanner.nextInt();
        
        
        System.out.print("Lütfen Uzunluk Türünüzü Giriniz: \n Metre için= 1"
                + " \n Santimerte için= 2 \n ");
        uzunluktürü = scanner.nextInt();
        
        double agirlik;
        double en;
        double boy;
        double yukseklik;
        
        System.out.print("Ağırlık Değerinizi Giriniz : ");
        agirlik = scanner.nextDouble();
        
        System.out.print("En Uzunluğu Giriniz: ");
        en = scanner.nextInt();
        System.out.print("Boy Uzunluğu Giriniz: ");
        boy = scanner.nextInt();
        System.out.print("Yüksekliği Giriniz: ");
        yukseklik = scanner.nextInt();
        
        if (agirliktürü == 1) {
            agirlik = agirlik*1000;          
        }
        if (uzunluktürü == 1) {
            en = en * 100;
            boy = boy * 100;
            yukseklik = yukseklik * 100;
        }
        
        double hacim = en * boy * yukseklik;   
        double ozkutle = agirlik / hacim;
           
        System.out.println("ozkutle: " + ozkutle);
        
        
        if(ozkutle < 0.3) {
            System.out.println("Cisim Bir Gazdır...");
                    }
        else if (ozkutle >= 0.3 && ozkutle <= 2) {
            System.out.println("Cisim Bir Sıvırdır...");
        }
        else if (ozkutle > 2) {
            System.out.println("Cisim Bir Katıdır...");
        }       
    }  
}
