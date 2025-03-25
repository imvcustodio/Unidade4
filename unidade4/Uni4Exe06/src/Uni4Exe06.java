import java.util.Scanner;

public class Uni4Exe06 {
        //entrada: letter
        //processo: se letter = F imprima Feminino
        //senao se letter = M imprima masculino
        //senao se letter = I imprima Não informado
        //senao imprima Entrada incorreta
        //saida: Feminino, masculino, Não informado ou Entrada incorreta
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        char l = palavra.toUpperCase().charAt(0);

            if (l == 'F') {
                System.out.println("feminino"); 
            }else if (l == 'M') {
                System.out.println("Masculino");
            }else if (l == 'I') {
                System.out.println("Não informado");
            }else{
                System.out.println("Entrada incorrerta");
            }

            System.out.println("Fim");
        scanner.close();
    }
}

