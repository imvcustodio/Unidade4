import java.util.Scanner;
/*entrada: marquinhos , zezinho e luluzinha
processo: se marquinhos for o mais novo entre zezinho e luluzinha imprima Marquinhos e o caçula
se zezinho for o mais novo entre marquinhos e luluzinha imprima zezinho e o caçula
se luluzinha for a mais nova entre marquinhos e zezinho imprima luluzinha e a caçula
saida:Marquinhos e o caçula ou zezinho e o caçula ou  luluzinha e a caçula */
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
