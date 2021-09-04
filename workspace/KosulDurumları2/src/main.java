
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz..");
        
        int not = scanner.nextInt();
        
        if (not >= 85) {
             System.out.println("AA");
        }
        
        else if (not >= 75) {
             System.out.println("BB");
        }
        else if (not >= 65) {
             System.out.println("CC");
        }
        else if (not >= 55) {
             System.out.println("DD");
        }
        else {
             System.out.println("Dersten kaldınız...");
        }
        }
    }   
