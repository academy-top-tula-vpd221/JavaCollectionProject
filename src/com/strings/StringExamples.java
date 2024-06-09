package com.strings;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExamples {
    public static void Examples(){
        String str1 = "Hello world";
        String str2 = new String("Hello world 2!");
        String str3 = new String(new char[]{ 'H', 'e', 'l', 'l', '0'});
        String str4 = new String(new byte[]{ 'H', 'e', 'l', 'l', '0'});

//        char[] symbols = str1.toCharArray();
//
//        System.out.println(str1.charAt(2));
//        System.out.println(str1.codePointAt(2));

//        String emails = "hello user@ them user@cite.com when @total where bob@bob.ru";
//        String regex = "\\w+@\\w+\\.\\w+";
//
//        String text = "Java Collection — это фреймворк, который обеспечивает унифицированную архитектуру для хранения и управления группой объектов. По своей сути, это набор классов и интерфейсов, которые обеспечивают стандартный способ представления коллекций объектов и управления ими на языке Java. Также фреймворк помогает в реализации часто используемых структур данных, таких как List, Set и Map.\n";
//
//        String[] arrEmails = text.split("\\."); //emails.split(regex);
//        for(String s : arrEmails)
//            System.out.println(s);

//        StringBuffer buff = new StringBuffer(20);
//        StringBuilder bild = new StringBuilder("str1");
//        buff.ensureCapacity(50);
//        buff.setCharAt(10, 'a');
//        buff.append(str1);
//        buff.insert(5, "hhh");
//        buff.delete(3, 7);
//        buff.deleteCharAt(5);

        String email = "bob@gmail.com, user@, nick@ol@gmailcom, person@cite.en";
        String regex = "\\w+@\\w+\\.\\w+";
        boolean result = email.matches(regex);

        System.out.println(result);

        Pattern.matches(email, regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

//        while(matcher.find())
//            System.out.println(matcher.group());

        String text = "Note that this Comparator does not take locale into account, and will result in an unsatisfactory ordering for certain locales. The java.text package provides Collators to allow locale-sensitive ordering.";
        Pattern patternWord = Pattern.compile("[ ,\\.!?]");
        String[] words = patternWord.split(text);

        for(String w : words)
            System.out.println(w);
    }
}
