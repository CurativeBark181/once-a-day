
/**
 * Write a description of class Oct10PrintFRecreation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PrintFRecreation
{
    public static void main(String[] args)
    {
        //initilize varuables
        String unFormated;
        String Begining;
        String Formating;
        String End;
        char flag;
        boolean leftJustify = false;
        boolean plusMinusSign = false;
        boolean parenthesisNegatives = false;
        boolean zeroPading = false;
        boolean commaSeparation = false;
        boolean spaceMinusSign = false;
        int width = 0;
        int precision = 0;
        String conversionCharacter;
        int endOfFormat = 0;
        //initilize objects 
        Scanner key = new Scanner(System.in);
        
        //take input from user
        System.out.println("Enter printf formated text\n-->");
        unFormated = key.nextLine();
        
        //begin cutting up String "unFormated"
        Begining = unFormated.substring(0, unFormated.indexOf("%"));
        endOfFormat = unFormated.indexOf("%");
        flag = unFormated.charAt(endOfFormat+1);
        if(flag == '-')
            leftJustify = true;
        else if (flag == '+')
            plusMinusSign = true;
        else if (flag == '(')
            parenthesisNegatives = true;
        else if (flag == '0')
            zeroPading = true;
        else if (flag == ',')
            commaSeparation = true;
        else if (flag == ' ')
            spaceMinusSign = true;
        
        for (int n = 2, widthIndex = endOfFormat+n; 
        unFormated.charAt(widthIndex) == '0' || 
        unFormated.charAt(widthIndex) == '1' || 
        unFormated.charAt(widthIndex) == '2' || 
        unFormated.charAt(widthIndex) == '3' || 
        unFormated.charAt(widthIndex) == '4' || 
        unFormated.charAt(widthIndex) == '5' || 
        unFormated.charAt(widthIndex) == '6' || 
        unFormated.charAt(widthIndex) == '7' || 
        unFormated.charAt(widthIndex) == '8' || 
        unFormated.charAt(widthIndex) == '9'
        ;n+=1, widthIndex = endOfFormat+n)
        {
            System.out.println(endOfFormat+n);
            System.out.println(widthIndex);
            System.out.println(unFormated.charAt(widthIndex));
            width = (width*10)+Character.getNumericValue(unFormated.charAt(widthIndex));
            key.nextLine();
        }
    }
}
