import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1:  "); 
        float nota1 = scanner.nextFloat();
        System.out.print("Nota 2:  "); 
        float nota2 = scanner.nextFloat();
        System.out.print("Nota 3:  "); 
        float nota3 = scanner.nextFloat();
        System.out.print("Nota exercicios:  "); 
        float notaExercicios = scanner.nextFloat();
         
        
        double media = (nota1+nota2*2+nota3*3+notaExercicios)/7;

        String conceito;
        String aprovacao;

        if (media>=9) {
            conceito = "A";
        }else if (media>=7.5 && media<9) {
            conceito = "B";
        }else if (media>=6 &&media<7.5) {
            conceito = "C";
        }else if (media>=4 && media<6) {
            conceito = "D";
        }else{
            conceito = "E";
        }

        if (media>=6) {
            aprovacao = "Aprovado";
        }else{
            aprovacao = "Reprovado";
        }
            
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %s. Aprovação: %s.%n", media, conceito, aprovacao);

        scanner.close();
    }
}
