import java.util.Scanner;

public class fluxograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do médico");
        String medico = scanner.nextLine();
        System.out.println("Informe a especialidade do médico");
        String especialidade = scanner.nextLine();

        if (medico == ""  && especialidade == "" ) {
            System.out.println("Não e possivel informar os dados");
            System.out.println("Vazio");
        }else{
            System.out.println("Médico "+medico);
            if (especialidade == "") {
                System.out.println("Especialista Vazio");
            }else{
                System.out.println("Especialidade "+especialidade);
            }
        }
        
        System.out.println("FIM");
        
        scanner.close();
    }
}
