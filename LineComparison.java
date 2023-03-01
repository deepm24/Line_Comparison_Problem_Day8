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
   public void ForTwoline()
    {
     for (int i=1;i<=2;i++)
     {
         if(i==1)
         {
             System.out.println("enter value for first line");
             System.out.println(line()+"<length of first line" );

         }
         else
         {
             System.out.println("enter value for second line");
             System.out.println(line()+"<length of second line" );

         }
     }

    }
}
