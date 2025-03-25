import java.util.Scanner;

public class Uni4exe15 {
      /*entrada: mes
    processo: se o mes de admissao for menor ou igual a 12 ira receber reajuste de 5%, caso mes de admissao seja de 13 a 48 recebe eajuste de 7%
    se nao imprima reajuste não informado
    saida:O funcionario ira receber 5% de reajuste, O funcionario ira receber 7% de reajuste ou Reajuste não informado*/
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mes");
        int mes = scanner.nextInt();
        int reajuste = 0;
        if (mes<=12) {
            reajuste = 5;
            System.out.printf("O funcionario ira receber %d de reajuste",reajuste);
        }else if (mes>=13 && mes<=48) {
            reajuste = 7;
            System.out.printf("O funcionario ira receber %d de reajuste",reajuste);
        }else{
            System.out.printf("Reajuste não informado");
        }

        scanner.close();
    }
}
