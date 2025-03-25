import java.util.Scanner;

public class UniExe14 {
    /*entrada: dia, mes e ano
    processo: se o dia for maior que 0 e dia for menor que 32 e se mes for maior que 0 e mes for menor que 13 e ano > 0 é valido senao imprima Não valida
    caso for valida verificar se mes e igual a 1 ou 3 ou 5 ou 7 ou 8 ou 10 ou 12 caso seja imprima é valida, senao se verificar se o mes é diferente de 2 e dia<31 caso seja imprima é valisa
    senao se verificar se o mes == 2 e dia <29 caso seja imprima é valida se nao se (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) para calcular se o ano é bissesto caso seja
    verdadeiro imprima é valida senao imprima não é valida.
    saida: é valida ou nao é valida*/
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dia");
        int dia = scanner.nextInt();

        System.out.println("Mes");
        int mes = scanner.nextInt();

        System.out.println("Ano");
        int ano = scanner.nextInt();
        
        if (dia>0 && dia<32 && mes>0 && mes<13 && ano>0) {
            if (mes ==1||mes ==3||mes ==5||mes ==7||mes==8||mes==10||mes==12) {
                System.out.println("é valida");
            }else if (mes!=2 && dia<31) {
                System.out.println("é valida");
            }else if (mes == 2 && dia<29) {
                System.out.println("é valida");
            }else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("E valida");
            }else{
                System.out.println("Não  valida");
            }
        }else{
            System.out.println("Não  valida");
        }

        scanner.close();
    }
}
