package test.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extrator {
    public static void main(String[] args) {
        String s1 = "Kläsener Hilde (Kunde - 3306 - 0005511431)";
        //String s1="(0005511431)";
        String s2 = "Becker Olaf (Interessent - 3306 - 3300128060)";
//        String[] cu = s2.split(" ");
//        int l = cu.length;
//        String s3 = cu[l - 1];
//        s3=s3.replace(")","");
//
//        System.out.println("test=" + s3+"x");O
        //Pattern p = Pattern.compile("\\d+\\)+");
        //Pattern p = Pattern.compile("(?<=[(\\[])[^()\\[\\]]*(?=[)\\]])");
        //Pattern p = Pattern.compile("(?<=\\().*?(?=\\))");
        //Pattern p = Pattern.compile("((?<=\\ )\\d{10})*(?=[)\\]])"); //  space 10 numbers and
        Pattern p = Pattern.compile("(?<=\\ )(\\d+)(?=\\))"); // (space) {10 or + whole number} \  (bracket")")
        //Pattern p = Pattern.compile("^([0-9]{4})$");

        Matcher matcher = p.matcher(s1);

        if (matcher.find())
            System.out.println("xx" + matcher.group(0) + "xx");
        else
            System.out.println("nullllllll");
        //System.out.println(matcher.matches());
    }

}
