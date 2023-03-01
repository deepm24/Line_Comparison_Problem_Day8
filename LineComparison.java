package org.example;

import java.util.Scanner;

public class LineComparison
{
  Scanner sc=new Scanner(System.in);
   public void line()
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
       System.out.println("length of line :"+lendgthOFline);


   }
}
