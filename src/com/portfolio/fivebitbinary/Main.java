package com.portfolio.fivebitbinary;

public class Main {
    public static void main(String[] args) {
        String test = "Testing Capitals!!";
        String hello = "Hello World!";
        BinaryHandlerImpl bh = new BinaryHandlerImpl();
        String binary = bh.encodeBinary(test.toCharArray());
        String secondBinary = bh.encodeBinary(hello.toCharArray());
        System.out.println("String " + test + " is encoded as: " + binary);
        System.out.println(secondBinary + " is decoded as: " + bh.decodeBinary(secondBinary));
    }
}
