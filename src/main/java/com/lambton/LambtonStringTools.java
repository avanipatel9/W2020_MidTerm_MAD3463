/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.ArrayList;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {

            String str[] = s.split(" ");
            String[] temp = new String[s.length()];
            String reverseString="";
            for (int i = 0; i < str.length; i++)
            {
                temp[i] = str[str.length - 1 - i];
                //System.out.println(temp[i]);
                reverseString = reverseString+" " +temp[i];
            }
            return reverseString;

    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
        String name = s;


        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        String originalstr = originalString;
        originalstr = originalstr.toLowerCase();
        if(originalstr.contains(findString))
        {
            originalstr.replace(findString,newString);
            System.out.println(originalstr);
        }
        return originalstr;
    }
}
