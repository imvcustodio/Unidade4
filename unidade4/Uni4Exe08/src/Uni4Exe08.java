import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma letra "); 
        String letter = scanner.next();
        String converted = letter.toUpperCase();
        if (converted.equals("A") || converted.equals("E") || converted.equals("I") 
        || converted.equals("O") || converted.equals("U") ) { // nao tem como eu somente colocar as vogais e o || assim   if (converted==( A || e || i || o || u )) pois ele n reconhece
            //entao eu tenho q fazera variavel.equals("letra").
            System.out.println("é Vogal");
        }else{
            System.out.println("Não é vogal");
        }
    
        scanner.close();
    }
}
