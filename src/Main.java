import java.util.*;
public class Main {
    public static void cheakmark(int mark) throws InvalidMarkException{
        if (mark<0||mark>100)
            throw new InvalidMarkException();
        else
            System.out.println("valid mark");
    }

    public static void main(String args[])
    {
        try {
            cheakmark(150);
        } catch (InvalidMarkException e)
        {
            System.out.println(e.getMessage());
        }



    }

}