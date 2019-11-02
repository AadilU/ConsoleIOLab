import java.util.*;
public class assignQ
{
    String q;
    String hexQ;
    int correct;
    List<String> choice = new ArrayList<String>(); 
    public void assignQuestion(String binary)
    {
        this.q = "What is binary " + binary + " in base 10?";
        correct = Integer.parseInt(binary, 2);
        this.correct = correct;
    }
    
    public void assignHex(String hex)
    {
        this.q = "What is hex " + hex + " in base 10?";
        correct = Integer.parseInt(hex, 16);
        this.correct = correct;
    }
    
    public void assignChoice()
    {
        Random rand = new Random();
        int randnum;
        randnum = rand.nextInt(4);
        randnum = randnum + 1;
        switch(randnum)
        {
            case 1:
            {
                choice.add("A. " + this.correct);
                choice.add("B. " + (this.correct + 10));
                choice.add("C. " + (this.correct - 1));
                choice.add("D. " + (this.correct + 5));
                break;
            }
            case 2:
            {
                choice.add("A. " + (this.correct + 10));
                choice.add("B. " + this.correct);
                choice.add("C. " + (this.correct - 1));
                choice.add("D. " + (this.correct + 5));
                break;
            }
            case 3:
            {
                choice.add("A. " + (this.correct - 1));
                choice.add("B. " + (this.correct + 10));
                choice.add("C. " + this.correct);
                choice.add("D. " + (this.correct + 5));
                break;
            }
            case 4:
            {
                choice.add("A. " + (this.correct + 5));
                choice.add("B. " + (this.correct + 10));
                choice.add("C. " + (this.correct - 1));
                choice.add("D. " + this.correct);
                break;
            }
        }
        this.choice = choice;
    }
    
    public void assignChar(Character inp)
    {
        if((inp == 'a' && this.choice.get(0).contains(Integer.toString(correct)) == true))
        {
            keyInput.printPrompt("Correct\n");
        }
        else
            if((inp == 'b' && this.choice.get(1).contains(Integer.toString(correct)) == true))
            {
                keyInput.printPrompt("Correct\n");
            }
            else
                if((inp == 'c' && this.choice.get(2).contains(Integer.toString(correct)) == true))
                {
                    keyInput.printPrompt("Correct\n");
                }
                else
                    if((inp == 'd' && this.choice.get(3).contains(Integer.toString(correct)) == true))
                    {
                        keyInput.printPrompt("Correct\n");
                    }
                    else
                    {
                        keyInput.printPrompt("Incorrect\n");
                    }
    }
}