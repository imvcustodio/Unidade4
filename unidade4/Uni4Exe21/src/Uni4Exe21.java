import java.util.Scanner;

public class Uni4Exe21 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua massa:  "); 
        float massa = scanner.nextFloat();
        System.out.print("qual a sua altura:  "); 
        float altura = scanner.nextFloat();

        
        double imc = (massa/(Math.pow(altura, 2)));
        String classificação;

        if (imc<18.5) {
            classificação = "Magreza";
        }else if (imc>=18.5 && imc<=24.9) {
            classificação = "Saudavel";
        }else if (imc>=25 && imc<=29.9) {
            classificação = "Sobrepeso";
        }else if (imc>=30 && imc<=34.9) {
            classificação = "Obesidade Grau 1";
        }else if (imc>=35 && imc<=39.9) {
            classificação = "Obesidade Grau 2(severa)";
        }else{
            classificação = "Obesidade Grau 3(mórbida)";
        }

        System.out.println(classificação);
        scanner.close();
    }
}
