//Check Leap year or not

package com.Programjava;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {

    int year;

    Scanner scn = new Scanner(System.in);
    year = scn.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
        System.out.println(year + " : it is Leap Year");
         }

        else
        {
        System.out.println(year + " : it is Non Leap Year");
        }
}
}
