package ex34;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in  = new Scanner(System.in);
        String[] strArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        int size = strArray.length;
        System.out.println( "There are "+ size +" employees:" );

        for(int i = 0; i < size; i++)
        {
            System.out.println(strArray[i]);
        }

        System.out.println("Enter an employee name to remove:" );
        String ans = in.nextLine();

        String[] newStrArray = new String[size - 1];
        for(int i = 0; i < size-1; i++)
        {
            if(strArray[i].contains(ans))
            {
                continue;
            }

            newStrArray[i] = strArray[i];

        }
        size--;
        System.out.println( "There are "+ size +" employees:" );
        for(int i = 0; i < size; i++)
        {
            System.out.println(newStrArray[i]);
        }
    }
}
