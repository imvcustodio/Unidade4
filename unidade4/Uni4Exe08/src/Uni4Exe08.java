import java.util.Scanner;

public class Uni4Exe08 {
        //entrada: letter
        //processo: converter a letra para uma char e transformar em uppercase e especificar que quero somente a primeira letra, verificar se é A ou E ou I ou O ou U
        //saida:é vogal ou nao é vogal
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma letra "); 
        String letter = scanner.next();
        char converted = letter.toUpperCase().charAt(0);
        if (converted == 'A'|| converted == 'E'||converted == 'I'||converted == 'O'||converted == 'A'||converted == 'U') { // nao tem como eu somente colocar as vogais e o || assim   if (converted==( A || e || i || o || u )) pois ele n reconhece
            //entao eu tenho q fazera variavel.equals("letra").
            System.out.println("é Vogal");
        }else{
            System.out.println("Não é vogal");
        }
    
        scanner.close();
    }
}
