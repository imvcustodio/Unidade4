import java.util.Scanner;

public class Uni4exe13 {
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
