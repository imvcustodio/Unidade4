import java.util.Scanner;

public class Uni4Exe11 {
    /*entrada: irmao1, irmao2 e irmao3
processo: se irmao1 == irmao2 && irmao1 == imrao3 imprima TRIGEMEOS
senao se irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3 imprima GEMEOS
senao imprima IRMAOS pois se não é nem 3 iguais ou 2 iguais são todos diferentes.
saida: TRIGEMEOS, GEMEOS OU IRMAOS*/
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int irmao1 = scanner.nextInt();
        
        int irmao2 = scanner.nextInt();
         
        int irmao3 = scanner.nextInt();
        
        if (irmao1 == irmao2 && irmao1 == irmao3) {
            System.out.printf("TRIGEMEOS");
        
        }else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
            System.out.printf("GEMEOS");
        }else{
            System.out.println("IRMAOS");
        }
            
    
        scanner.close();
    }
}
