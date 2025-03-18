import java.util.Scanner;

public class Uni4Exe11 {
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
