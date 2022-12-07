import java.util.Scanner;

public class Switch 
{
    public static void main(String args [])
    {
        try (Scanner cc =new Scanner(System.in))
        {
           System.out.println("pls enter a operator");
            String str = cc.next();
            System.out.println("pls enter a number ");
            int num = cc.nextInt();
            System.out.println("pls enter a number ");
            int num1 = cc.nextInt();
            switch (str)
            {
                case "+":
                    System.out.printf("A = %d\n",num+num1);
                    break;
                case "-":
                    System.out.printf("A = %d\n",num-num1);
                    break;
                case "*":
                    System.out.printf("A = %d\n",num*num1);
                    break;  
                case "/":
                    System.out.printf("A = %d\n",num/num1);
                    break;  
                default:
                System.out.println("Error");    
            }
        }
    }
}
