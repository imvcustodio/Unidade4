import java.util.Scanner;
/*entrada:diaVencimento, diaPagamento, prestacao
processo: se o diaPagamento<diaVencimento, a valor da prestação recebe um desconto de 10% e a prestação e subtraida pelo valor do desconto,
se nao se diaPagamento + 5>diaVencimento, diaPagamento -=diaVencimento para calcular quantos dias atrasou, e apos isso calculamos  um acrescento 
na prestação de 2% cada dia de atraso,desconto = (float)(diaPagamento*2) ,prestação = prestação+desconto;
saida: prestacao
*/
public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o dia do vencimento:  "); 
        int diaVencimento = scanner.nextInt();
        System.out.print("Informe o dia do pagamento :  "); 
        int diaPagamento = scanner.nextInt();
        System.out.print("Informe o valor da prestação :  "); 
        float prestacao = scanner.nextFloat();
        float desconto = 0;
        
        if (diaPagamento<diaVencimento) {
            desconto = (float) (prestação *0.10);
            prestacao = prestacao - desconto;
            System.out.printf("O pagamento esta em dia. O valor da prestação = R$%.2f",prestacao);
        }else if (diaPagamento + 5>diaVencimento) {
            diaPagamento -=diaVencimento;
            desconto = (float)(diaPagamento*2);
            prestação = prestação+desconto;
            System.out.printf("O pagamento esta atrasado. Multa de 2(porcento) por dia de atraso. Valor da prestação = R$%.1f",prestacao);
        }
            
    
        scanner.close();
    }
}
