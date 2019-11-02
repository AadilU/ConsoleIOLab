import java.util.*;
public class test
{
    public static void main(String[] args)
    {
        int x = 0; 
        int i;
        Character useinp;
        do
        {
        assignQ qu = new assignQ();
        assignQ qu1 = new assignQ();
        
        i = 0;
        qu.assignQuestion(assignRand());
        qu.assignChoice();
        
        System.out.println(qu.q);
        
            for(i = 0;i < qu.choice.size(); i++)
            {
                keyInput.printPrompt(qu.choice.get(i) + "\n");
            }
        
        useinp = keyInput.inString().charAt(0);
        
        qu.assignChar(useinp);
        
        qu1.assignHex(randHex());
        qu1.assignChoice();
        
        keyInput.printPrompt(qu1.q + "\n");
        
            for(i = 0;i < qu1.choice.size(); i++)
            {
                keyInput.printPrompt(qu1.choice.get(i) + "\n");
            }
            
        useinp = keyInput.inString().charAt(0);
        
        qu1.assignChar(useinp);
        
        x++;
        }
        while(x < 5);
    }
    
    public static String assignRand()
    {  
        Random r = new Random(); 
        String y = ""; 
        String z = "";  
        int x;
        int random = (r.nextInt(4)) + 1; 
        while (random > 0) 
        { 
            x = r.nextInt(2); 
            z = Integer.toString(x); 
            y = y.concat(z); 
            random--;
        }
        
        return y;
    }
    
    public static String randHex()
    {
        Random rand = new Random();
        int rand1;
        
        rand1 = rand.nextInt(0x10) + 0x10;
        
        return Integer.toHexString(rand1);
    }  
}
