import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor1: ");
        int num = scanner.nextInt();
        System.out.print("Valor2: ");
        int num2 = scanner.nextInt();
        System.out.print("Opção: ");
        int option = scanner.nextInt();

        if (option>4&&option<1) {
            System.out.println("Erro Opção invalida");
        }else{

            if (option == 1) {
                int soma = num + num2;
                System.out.print(soma);
            } else if (option == 2) {
                if (num>=num2) {
                    int diferenca = num-num2;
                    System.out.print(diferenca);
                }else{
                    int diferenca = num2-num;
                    System.out.print(diferenca);
                }
            } else if (option == 3) {
                int produto = num*num2;
                System.out.print(produto);
            } else if (option == 4) {
                if (num>=num2) {
                    int divisao = num/num2;
                    System.out.print(divisao);
                }else{
                    int divisao = num2/num;
                    System.out.print(divisao);
                }
    
            }
        }

        scanner.close();
    }
}
