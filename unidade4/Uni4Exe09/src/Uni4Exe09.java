import java.util.Scanner;
/*
Para verificar se um número é ou não múltiplo de outro, devemos 
encontrar um número inteiro de forma que a multiplicação entre 
eles resulte no primeiro número. Veja os exemplos: → O número 49 é 
múltiplo de 7,
 pois existe número inteiro que, multiplicado por 7, resulta em 49. */
public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero:  "); 
        int num = scanner.nextInt();
        System.out.println("Informe um numero:  "); 
        int num2 = scanner.nextInt();
        
        if (num%num2 == 0) {
            System.out.println("os valore são multiplos");
        }else{
            System.out.println("os valore não são multiplos");
        }

    
        scanner.close();
    }
}
