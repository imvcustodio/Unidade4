import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Homem");
        int homem1 = scanner.nextInt();
        System.out.println("Homem");
        int homem2 = scanner.nextInt();
        int homemV = 0;
        int homemN = 0;
        System.out.println("mulher");
        int mulher1 = scanner.nextInt();
        System.out.println("mulher");
        int mulher2 = scanner.nextInt();
        int mulherV = 0;
        int mulherN = 0;
        
        if (homem1>homem2) {
            homemV = homem1;
            homemN = homem2;
        }else{
            homemV = homem2;
            homemN = homem1;
        }
        
        if (mulher1>mulher2) {
            mulherV = mulher1;
            mulherN = mulher2;
        }else{
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
