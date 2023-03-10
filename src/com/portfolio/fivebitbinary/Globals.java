package com.portfolio.fivebitbinary;


public class Globals {
    public static String chars = " abcdefghijklmnopqrstuvwxyz.!?ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String[] binary = new String[] {
      "00000", "00001", "00010", "00011", "00100", "00101", "00110",
            "00111", "01000", "01001", "01010", "01011", "01100", "01101",
            "01110", "01111", "10000", "10001", "10010", "10011", "10100",
            "10101", "10110", "10111", "11000", "11001", "11010", "11011",
            "11100", "11101", "11110", "11111"
    };

    public static int getIndexOfBinary(String binary) {
        for(int i = 0; i < Globals.binary.length; i++) {
            if (Globals.binary[i].equals(binary))
                return i;
        }
        return -1;
    }


}
