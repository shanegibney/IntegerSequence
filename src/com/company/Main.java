package com.company;

import java.io.*;

import static java.lang.System.*;

import java.io.FileWriter;
import java.util.*;

public class Main {
    /*
     n ->  0 1 2 3 4 5 6 7 8 9
     a(n) ->  1 1 4 8 2
     if no common factor between n and a(n-1)
     if gcd(n,a(n-1)) = 1
     a(n) = a(n-1) + n + 1
     OR
     if gcd > 1
     a(n) = a(n-1)/gcd(n, a(n-1))
    */


    public static void main(String[] args) {

        Stack<Integer> row1 = new Stack<Integer>();
        row1.push(0);
        row1.push(1);
        Stack<Integer> row2 = new Stack<Integer>();
        row2.push(1);
        row2.push(1);

        String item = "";
        try {
            FileWriter fw = new FileWriter("data.dat");
            fw.write("#\tX\tY\n");
            fw.write("\t0\t1\n");
            fw.write("\t1\t1\n");

            for (int x = 2; x < 10000; x++) {
                row1.push(x);
                if (gcd(row1.get(x), row2.get(x - 1)) == 1) {
                    row2.push(row2.get(x - 1) + row1.get(x) + 1);
                } else {
                    row2.push(row2.get(x - 1) / gcd(row1.get(x), row2.get(x - 1)));
                }

                fw.write("\t" + row1.get(x) + "\t" + row2.get(x) + "\n");
            }

            fw.close();

//            out.println("row1 = " + row1);
//            out.println("row2 = " + row2);
        } catch (Exception e) {
            out.println(e);
        }
        out.println("Success...");
    }

    // gcd -> finds greatest common multiple of two numbers
    public static int gcd(int num1, int num2) {
        int value = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                value = i;
        }
        return value;
    }
}
