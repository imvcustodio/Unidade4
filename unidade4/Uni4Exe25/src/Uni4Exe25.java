import java.util.Scanner;

public class Uni4Exe25 {
    /*  entrada: num1, num2 e option
        Processo:se option == 1, calcula a soma dos números, Se option == 2, calcula a diferença entre os números, se option == 3, calcula o produto dos números
        se option == 4, calcula a divisão do maior pelo menor, se option for inválida, exibe uma mensagem de erro.
        saida: O resultado da operação escolhida ou uma mensagem de erro.
     * 
     */
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
            switch (option) {
                case 1:
                    int soma = num + num2;
                    System.out.print(soma);
                    break;
                case 2:
                    if (num>=num2) {
                        int diferenca = num-num2;
                        System.out.print(diferenca);
                    }else{
                        int diferenca = num2-num;
                        System.out.print(diferenca);
                    }
                break;
                case 3:
                    int produto = num*num2;
                    System.out.print(produto);
                break;
                case 4:
                    if (num>=num2) {
                        int divisao = num/num2;
                        System.out.print(divisao);
                    }else{
                        int divisao = num2/num;
                        System.out.print(divisao);
                    }
                break;
                default:
                    break;
            }
            

    
        }

        scanner.close();
    }
}
