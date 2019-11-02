import java.util.*;

public class snakeGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int board[] = new int[101];
        int roll1;
        for(int i = 0;i < 101;i++)
        {
            board[i] = (i + 1);
        }
        
        int inp = 1;
        
        do
        {
        player p1 = new player();
        player p2 = new player();
        
        keyInput.printPrompt("Welcome to snakes and ladders! First person to reach position 25 on the board wins\n");
        keyInput.printPrompt("Type 1 to roll on your turn. Type 0 to exit\n");
        
        while(p1.position < 25 && p2.position < 25 && inp != 0)
        {
            inp = keyInput.inInt("Your turn. 1 to roll, 0 to exit\n");
            
            switch(inp)
            {
                case 1:
                {
                //Player roll
                roll1 = getRoll();
                p1.position = advanceP(roll1, p1.position);
                keyInput.printPrompt("Your player moved to position " + p1.position + " on the board\n");
                if(p1.position == 10 || p1.position == 14)
                {
                    p1.position -= 4;
                    
                    keyInput.printPrompt("You landed on a snake. Your position has been moved to " + p1.position + "\n");
                }
                else
                    if(p1.position == 7 || p1.position == 18)
                    {
                        p1.position += 4;
                        keyInput.printPrompt("You landed on a ladder. Player position has been moved to " + p1.position + "\n");
                    }
                
                //Opponent roll
                roll1 = getRoll();
                p2.position = advanceP(roll1, p2.position);
                keyInput.printPrompt("Your opponet moved to position " + p2.position + " on the board" + "\n");
                if(p2.position == 10 || p2.position == 14)
                {
                    p2.position -= 4;
                    
                    keyInput.printPrompt("Your opponent landed on a snake. Their position has been moved to " + p2.position + "\n");
                }
                else
                    if(p2.position == 7 || p2.position == 18)
                    {
                        p2.position += 4;
                        keyInput.printPrompt("Your opponent landed on a ladder. Player position has been moved to " + p2.position + "\n");
                    }
                break;
                }
                
                case 0:
                {
                    inp = 0;
                    break;
                }
                
                default: 
                keyInput.printPrompt("Enter a valid choice\n");
            }
        }
        
        if(p1.position >= 25)
        {
            keyInput.printPrompt("You won!\n");
        }
        else
            keyInput.printPrompt("Your opponent won\n");
        inp = keyInput.inInt("Would you like to play again?(1 to play again, 0 to exit)\n");
        
        }
        while(inp == 1);
    }
    
    public static int getRoll()
    {
        Random rand = new Random();
        int r;
        
        r = rand.nextInt(6);
        r = r + 1;
        
        return r;
    }
    
    public static int advanceP(int roll, int player)
    {
        player += roll;
        
        return player;
    }
}
