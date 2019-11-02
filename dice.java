import java.util.*;
public class dice
{
    public static void main(String[] args)
    {
        int rnum;
        int dicenum;
        int i;
        
        //Player roll
        int playerscore = 0;
        
        //Cpu roll
        int cpuscore = 0;
        Scanner inp = new Scanner(System.in);
        Random r = new Random();
        
        //creates dice for cpu and player
        dice1 dice;
        dice1 dice2;
        
        int res;
        do
        {
        //Recieves input for amount of dice
        dicenum = keyInput.inInt("How many dice would you like to roll?\n");
        
        //Generates random number for dice
        for(i = 0;i < dicenum; i++)
        {
            dice = new dice1();
            keyInput.printPrompt("You rolled a " + dice.dice1Value + " on dice " + (i + 1) + "\n");
            playerscore += dice.dice1Value;
        }
        
        keyInput.printPrompt("CPU Roll:\n");
        
        //Generates random number for cpu
        for(i = 0;i < dicenum; i++)
        {
            dice2 = new dice1();
            keyInput.printPrompt(dice2.dice1Value + " on dice " + (i + 1) + "\n");
            cpuscore += dice2.dice1Value;
        }
        
        //Compares rolls
        if(cpuscore > playerscore)
        {
            keyInput.printPrompt("The cpu won\n");
        }
        else
            if(playerscore > cpuscore)
            {
                keyInput.printPrompt("You won\n");
            }
            else
                keyInput.printPrompt("You tied with the cpu\n");
        res = keyInput.inInt("Would you like to play again?(1 or 0)\n");
    }
            while(res == 1);
    }
}
