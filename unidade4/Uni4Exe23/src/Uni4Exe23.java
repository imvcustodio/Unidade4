import java.util.Scanner;

public class Uni4Exe23 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero inteiro positivo: ");
        int num = scanner.nextInt();
        String mes = "";
        switch (num) {
            case 1:
                mes = "Janeiro";
                
                break;

            case 2:
                mes = "Fevereiro";
                break;

            case 3:
                mes = "Março";
                break;

            case 4:
                mes = "Abril";
                break;

            case 5:
                mes = "Maio";
                break;

            case 6:
                mes = "Junho";
                break;

            case 7:
                mes = "Julho";
                break;

            case 8:
                mes = "agosto";
                break;

            case 9:
                mes = "setembro";
                break;

            case 10:
                mes = "Outubro";
                break;

            case 11:
                mes = "Novembro";
                break;

            case 12:
                mes = "Dezembro";
                break;
                
            default:
                if (num > 12) {
                    System.out.println("Valor Invalido");
                }
            break;
               
        }
        
        System.out.printf(mes);
        scanner.close();
    }
}
