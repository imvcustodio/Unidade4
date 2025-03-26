import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        // Criar o objeto scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar hora e minuto de chegada
        System.out.print("Digite a hora de chegada : ");
        int horaChegada = scanner.nextInt();
        System.out.print("Digite os minutos de chegada : ");
        int minutoChegada = scanner.nextInt();

        // Solicitar hora e minuto de saída
        System.out.print("Digite a hora de saída : ");
        int horaSaida = scanner.nextInt();
        System.out.print("Digite os minutos de saída : ");
        int minutoSaida = scanner.nextInt();
        

        int totalMinutos = (horaSaida * 60 + minutoSaida) - (horaChegada * 60 + minutoChegada);
        //aqui acima e pra calcular o total de tempo em minutos
        
        // Arredondamento de horas
        int horas = totalMinutos/60;
        int minRest = totalMinutos%60;
        // aqui ele soma 29 para que qualquer numero que seja acima de 30 somado com 29 da pra dividir por 60 que no caso arredondaria para 1 hr 
        
        //aqui ele pega e ve se a hora arredondada  for == 0 ele coloca ela como 1 pq independente se ficar 10 ou 50 minutos ele tem que cobrar uma hora no minimo.
        float valorCobrar = 0;
        int horacobrada = horas;
      

       if (minRest>29) {
        horas += 1;
        horacobrada = horas;
       }else if (minRest<30) {
        horacobrada = horas;
       }

       DecimalFormat df = new DecimalFormat("#0.00");
     
        switch (horacobrada) {
            case 1:
                valorCobrar = horacobrada * 5;
                break;
            case 2:
                valorCobrar = horacobrada * 5;
                break;
            case 3:
                valorCobrar = (float) (10 + (horacobrada - 2) * 7.5);
                break;
            case 4:
                valorCobrar = (float) (10 + (horacobrada - 2) * 7.5);
                break;
            default:
                valorCobrar = (25 + (horacobrada-4)*10);
                break;
        }
        System.out.println("R$ "+df.format(valorCobrar));
        


        scanner.close();

    }
}

    }
}
