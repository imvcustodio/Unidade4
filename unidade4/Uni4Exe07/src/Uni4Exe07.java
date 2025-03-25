import java.util.Scanner;

public class Uni4Exe07 {
        //entrada: Peso
        //processo: se o peso for menor ou igual a 50 valor a pagar = 0.45, se nao calcular o pesoExcedido =  peso - 50;
        //qtdAdicional = (pesoExcedido/20)+1 , valorPagar = 0.45f + 0.45f * qtAdicional;
        //saida:valorPagar
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o Peso da carta"); 
        int peso = scanner.nextInt();

        float valorPagar=0;

        if (peso<=50) {
            valorPagar = (float) 0.45;
        }else{
            float pesoExcedido = peso - 50;
            
            float qtAdicional = (pesoExcedido/20)+1;

            valorPagar = 0.45f + 0.45f * qtAdicional;
        }
        System.out.printf("Custo do selo R$ %.2f",valorPagar);
        
        scanner.close();
    }
}
