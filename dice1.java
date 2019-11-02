import java.util.*;
public class dice1
{
    int dice1Value;
    Random r = new Random();
    
    public dice1()
    {
        this.dice1Value = r.nextInt(6) + 1;
    }
}