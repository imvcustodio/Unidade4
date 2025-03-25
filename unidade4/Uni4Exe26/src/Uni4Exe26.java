import java.util.Scanner;

public class Uni4Exe26 {
    /*entrada: T (base e altura do triângulo.), Q(lado do quadrado.), R( base e altura do retângulo.) ou C(raio do círculo.)
     * processo: se T calcular a are do triangulo usando a formula da are = base x altura/2
     * se Q Calcula a área do quadrado usando area = lado*lado
     * se R  Calcula a área do retângulo usando area = base X altura
     * se C calcular a area do circulo usando area= PI X (raio*raio)
     *  saida:  A área da figura escolhida ou caso a opção seja inválida exibira Opção invalida.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular a area de um triangulo de base b e altura h ");   
        System.out.println("Q: calcular a area de um quadrado de lado I ");  
        System.out.println("R:  calcular a area de um retangulo de base b e altura h");   
        System.out.println("C: calcular a area de um circulo de raio r ");
        String option = scanner.nextLine();
        char letter = option.toUpperCase().charAt(0);
        
        switch (letter) {
            case 'T':
                System.out.println("Qual a base do triangulo: ");
                float bTriangulo =  scanner.nextFloat();
                System.out.println("Qual a altura do triangulo: ");
                float hTriangulo =  scanner.nextFloat();
                
                float area = bTriangulo*hTriangulo/2;
                System.out.print(area);
                break;
            case 'Q':
                System.out.println("qual o lado do quadrado: ");
                float iQuadrado =  scanner.nextFloat();;
                
                float areaQuadrado = (float) Math.pow(iQuadrado,2);
                System.out.print(areaQuadrado);
                break;
            
            case 'R':
                System.out.println("Qual a base do retangulo: ");
                float bRetangulo =  scanner.nextFloat();
                System.out.println("Qual a altura do altura: ");
                float hRetangulo =  scanner.nextFloat();
                    
                float areaRetangulo = bRetangulo*hRetangulo;
                System.out.print(areaRetangulo);
                break;
            case 'C':
                System.out.println("Qual o raio do circulo: ");
                float raio =  scanner.nextFloat();
                float areaCirculo = (float) (3.14159 * Math.pow(raio, 2));
                System.out.printf("%.2f",areaCirculo);
                break;
            
            
            default:
            System.out.println("Opção invalida");
                break;
        }

        scanner.close();
    }
}
