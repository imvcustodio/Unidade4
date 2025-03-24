import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular a area de um triangulo de base b e altura h ");   
        System.out.println("Q: calcular a area de umquadrado de lado I ");  
        System.out.println("R:  calcular a area de um retangulo de base b e altura h");   
        System.out.println("C: calcular a area de um circulo de raio r ");
        String option = scanner.nextLine();
        if (option.equalsIgnoreCase("T")) {
            System.out.println("Qual a base do triangulo: ");
            float bTriangulo =  scanner.nextFloat();
            System.out.println("Qual a altura do triangulo: ");
            float hTriangulo =  scanner.nextFloat();
            
            float area = bTriangulo*hTriangulo/2;
            System.out.print(area);
        }else if(option.equalsIgnoreCase("Q")) {
            System.out.println("Qual a base do triangulo: ");
            float iQuadrado =  scanner.nextFloat();;
            
            float areaQuadrado = (float) Math.pow(iQuadrado,2);
            System.out.print(areaQuadrado);
        }else if (option.equalsIgnoreCase("R")) {
            System.out.println("Qual a base do retangulo: ");
            float bRetangulo =  scanner.nextFloat();
            System.out.println("Qual a altura do altura: ");
            float hRetangulo =  scanner.nextFloat();
            
            float areaRetangulo = bRetangulo*hRetangulo;
            System.out.print(areaRetangulo);
        }else if (option.equalsIgnoreCase("C")) {
            System.out.println("Qual o raio do circulo: ");
            float raio =  scanner.nextFloat();
            float areaCirculo = (float) (3.14159 * Math.pow(raio, 2));
            System.out.printf("%.2f",areaCirculo);
        }

        scanner.close();
    }
}