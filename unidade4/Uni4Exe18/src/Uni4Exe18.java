import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o dia do vencimento:  "); 
        int diaVencimento = scanner.nextInt();
        System.out.print("Informe o dia do pagamento :  "); 
        int diaPagamento = scanner.nextInt();
        System.out.print("Informe o valor da prestação :  "); 
        float prestação = scanner.nextFloat();
        float desconto = 0;
        
        if (diaPagamento<diaVencimento) {
            desconto = (float) (prestação *0.10);
            prestação = prestação - desconto;
            System.out.printf("O pagamento esta em dia. O valor da prestação = R$%.2f",prestação);
        }else if (diaPagamento + 5>diaVencimento) {
            diaPagamento -=diaVencimento;
            desconto = (float)(diaPagamento*2);
            prestação = prestação+desconto;
            System.out.printf("O pagamento esta atrasado. Multa de 2(porcento) por dia de atraso. Valor da prestação = R$%.1f",prestação);
        }
            
    
        scanner.close();
    }
}
