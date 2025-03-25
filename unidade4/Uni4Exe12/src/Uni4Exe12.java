import java.util.Scanner;

public class Uni4Exe12 {
     /*entrada: lado1, lado2 e lado3
processo:verificar se os lados sao menores que a soma dos outros 2 lados caso nao seja imprima Não formam um triangulo,mas caso ele respeite as somas verifique
se todos os lados forem iguais ele e equilatero,  se tiver 2 lados iguais
e um diferente dos demais ele é isosceles e caso sejam todos diferentes ele é escaleno
saida: equilatero, isosceles, escaleno ou Não formam um triangulo*/
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
