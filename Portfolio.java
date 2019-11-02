import java.util.*;
import javafx.application.Application;
public class Portfolio
{
    public static void main(String[] args)
    {
        String response;
        Character res;
        do
        {
            keyInput.printPrompt("Which project would you like to pull up?(A-D for choices, 0 to exit)\nA. Test progress\nB. Dice Roll\nC. Snakes and ladders\nD. Graphing program");
            
            res = keyInput.inString().charAt(0);
            res = res.toLowerCase(res);
            switch(res)
            {
                case 'a': callLab();
                break;
                
                case 'b': callLab1();
                break;
                
                case 'c': callLab2();
                break;
                
                case 'd':
                {
                    System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
                }
                break;
            }  
            keyInput.printPrompt("Public static methods are used because the methods are accesed by all classes in the project and no objects need to be created to call the class");
            
        }
        while(res != '0');
    }
    
    public static void callLab()
    {
        String[] args = new String[] {""};
        test.main(args);
    }
    
    public static void callLab1()
    {
        String[] args = new String[] {""};
        dice.main(args);
    }
    
    public static void callLab2()
    {
        String[] args = new String[]{""};
        snakeGame.main(args);
    }
}
