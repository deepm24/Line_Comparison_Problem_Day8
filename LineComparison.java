package org.example;
import java.util.Scanner;

public class LineComparison
{
  Scanner sc=new Scanner(System.in);
   double line()
   {
       System.out.println("enter value for x1 ");
       double x1= sc.nextDouble();
       System.out.println("enter value for y1");

       double y1= sc.nextDouble();
       System.out.println("enter value for x2 ");

       double x2= sc.nextDouble();
       System.out.println("enter value for y2");

       double y2= sc.nextDouble();

       double lendgthOFline=Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));
       return lendgthOFline;


   }
   void ForTwoline()
    {
        double lengthOfLineOne=0;
        double lengthOfLineTwo=0;


     for (int i=1;i<=2;i++)
     {
         if(i==1)
         {
             System.out.println("enter value for first line");
             double  length=line();
             System.out.println( length+" length of first line" );
             lengthOfLineOne = length;
         }
         else
         {
             System.out.println("enter value for second line");
              double length=line();
             System.out.println( length+" length of second line" );
             lengthOfLineTwo=length;

         }

     }

     if( lengthOfLineOne==lengthOfLineTwo )
     {
         System.out.println("first line & Second line  are Equal");
     }
     else if ( lengthOfLineOne > lengthOfLineTwo)
     {
         System.out.println("First Line is Bigger Then  Second Line ");
     }
        else
        {
            System.out.println("Second Line is Bigger Then  First Line");
        }
    }
}
