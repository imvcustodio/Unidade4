import java.util.Scanner;

public class UniExe14 {
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
