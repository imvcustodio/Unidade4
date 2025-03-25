import java.util.Scanner;

public class Uni4Exe02 {
    //entrada: valor
    //processo: se o valor%2 == o entao ele é par, se não ele é impar
    //saida: Par ou impar
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero maior que 0: ");
        int num = scanner.nextInt();

        if (num%2==0) {
            System.out.println("Numero é par!");
        }else{
            System.out.println("Numero é impar!");
        }
    
        scanner.close();
    }
}
