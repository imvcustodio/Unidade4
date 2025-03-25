import java.util.Scanner;

public class Uni4Exe05 {
        //entrada: cor
        //processo: se(cor) é true; ou é false
        //saida: se é true, Sim se nao, Não
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A cor é azul: ");
        boolean cor = scanner.nextBoolean();

        if (cor){
            System.out.printf("Sim");
        }else{
            System.out.printf("Não");
        }
    
        scanner.close();
    }
}
