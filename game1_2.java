import java.util.Random;
import java.util.Scanner;


public class game1_2 {
    public static void main(String []args)
    {
        try (Scanner sc =new Scanner(System.in))
        {
            Random r = new Random();
            char letter = (char)(r.nextInt('z' - 'a') + 'a');
            char kkk=(char)(r.nextInt('z' - 'a') + 'a');
            int c=0;
            int b=26;
            
            do 
            {
                System.out.println("pls enter a char ' '");
                letter = (char)(r.nextInt('z' - 'a') + 'a');
             letter =sc.next().charAt(0);
             ++c;
            } while (letter!=kkk);
            if(c>b)
            {
                System.out.println("Eroor");
            }
            if(c<b)
            {
                System.out.println("youe deadly char was  \n" +letter);

                System.out.println("count\n"+c);
            }


        }
    }
}
