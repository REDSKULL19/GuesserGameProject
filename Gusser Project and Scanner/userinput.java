import java.util.Scanner;

public  class userinput {
    public static void main(String[] args) {
        int num1;
        String num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the no ");
        num1 = sc.nextInt();

        System.out.print("Give the String ");
        num2 = sc.next();

        System.out.println("The num given by the user is  " + num1 + " And the given String is " + num2);
        
    
    }
    
}