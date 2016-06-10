package com.gutech.hackerank;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * Created by niven on 09/06/2016.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the staircase");
        int height = in.nextInt();
        IntStream.rangeClosed(1, height).forEach( i -> {
            IntStream.rangeClosed(1, height - i).forEach(j -> System.out.print(" "));
            IntStream.rangeClosed(height-i + 1, height).forEach(j -> System.out.print("#"));
            System.out.println("");
        });
    }
}
