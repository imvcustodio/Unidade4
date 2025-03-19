import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor1: ");
        int num = scanner.nextInt();
        System.out.print("Valor2: ");
        int num2 = scanner.nextInt();
        System.out.print("Valor3: ");
        int num3 = scanner.nextInt();
        System.out.print("Opção: ");
        int option = scanner.nextInt();
        
        if (option == 1) {
                if (num<=num2 && num<=num3) {
                    if (num2<=num3) {
                        System.out.printf("%d %d %d",num,num2,num3);
                    }else if (num3<num2) {
                        System.out.printf("%d %d %d",num,num3,num2);
                    }
                }else if (num2<num && num2<num3) {
                    if (num<=num3) {
                        System.out.printf("%d %d %d",num2,num,num3);
                    }else{
                        System.out.printf("%d %d %d",num2,num3,num);
                    }
                }else if (num3<num && num3<num2) {
                    if (num<=num2) {
                        System.out.printf("%d %d %d",num3,num,num2);
                    }else{
                        System.out.printf("%d %d %d",num3,num2,num);
                    }
                }
            

            
        }else if (option == 2) {
            
                if (num>=num2 && num>=num3) {
                    if (num2>=num3) {
                        System.out.printf("%d %d %d",num,num2,num3);
                    }else if (num3>num2) {
                        System.out.printf("%d %d %d",num,num3,num2);
                    }
                }else if (num2>num && num2>num3) {
                    if (num>=num3) {
                        System.out.printf("%d %d %d",num2,num,num3);
                    }else{
                        System.out.printf("%d %d %d",num2,num3,num);
                    }
                }else if (num3>num && num3>num2) {
                    if (num>=num2) {
                        System.out.printf("%d %d %d",num3,num,num2);
                    }else{
                        System.out.printf("%d %d %d",num3,num2,num);
                    }
                }

        }else if (option == 3) {
            if (num>=num2 && num>=num3) {
                System.out.printf("%d %d %d",num3,num,num2);
            }else if (num2>=num && num2>=num3) {
                System.out.printf("%d %d %d",num3,num2,num);
            }else if (num3>=num && num3>=num2) {
                System.out.printf("%d %d %d",num2,num3,num);
            }
        }

        scanner.close();
    }
}
