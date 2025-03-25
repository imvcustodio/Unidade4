import java.util.Scanner;

public class Uni4Exe22 {
/*entradas: titulacao
    processo: se titulacao == 1 curso = Bacharel em ciencia da computação, se titulacao == 2 curso == Licenciado em computação, se  titulacao == 3 curso == Bacharel em sistemas da informação. 
    saida: curso
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual titulação deseja, (1/2/3):  "); 
        int titulacao = scanner.nextInt();
        String curso = null;
        switch (titulacao) {
            case 1:
                curso = "Bacharel em ciencia da computação";
                break;
            case 2:
                curso = "Licenciado em computação";
                break;
            case 3:
                curso= "Bacharel em sistemas da informação";
                break;
            default:
                break;
        }
        System.out.print(curso);

        scanner.close();
    }
}
