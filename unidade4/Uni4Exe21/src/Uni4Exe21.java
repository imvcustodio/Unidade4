import java.util.Scanner;

public class Uni4Exe21 {
    /*entradas massa, altura
    processo: imc recebe o valor de calculo que é massa dividido por altura ao quadrado (massa/(Math.pow(altura, 2)), se o imc<18.5 classificacao = Magreza
    se o imc>=18.5 && imc<=24.9 classificacao = Saudavel, se imc>=25 && imc<=29.9 classificacao = Sobrepeso, se imc>=30 && imc<=34.9  classificacao = Obesidade Grau 1
    se imc>=35 && imc<=39.9 classificacao = Obesidade Grau 2(severa), senao  classificação = "Obesidade Grau 3(mórbida)";
    saida: classificacao
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua massa:  "); 
        float massa = scanner.nextFloat();
        System.out.print("qual a sua altura:  "); 
        float altura = scanner.nextFloat();

        
        double imc = (massa/(Math.pow(altura, 2)));
        String classificacao;

        if (imc<18.5) {
            classificacao = "Magreza";
        }else if (imc>=18.5 && imc<=24.9) {
            classificacao = "Saudavel";
        }else if (imc>=25 && imc<=29.9) {
            classificacao = "Sobrepeso";
        }else if (imc>=30 && imc<=34.9) {
            classificacao = "Obesidade Grau 1";
        }else if (imc>=35 && imc<=39.9) {
            classificacao = "Obesidade Grau 2(severa)";
        }else{
            classificacao = "Obesidade Grau 3(mórbida)";
        }

        System.out.println(classificacao);
        scanner.close();
    }
}
