import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X:  "); 
        int pointX = scanner.nextInt();
        System.out.print("Y:  "); 
        int PointY = scanner.nextInt();
         
        if (pointX == 0 && PointY == 0) {
            System.out.printf("Quadrante 0");
        }else if (pointX>0 && PointY>0) {
            System.out.println("Quadrante 1");
        }else if (pointX<0 && PointY>0) {
            System.out.println("Quadrante 2");
        }else if (pointX<0 && PointY<0) {
            System.out.println("Quadrante 3");
        }else{
            System.out.println("Quadrante 4");
        }
            
    
        scanner.close();
    }
}
