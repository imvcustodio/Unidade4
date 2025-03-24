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
        int horasCobradas = (totalMinutos + 29) / 60;
        // aqui ele soma 29 para que qualquer numero que seja acima de 30 somado com 29 da pra dividir por 60 que no caso arredondaria para 1 hr 
        if (horasCobradas == 0) {
            horasCobradas = 1;
        }
        //aqui ele pega e ve se a hora arredondada  for == 0 ele coloca ela como 1 pq independente se ficar 10 ou 50 minutos ele tem que cobrar uma hora no minimo.
        
        // Cálculo do preço
        double preco;// var do prço
        if (horasCobradas <= 2){ 
        preco = horasCobradas * 5.00;// se a horacobrada for <= 2 entao preco recebe horas cobradas vezes 5 que e o valor para as 2 primeiras horas
        }else if (horasCobradas <= 4){ 
        preco = 10.00 + (horasCobradas - 2) * 7.50;// se horacobrada<= 4 entao preço recebe 10 das duas primeiras horas cobradas no caso as 4 -2 para tiras as 2 primeiras ja cobradas no + 10       
        }else{
        preco = 25.00 + (horasCobradas - 4) * 10.00; // aqui ele usa o valor 25 para denominar os 10 das 2 primeiras horas com os 15 das 3 e 4 hora pega horas cobradas - 4 pra tiras as horas que ja estao no 25 e entao multiplica o resto por 10 que e o valor do estacionamento para qm passar de 5 horas
        
        } 
        System.out.println("Tempo estacionado: " + (totalMinutos / 60) + "h " + (totalMinutos % 60) + "min");
        System.out.println("Horas cobradas: " + horasCobradas);
        System.out.printf("Valor a pagar: R$ %.2f\n", preco);

        scanner.close();

    }
}