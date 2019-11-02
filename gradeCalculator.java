import java.util.*;
public class gradeCalculator
{
    public static void main(String[] args)
    {
        Scanner g = new Scanner(System.in);
        float grade;
        float desiredGrade;
        float requiredGrade;
        float testWeight;
        
        System.out.println("What is your grade in the class?");
        grade = (g.nextFloat()) / 100;
        
        System.out.println("What is your desired grade?");
        desiredGrade = (g.nextFloat()) / 100;
        
        System.out.println("How much is the test worth?");
        testWeight = (g.nextFloat()) / 100;
        
        requiredGrade = (desiredGrade - (1 - testWeight) * grade) / testWeight;
        requiredGrade = requiredGrade * 100;
        
        System.out.println("Your required grade is " + requiredGrade + "%");
        
    }
}