package com.company;

public class practise_que {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.print("*");
                if (i == 4) {
                    int j = 0;
                    while (j < 2) {
                        System.out.print("#");
                        j++;
                    }
                    System.out.println();

                }
            i++;
        }
    }
}
