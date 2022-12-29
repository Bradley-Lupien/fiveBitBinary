package com.portfolio.fivebitbinary;

public class BinaryHandlerImpl implements BinaryHandler {

    @Override
    public String encodeBinary(char[] contentToEncode) { //Get position of chars in alphabet and return string of binary for file or CLI
        StringBuilder encodedContent = new StringBuilder();
        for(char c : contentToEncode) {
            if(Globals.chars.indexOf(c) > 29) {
                encodedContent.append("11111 "); //indicate capital letter
                encodedContent.append(Globals.binary[Globals.chars.indexOf(c) - 29]);
                encodedContent.append(" ");
            } else {
                encodedContent.append(Globals.binary[Globals.chars.indexOf(c)]);
                encodedContent.append(" ");
            }
        }
        return encodedContent.toString();
    }

    @Override
    public String decodeBinary(String contentToDecode) { //Break string using ' ' as delimiter and convert back to chars then return
        StringBuilder decodedContent = new StringBuilder();
        String[] binaryToDecode = contentToDecode.split(" ");
        for (int i = 0; i < binaryToDecode.length; i++) {
            if (i > 0 && binaryToDecode[i - 1].equals("11111")) { //if a capital letter is flagged, capitalize the next index
                decodedContent.append(Globals.chars.charAt(Globals.getIndexOfBinary(binaryToDecode[i]) + 29));
            } else if(binaryToDecode[i].equals("11111")) {
                continue;
            } else {
                decodedContent.append(Globals.chars.charAt(Globals.getIndexOfBinary(binaryToDecode[i])));
            }
        }
        return decodedContent.toString();
    }
}
