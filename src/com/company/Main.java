package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	System.out.println("Enter string");
        Scanner kbReader = new Scanner(System.in);
        String input = kbReader.nextLine();
        int length = input.length();
        double RandomPercent = (int)(Math.random()*input.length());

        String input;
        if (RandomPercent == 1){
        String input = Integer.toBinaryString();
        }
        else if(RandomPercent ==2){
            String input= Integer.toOctalString();
        }
        else if(RandomPercent ==3){
            String input = Integer.toHexString();
        }
        else if(RandomPercent ==4){
            String input = Integer.toString();
        }
        System.out.println(input);








    }
}
