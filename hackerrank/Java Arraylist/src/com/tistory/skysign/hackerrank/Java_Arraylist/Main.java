package com.tistory.skysign.hackerrank.Java_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        ArrayList<Integer>[] al = new ArrayList[M];

        for(int i=0; i<M; ++i) {
            al[i] = new ArrayList<Integer>();
            for(int J=sc.nextInt(), j=0; j<J; ++j) {
                al[i].add(sc.nextInt());
            }
        }

        M = sc.nextInt();
        for(int i=0; i<M; ++i) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if((0<X) && (X<=al.length) && (0<Y) && (Y<=al[X-1].size())) {
                System.out.println(al[X-1].get(Y-1));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }
}
