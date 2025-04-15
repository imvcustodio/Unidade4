import java.util.Scanner;

public class MenuLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos 3 dados
        System.out.print("Digite a primeira temperatura: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segunda temperatura: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceira temperatura: ");
        int num3 = scanner.nextInt();

        // Exibe o menu
        System.out.println("\nEscolha uma opção:");
        System.out.println("A - Maior temperatura registrada");
        System.out.println("B - Menor temperatura registrada");
        System.out.println("C - Mostrar os números em ordem crescente");
        System.out.println("D - Media das temperaturas");

        System.out.print("Digite a letra da opção desejada: ");
        String palavra = scanner.next();
        char opcao = palavra.toUpperCase().charAt(0);

        // Switch para manipular as opções
        switch (opcao) {
            case 'A':
                int maior = Math.max(num1, Math.max(num2, num3));
                System.out.println("Maior temperatura registrada: "+maior);
                break;
            case 'B':
                int menor = Math.min(num1, Math.min(num2,num3));
                System.out.println("Menor temperatura registrada: "+menor);
                break;
            case 'C':
                if (num1 <= num2 && num1 <= num3) {
                    if (num2 <= num3) {
                        System.out.println("temperaturas ordenados em ordem crescente: " + num1 + " " + num2 + " " + num3);
                    } else {
                        System.out.println("temperaturas ordenados em ordem crescente: " + num1 + " " + num3 + " " + num2);
                    }
                } else if (num2 <= num1 && num2 <= num3) {
                    if (num1 <= num3) {
                        System.out.println("temperaturas ordenados em ordem crescente: " + num2 + " " + num1 + " " + num3);
                    } else {
                        System.out.println("temperaturas ordenados em ordem crescente: " + num2 + " " + num3 + " " + num1);
                    }
                } else {
                    if (num1 <= num2) {
                        System.out.println("temperaturas ordenados em ordem crescente: " + num3 + " " + num1 + " " + num2);
                    } else {
                        System.out.println("temperaturas ordenados em ordem crescente: " + num3 + " " + num2 + " " + num1);
                    }
                }        
                break;
            case 'D':
                double media = (num1+num2+num3)/3;
                System.out.println("A Media das temperaturas é: "+media);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
