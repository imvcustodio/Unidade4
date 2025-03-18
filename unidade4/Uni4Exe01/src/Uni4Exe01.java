import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Horas Trabalhadas no mes: ");
        float horasT = scanner.nextFloat();
        System.out.println("Valor pago por hora: ");
        float salarioH = scanner.nextFloat();

        double salarioTotal =horasT*salarioH;

        if (horasT>160) {
            float salarioExtra =(horasT-160)*(salarioH/2);
            salarioTotal+=salarioExtra;
        }
    
        System.out.printf("O salario total é: R$ %.2f",salarioTotal);
        scanner.close();
    }
}
