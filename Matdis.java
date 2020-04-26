package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matdis {
    static final int EXTEUCLID_RET_ARRAY_SIZE = 3;
    static final int INDEX_GCD = 0;

    static int gdc (int a, int b) {
        int A = a;
        int q = 0;
        int B = b;
        int r = 0;

        while (B != 0) {
            q = A / B;
            r = A - q * B;
            A = B;
            B = r;


        }
        return A;
    }

    public static void main (String[] args){
        int Nilai_a = 100;
        int Nilai_B = 70;
        System.out.println("gdc("+ Nilai_a + ","+ Nilai_B + ") " + Matdis.gdc(Nilai_a, Nilai_B));
        }
    }


