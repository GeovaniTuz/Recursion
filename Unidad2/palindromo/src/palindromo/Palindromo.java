
package palindromo;
import java.util.Scanner;

public class Palindromo {

   
        public static boolean paalin(String palabra){
    if(palabra.length() <= 1){
        return true;
    }else{
        if(palabra.charAt(0) == palabra.charAt(palabra.length() - 1)){
            return paalin(palabra.substring(1,palabra.length() - 1 ) );
        }else{
            return false;
        }
    }   
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner (System.in);
        String pala;
        
        System.out.println("Ingresa una palabra:  " );
        pala = x.nextLine();
        pala=pala.replace(" ", "");
        
        if(paalin(pala) == true){
            System.out.println("La palabra o frase; " +pala+ " es un palindromo");
    }else{
            System.out.println("La palabra o frase; " +pala+ " no es un palindromo");
        }
    
    }
    
}


