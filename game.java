import java.util.Scanner;

import java.util.Random;

public class game 
{
    public static void main  (String aString[])
    {
        try(Scanner sc =new Scanner(System.in))
        {
            Random r = new Random();
            char letter = 'a';
            int c = 0;
            boolean flag=true;
             while(flag)
                 {
                    System.out.println("pls enter a char''");                 
                    letter = sc.next().charAt(0);
                        ++c;
                    if(letter==(char)(r.nextInt('z' - 'a') + 'a'))
                        {
                            flag = false;
                         }
                 }
                        System.out.println("count  "+c);
                        System.out.println("your deadly char was \n "+letter);
        }
        
         
    }
}
