package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	System.out.println("Enter string");
        Scanner kbReader = new Scanner(System.in);
        String input = kbReader.nextLine();
        int length = input.length();
        double RandomPercent = (int)(Math.random()*input.length());

        String encryption;
        if (RandomPercent == 1){
        String encryption = Integer.toBinaryString();
        }
        else if(RandomPercent ==2){
            String encryption= Integer.toOctalString();
        }
        else if(RandomPercent ==3){
            String encryption = Integer.toDeciamlString();
        }
        else if(RandomPercent ==4){
            String encryption = Integer.toHexString();
        }
        else if(RandomPercent ==5){
            String encryption = Integer.toAsciiString();
        }
        System.out.println(encryption);








    }
}
