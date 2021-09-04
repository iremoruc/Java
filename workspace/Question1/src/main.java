
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen birinci ismi giriniz:"); 
        String isim1  = scanner.nextLine();
        System.out.print("lütfen ikinci ismi giriniz:"); 
        String isim2 = scanner.nextLine();
        
        
        System.out.print("Lütfen ilk notu giriniz:");
        int not1 = scanner.nextInt();
        System.out.print("Lütfen ikinci notu giriniz:");
        int not2 = scanner.nextInt();
        
        
        if (((not1 > 100) || (not1 < 0)) && ((not2 > 0) && (not2 < 100))) {
            System.out.println("Birinci Not Hatalı!");
        }
        else if (((not2 > 100) || (not2 < 0)) && ((not1 > 0) && (not1 < 100))) {
            System.out.println("İkinci Not Hatalı!");
        }
        else if (((not1 > 100) || (not1 < 0)) && ((not2 > 100) || (not2 < 0))) {
            System.out.println("Her İki Not Hatalı!!");
        }
        else if (not1 > not2 ) {
            System.out.println("Tebriklerrr " + isim1);
        }
        else if (not2 > not1) {
            System.out.println("Tebriklerrr " + isim2);
        }
        else if (not1 == not2) {
            System.out.println(" Tebriklerrr " + isim1 + " ve " + isim2 );
                                 
        }
       
             
        
                
    }
}
