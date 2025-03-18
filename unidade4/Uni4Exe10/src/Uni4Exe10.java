import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a idade de Marquinhos:  "); 
        int marquinhos = scanner.nextInt();
        System.out.println("Informe a idade de Zezinho:  "); 
        int zezinho = scanner.nextInt();
        System.out.println("Informe a idade de Luluzinha:  "); 
        int luluzinha = scanner.nextInt();
        
        if (marquinhos < zezinho && marquinhos<luluzinha) {
            System.out.printf("Marquinhos é o caçula");
        
        }else if (zezinho<marquinhos && zezinho<luluzinha) {
            System.out.printf("zezinho é o caçula");
        }else{
            System.out.println("Luluzinha e a caçula");
        }
            
    
        scanner.close();
    }
}
