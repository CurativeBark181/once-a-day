
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
        boolean leftJustify = false;
        boolean plusMinusSign = false;
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
        while (Integer.parseInt(unFormated.substring(unFormated.indexOf("%")+1,unFormated.indexOf("%")+2)) instanceof int)
            endOfFormat += 1;
            
            
    }
}
