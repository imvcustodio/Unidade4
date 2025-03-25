import java.util.Scanner;
/*entrada: num, num2
processo: se num%num2 == 0 ou num2%num == 0 caso seja sao multiplos caso não seja não sao multiplos
saida: os valores sao multiplos ou os valore não são multiplos*/
public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero:  "); 
        int num = scanner.nextInt();
        System.out.println("Informe um numero:  "); 
        int num2 = scanner.nextInt();
        
        if (num%num2 == 0 || num2%num == 0) {
            System.out.println("os valore são multiplos");
        }else{
            System.out.println("os valore não são multiplos");
        }

    
        scanner.close();
    }
}
