
public class main {
    public static void main(String[] args) {
        /* int = bellekte 32 bit yani 4 byte'lık yer kaplıyor.
           byte= bellekte 8  bit yani 1 byte'lık yer kaplıyor.
           short=bellekte 16 bit yani 2 byte'lık yer kaplıyor.
           long= bellekte 64 bit yani 8 byte'lık yer kaplıyor.
           System.out.println(Long.MAX_VALUE); veri tipinin alab. max değer
           byte --> short --> int --> long 
        
        */
        byte a = 100;
        byte b = (byte)(a / 2);  /*a byte olarak verilmiş 2 int değeri olduğu 
                                   için başında parantez içinde biz bu değeri
                                   btye a dönüştür dedik */
        
    }     
    
}
