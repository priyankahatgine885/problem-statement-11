package com.main;

public class Application {
        public static void main(String[] args) {
            int row = 4;
            patternPrint(row);
        }
        public static void patternPrint(int number) {
            for(int i = number; i > 0; --i) {
                for(int j = i; j > 0; --j) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
        }
}
