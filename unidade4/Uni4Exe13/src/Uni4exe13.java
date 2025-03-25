import java.util.Scanner;

public class Uni4exe13 {
    /*entrada: carta1,carta2,carta3
    processo: se a carta1 for 1 ,2 ou 3 qntCartaBoa recebe 1; se carta2 for 1 ,2 ou 3 qntCartaBoa recebe qntCartaBoa + 1;
    se carta3 for 1 ,2 ou 3 qntCartaBoa recebe qntCartaBoa + 1
    se qntCartaBoa 1 imprima TRUCO
    se qntCartaBoa 2 imprima SEIS
    se qntCartaBoa 3 imprima NOVE
    saida: TRUCO, SEIS ou NOVE*/
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("carta1");
        int carta1 = scanner.nextInt();

        System.out.println("carta2");
        int carta2 = scanner.nextInt();

        System.out.println("carta3");
        int carta3 = scanner.nextInt();
        int qntCartaBoa = 0;
        if (carta1 == 1 || carta1==2 || carta1==3) {
            qntCartaBoa = 1;
        }
        if (carta2 == 1 || carta2==2 || carta2==3) {
            qntCartaBoa +=1;
        }
        if(carta3 == 1 || carta3==2 || carta3==3){
            qntCartaBoa +=1;
        }
        switch (qntCartaBoa) {
            case 1:
              System.out.println("TRUCO");  
                break;
            case 2:
               System.out.println("SEIS");
               break;
            case 3:
             System.out.println("NOVE");              
            default:
            System.out.println("-");
                break;
        }


        scanner.close();
    }
}
