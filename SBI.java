import java.util.Scanner;
public class SBI{
    public static void main(String[]args){
    Scanner scr= new Scanner(System.in);
    System.out.print("primary_age: ");
    int primary_age= scr.nextInt();
        System.out.print("age: ");
    int age= scr.nextInt();
        System.out.print("emp type: ");
    int type= scr.nextInt();
        System.out.print("income: ");
    int income= scr.nextInt();
    if((primary_age >=21 && primary_age <= 60)
    &&(age> 18)
    &&(type <=1 && type <=4)
    &&(income<=300000)){
        System.out.println("yes");

    }
   
    }
    }