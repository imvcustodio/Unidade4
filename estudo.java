
import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscolha uma opção:");
        System.out.println("C - Cartao de credito");
        System.out.println("D - Cartao de debito");
        System.out.println("P - Para PIX");
        System.out.println("B - Para boleto");
        String metodo = scanner.nextLine().toUpperCase();
        
        char letra  = metodo.charAt(0);

        if(letra == 'C'|| letra == 'D' || letra == 'P' || letra == 'B'){
            if( letra == 'C' ){
                System.out.println("Cartao de credito");
            }else if ( letra == 'D' ) {
                System.out.println("Cartao de debito");
            }else if ( letra == 'P' ) {
                System.out.println("Para PIX");
            }else{
                System.out.println("Para boleto");
            }
        }else{
            System.out.println("entrada incorreta");
        }
        
        scanner.close();
    }
}
