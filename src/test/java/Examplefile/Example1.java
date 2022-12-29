package Examplefile;

import java.util.Arrays;

public class Example1 {

        public static void main(String[] args) {


            String s1 = "listen";
            String s2 = "Silent";

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            if (s1.length() == s2.length()) {
                char[] ch1 = s1.toCharArray();
                char[] ch2 = s2.toCharArray();

                Arrays.sort(ch1);
                Arrays.sort(ch2);

                boolean result = Arrays.equals(ch1, ch2);

                if (result) {
                    System.out.println(s1 +" " +"And" +" "   + s2 + " are anagram ");
                } else {
                    System.out.println(s1 + " "  +"And"+ " "  + s2 + " are not anagram ");
                }
            } else {
                System.out.println(s1 +" " +"And"+" " + s2 + " are not anagram ");
            }
        }
    }


