import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lado1");
        int lado1 = scanner.nextInt();

        System.out.println("lado2");
        int lado2 = scanner.nextInt();

        System.out.println("lado3");
        int lado3 = scanner.nextInt();

        if (lado1<(lado2+lado3)&&lado2<(lado1+lado3)&&lado3<(lado1+lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("E equilatero");
            }else if (lado1==lado2|| lado1==lado3||lado2==lado3) {
                System.out.println("E isósceles");
            }else{
                System.out.println("E escaleno");
            }
        }else{
            
        System.out.println("Não formam um triangulo");
        }
        scanner.close();
    }
}
