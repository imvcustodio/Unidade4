import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero: ");
        float num1 = scanner.nextFloat();

        if (num1%1==0) {
            System.out.printf("Não Foram digitadas casas decimais");
        }else{
            System.out.printf("foram digitadas casas decimais");
        }
    
        scanner.close();
    }
}
