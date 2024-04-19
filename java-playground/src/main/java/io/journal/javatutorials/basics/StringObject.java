package io.journal.javatutorials.basics;

public class StringObject {
    public static void main(String[] args) {
        String str1 = "Java program";
        System.out.println(str1);

        String str2 = new String("JAVA");
        System.out.println(str2);

        char[] c = {'A', 'B', 'C', 'D'};
        String str3 = new String(c, 1, 2);
        System.out.println(str3);

        byte[] b = {65, 66, 67, 68};
        String str4 = new String(b);
        System.out.println(str4);
        System.out.println("----------1----------");

        String strEq1 = "Java";
        String strEq2 = "Java";
        String strEq3 = new String("Java");
        System.out.println(strEq1 == strEq2);
        System.out.println(strEq1.equals(strEq2));

        System.out.println(strEq1 == strEq3);
        System.out.println(strEq1.equals(strEq3));

        System.out.println("----------2----------");

        String str = "welcome";
        System.out.println("str = " + str);
        System.out.println(str.length());

        String str5 = str.toLowerCase();
        System.out.println(str);
        System.out.println("str.toLowerCase()=" + str5);

        char charAt = str.charAt(0);
        System.out.println("str.charAt(0)=" + charAt);

        int indexOf = str.indexOf('e');
        System.out.println("str.indexOf('e')= " + indexOf);

        String str6 = str.substring(1);
        System.out.println("str.substring(1)=" + str6);
        String str7 = str.substring(1, 3);
        System.out.println("str.substring(1,2)=" + str7);

        System.out.println("----------3----------");
        String cmpStr0 = "JAVA";
        String cmpStr1 = "java";
        String cmpStr2 = "python";
        String cmpStr3 = "python";

        System.out.println(cmpStr0.compareTo(cmpStr1));

        System.out.println("----------4----------");

        String regStr1 = "Hello";
        System.out.println(regStr1.matches("\\w*")); // 0 or more times
        System.out.println(regStr1.matches("\\w+")); // 1 or more times
        System.out.println(regStr1.matches("[Hello]+"));// 1 or more times
        System.out.println(regStr1.matches("(Hello)?"));// 0 or 1 time
        System.out.println("HelloHello".matches("(Hello)?"));// 0 or 1 time
        System.out.println(regStr1.matches("\\w\\w\\w\\w\\w"));
        System.out.println(regStr1.matches("\\d{1,}"));

    }
}
