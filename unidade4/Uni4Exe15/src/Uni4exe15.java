import java.util.Scanner;

public class Uni4exe15 {
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
