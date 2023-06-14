package io.journal.javatutorials.basics;

import java.lang.*;

public class Literal {
    public static void main(String[] args) {

        // Integer Literal can be represented in 4 different types of number system.
        // Either it can be decimal, binary, octal, hexadecimal

        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0xA;

        System.out.println("decimal: byte b1 = 10; output= " + b1);
        System.out.println("binary: byte b2 = 0b1010; output= " + b2);
        System.out.println("octal: byte b3 = 012; output= " + b3);
        System.out.println("hexadecimal: byte b4 = 0xA; output= " + b4);

        // long l = 99999999999; // error: integer number too large
        long l = 999_999_999_99L;
        System.out.println(l);

        // float f = 12.56; // error: incompatible types: possible lossy conversion from double to float
        float f = 12.56F;
        System.out.println(f);
        double d = 12.56;
        System.out.println(d);

        /* BYTE
         *   0   0   0   0   0   0   0   0   = 0
         *   0   1   1   1   1   1   1   1   = 127
         *  +ve 2ˆ6 2ˆ5 2ˆ4 2ˆ3 2ˆ2 2ˆ1 2ˆ0
         *  -ve
         * */

        System.out.println("Max value in byte: 127 because it's 1 byte. ");
        byte max_in_byte = 0b1111111;
        System.out.println("byte max_in_byte = 0b1111111; output: " + max_in_byte);


        /*
            00000101     = integer 5 in Binary form
            11111010     = 1's complement of 5
            +      1     = for 2's complement of 5 , add 1
            --------
            11111011
        */
        byte value_5_in_byte = 0b00000101;
        System.out.println("byte value_5_in_byte = 0b00000101; output: " + value_5_in_byte);

        byte value_5_in_1s_complement = (byte) 0b11111010;
        System.out.println("byte value_5_in_1s_complement = (byte) 0b11111011; output: " + value_5_in_1s_complement);

        byte value_5_in_2s_complement = (byte) 0b11111011;
        System.out.println("byte value_5_in_2s_complement = (byte) 0b11111011; output: " + value_5_in_2s_complement);


        int number_5_positive = 5;
        int number_5_negative = -5;
        System.out.println("Integer.toBinaryString(number_5_positive): " + Integer.toBinaryString(number_5_positive));
        System.out.println("Integer.toBinaryString(number_5_negative): " + Integer.toBinaryString(number_5_negative));

        // OUPUT:
        /*
            Integer.toBinaryString(number_5_positive): 101
            Integer.toBinaryString(number_5_negative): 11111111111111111111111111111011

            Explanation:
            Because int is of 4 bytes which is equivalent of to 32 bit.
            Hence, 5's 2s complement in above example, is stored in 32 bit.
            Therefore, we get so many 1s. But observe last 3 digit which is 011 shows 2's complement form of -ve 5,
        */
    }
}
