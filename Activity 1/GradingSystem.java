import java.util.Scanner;

public class GradingSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Below 25 – F
        25 to 45 – E
        45 to 50 – D
        50 to 60 – C
        60 to 80 – B
        Above 80 – A */

        System.out.print("Please enter your mark: ");
        int num = scanner.nextInt();

     if(num<25){
        System.out.print("The grade is F");
     }
     else if(num <= 45){
        System.out.print("The grade is E");
     }
     else if(num <= 50){
        System.out.print("The grade is D");
     }
     else if(num <= 60){
        System.out.print("The grade is C");
     }
     else if(num <= 80){
        System.out.print("The grade is B");
     }
     else{
        System.out.print("The grade is A");
     }
     
        scanner.close();
    }
}