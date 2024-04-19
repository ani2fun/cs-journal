package io.journal.javatutorials.basics;

public class Printing {
    public static void main(String[] args) {
        int a = 10;
        byte b = 0b0011;
        char c = 'A';

        System.out.printf("%d, %d, %c\n", a, b, c);


        System.out.println("------------------------");
        float f = 123.45f;
        System.out.printf("%f\n", f);
        System.out.printf("%e\n", f);
        System.out.printf("%g\n", f);
        System.out.println("------------------------");

        System.out.println("------------------------");
        double d = 0.45;
        System.out.printf("%f\n", d);
        System.out.printf("%6.2e\n", d);
        System.out.printf("%2.5g\n", d);
        System.out.printf("%1.6g\n", d);
        System.out.println("------------------------");

    }
}

/*
% [arggument_index$][flag][width][.precision][.precision]conversion

flags: '-','+','0','','('

conversion -
char    c
int     d,o,x
float   f,e,g
string  s

Format Specifier Conversion Applied
%%	    Inserts a % sign
%x %X	Integer hexadecimal
%t %T	Time and Date
%s %S	String
%n	    Inserts a newline character
%o	    Octal integer
%f	    Decimal floating-point
%e %E	Scientific notation
%g	    Causes Formatter to use either %f or %e, whichever is shorter
%h %H	Hash code of the argument
%d	    Decimal integer
%c	    Character
%b %B	Boolean
%a %A	Floating-point hexadecimal

MORE INFO: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
*/