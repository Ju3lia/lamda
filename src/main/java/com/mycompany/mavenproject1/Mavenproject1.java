/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Locale;

/**
 *
 * @author Admin
 */
public class Mavenproject1 {
    
    public static void PrintParametrs(String ... pr){
        for (String str:pr){
            System.out.println(str);
        }
    }

  static  class PrinterUserFormat{
       
      String text;
        
       public interface FormattingText
        {
            String toUserFormat (String format);  
        }
        FormattingText userFormat = (str)->"default format "+str;
        PrinterUserFormat()
        {
            text = "printer";
        }
        
       void PrintToUserFormat ()
       {
           System.out.println(userFormat.toUserFormat(text));
       }
       void setUserFormat (FormattingText usrFormat)
       {
           userFormat = usrFormat;
       }
    }
            
   class ExpressionHelper{
     
   static boolean isEven(int n){
         
        return n%2 == 0;
    }
   
   static boolean isPossible(int n){
       return n>0;
   }
}
   
    
    interface SomeOperation{
    int calculate(int x, int y);
    
}
    static boolean getSomeVal (int n){
        return n==5;
    }
    static String getNewString (String str)
    {
        return str.toUpperCase();
    }
    
    public interface FormatStr
    {
        String lambdaString (String...param);
    }
            
    interface Expression{
        boolean isEqual (int n);
        
    }
    
    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        FormatStr format = (strings)->
        {
            String userF = "";
            for (String str:strings){
                
            userF = userF + str + "!";
        }
                return userF; 
    };
       System.out.println(format.lambdaString("ff", "dd"));
    
        
      //  PrinterUserFormat prn = new PrinterUserFormat();
      //  prn.PrintToUserFormat();
      //  PrinterUserFormat.FormattingText usr = (str)->"UserFormat " + str + "!!!!";
      //  prn.setUserFormat(usr);
       // prn.PrintToUserFormat();
       // usr = Mavenproject1::getNewString;
       // prn.setUserFormat(usr);
       // prn.PrintToUserFormat();
        
      //  ExpressionHelper.isEven(2);
       // Expression func = (n)-> n%2==0;
       // int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
       
       
     //   int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
                
        //Expression expr = ExpressionHelper::isPositive;
      //   Expression expr = Mavenproject1::getSomeVal;
      //  System.out.println(sum(nums, expr)); // 0  
    } 
       
       
       
       
       
       
      //  int res = sum (nums,func);
        
       // System.out.println("Sum of Elements ="+ res); 
        
      //  func = (n)-> n<3;
     //   res = sum (nums, func);
      //  System.out.println("Sum of Elements ="+ res); 
    
        

} 
        
        //обеспечить изменяемость формата вывода строки на экран в обсервере
        
    

