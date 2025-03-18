import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();

        String converted = letter.toUpperCase();

            switch (converted) {
                case "F":
                System.out.println("feminino"); 
                    break;
                case "M":
                System.out.println("Masculino");
                    break;
                case"I":
                System.out.println("Não informado");
                    break;
                
                default:
                System.out.println("Entrada incorrerta");
                    break;
            }
        
        scanner.close();
    }
}
