import java.util.Scanner;

public class calculator
{
    public static void main(String args[])
    {
    try   ( Scanner sc = new Scanner(System.in)){
            System.out.println("pls enter a number");
            int num = sc.nextInt();

            System.out.println("pls enter a number");
            int num2 = sc.nextInt();
        System.out.println("pls enter the  operator number ,1 for (+),2 for (-),3 for (*),4 for(/)");
            int op = sc.nextInt();
            
        
        if (op == 1) 
        {
            System.out.printf("A=%d\n",num + num2);
        }
        if (op == 2) 
        {
            System.out.printf("A=%d\n",num - num2);
        }
        if (op == 3) 
        {
            System.out.printf("A=%d\n",num * num2);
        }
        if (op == 4) 
        {
            System.out.printf("A=%d\n",num / num2); 
        }
            
    }
    }

}