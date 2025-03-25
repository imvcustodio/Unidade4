import java.util.Scanner;

public class Uni4Exe23 {
    /*entradas: num
    processo: se num == 1 mes = janeiro,se num == 2 mes = fevereiro ,se num == 3 mes = março, se num == 4 mes = abril, se num == 5 mes = maio, se num == 6 mes = junho
    se num == 7 mes = julho, se num == 8 mes = agosto, se num == 9 mes = setembro, se num == 10 mes = outubro, se num == 11 mes = novembro, se num == 12 mes = dezembro
    se num > 12 imprima valor invalidao
    saida: mes
     */
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
