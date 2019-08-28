package com.myvedic.mavenproject12;

public class mapp1 {
    public static void main(String[] args) {
      System.out.println("Hello!Vedic\nThis is Maven project");
      int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
       long p;
       int n;
       double q;
       System.out.println("2 to power -n    n        2 to power n");
       p=1;
       for(n=0; n<=10; ++n)
       {
           if (n==0)
               p=1;
           else
               p=p*2;
           q=1.0 / (double)p;
           System.out.println(q+"           "     +n+"          "+p);
       }
    }
}
