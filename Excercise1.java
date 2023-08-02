import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num, square;
        System.out.print("Escribe un num: ");   
        num = entry.nextInt();
        
        while(num >= 0){
         square = (int)Math.pow(num,2) ;
         System.out.println("es numero es: " +num+ "y el cuadrado de el numero es: "+square);
         System.out.println("digite otro numero");
         num = entry.nextInt();

        }
}}