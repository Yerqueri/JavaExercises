package com.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PE56 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = in.nextLine();
        in.close();
        Pattern p = Pattern.compile("se");
        Matcher m = p.matcher(str);
        while(m.find()) {
            System.out.println("Found at"+" "+m.start()+"-"+(m.end()));
        }
    }
}
