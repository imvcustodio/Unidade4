import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();


            if (letter.equalsIgnoreCase("F")) {
                System.out.println("feminino"); 
            }else if (letter.equalsIgnoreCase("M")) {
                System.out.println("Masculino");
            }else if (letter.equalsIgnoreCase("I")) {
                System.out.println("Não informado");
            }else{
                System.out.println("Entrada incorrerta");
            }

        
        scanner.close();
    }
}
