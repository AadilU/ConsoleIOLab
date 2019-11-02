import java.util.*;
public class sort
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements do you want?");
        
        int x = 0;
        int i = 0;
        
        x = s.nextInt();
        
        int[] num = new int[6];
        for(i = 0; i < x;i++)
        {
            System.out.println("Enter element " + i);
            num[i] = s.nextInt();
        }
        
        for(i = 0; i < x;i++)
        {
            System.out.println(num[i]);
        }
        
        
    }
}
