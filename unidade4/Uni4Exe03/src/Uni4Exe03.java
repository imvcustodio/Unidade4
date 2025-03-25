import java.util.Scanner;

public class Uni4Exe03 {
    //entrada: num1, num2
    //processo: se o num1>num2 entao ele é o maior, se não o num2 é o maior
    //saida: num1 é maior que num2 ou num2 é maior que num1
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Numero 2: ");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.printf("O valor %d e maior que o valor %d",num1,num2);
        }else{
            System.out.printf("O valor %d e maior que o valor %d",num2,num1);
        }
    
        scanner.close();
    }
}
