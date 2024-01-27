package org.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\s[a-zA-Z]{5}\\s");
        Matcher matcher = pattern.matcher("In JavaRush, Diego the best, Diego is Java God");
        String value = matcher.replaceAll(" Amigo ");
        System.out.println(value);

    }
}
