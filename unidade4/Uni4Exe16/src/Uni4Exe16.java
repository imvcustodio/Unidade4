import java.util.Scanner;
/*entrada:homem1, homem2, mulher1,mulher2
processo: verificar qual o homem é mais velho entre os 2 e o acrescentar a variavel homemV e acrescentar o que não seja o mais velho a variavel homemN e
verifica qual a mulher é mais velha entre as 2 e o acrescentar a variavel mulherV e acrescentar a que não seja a mais velha a variavel mulherN
soma = homemV+mulherN
produto = homemN*mulherV
saida: soma e produto
*/
public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Homem 1");
        int homem1 = scanner.nextInt();
        System.out.println("Homem 2");
        int homem2 = scanner.nextInt();
        int homemV = 0;
        int homemN = 0;
        System.out.println("mulher 1");
        int mulher1 = scanner.nextInt();
        System.out.println("mulher 2");
        int mulher2 = scanner.nextInt();
        int mulherV = 0;
        int mulherN = 0;
        
        if (homem1>homem2 && mulher1>mulher2) {
            homemV = homem1;
            homemN = homem2;
            mulherV = mulher1;
            mulherN = mulher2;
        }else{
            homemV = homem2;
            homemN = homem1;
            mulherV = mulher2;
            mulherN = mulher1;
        }
        

        int soma = homemV + mulherN;
        int produto = homemN*mulherV;

        System.out.printf("Soma: %d\n",soma);
        System.out.printf("Produto: %d",produto);

        scanner.close();
    }
}
