import java.util.Scanner;

public class exe27 {
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

        int diferencaH = horaSaida-horaChegada;

        int minPermanencia = (60 - minutoChegada)+minutoSaida;
        if(minutoChegada>1){
            diferencaH-=1;
        }
        if(minPermanencia>=60){
            diferencaH++;
            minPermanencia= minPermanencia-60;//aqui como eu adicionei uma hr acima no diferencaH ++ eu preciso tirar 60 minutos do meu permanencia se nao ele acrescentaria uma hr amais no meu programa.
        }
        int cobrar = 0;
        if(diferencaH<1){
            if(minPermanencia<30){
                cobrar = 1;
            }else{
                cobrar++;
            }
        }
        System.out.println(cobrar);
        System.out.printf("hr, min %d %d",diferencaH,minPermanencia);

        scanner.close();
    }
}
