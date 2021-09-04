
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        
        String işlemler = "1. Toplama İşleme \n"
                       +"2. Çıkarma İşlemi \n"
                       +"3. Çarpma İşlemi \n"
                       +"4. Bölme işlemi" ;
        System.out.println(işlemler);
        System.out.println("----------------------");
        
        System.out.println("İşlem Seçiniz");
        String işlem = scanner.nextLine();
        
        int a;
        int b;
        
        switch (işlem) {
            case "1":
                System.out.print("Birinci Sayıyı Giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Giriniz: ");
                b = scanner.nextInt();
                System.out.print("Toplam= " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Sayıyı Giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Giriniz: ");
                b = scanner.nextInt();
                System.out.print("Fark= " + (a - b));
                break;
            case "3":    
                System.out.print("Birinci Sayıyı Giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Giriniz: ");
                b = scanner.nextInt();
                System.out.print("Toplam= " + (a * b));
                break;    
            case "4":
                System.out.print("Birinci Sayıyı Giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Giriniz: ");
                b = scanner.nextInt();
                System.out.print("bölüm= " + ((double)a / b));
                break;
            default: 
                System.out.println("Hatalı İşlem Girdiniz!!");
            
            
            
            
            
            
        }
                
              
       
               
                      
    }
}
