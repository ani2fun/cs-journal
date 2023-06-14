package io.journal.javatutorials.basics;

public class BitwiseMaskingMerging {
    public static void main(String[] args) {
//        Binary to decimal helper (2^n)
//                       .....64 32 16 8 4 2 1

        // By ORING and SHIFTING you can store
        // By ANDING and SHIFTING you can read the number

        System.out.println("----------- Storing 9 on left side and 12 on right side -----------------");
        byte a = 9;    // ..... 0  0  0 1 0 0 1
        byte b = 12;   // ..... 0  0  0 1 1 0 0
        byte c;

        // PUT 9 and 12 inside same byte variable c
        // By ORING and SHIFTING you can store
        c = (byte) (a << 4); // << has less precedence hence enclose in brackets
        c = (byte) (c | b); // << has less precedence hence enclose in brackets

        // By ANDING and SHIFTING you can read the number
        byte get_value_9_left_side = (byte) ((c & 0b11110000) >> 4);
        byte get_value_12_right_side = (byte) (c & 0b00001111);
        System.out.println(get_value_9_left_side);
        System.out.println(get_value_12_right_side);

        System.out.println("--------------------------------------------------------");

        System.out.println("----------- Storing 9 on right side and 12 on left side -----------------");
        byte x = 9;       // ..... 0  0  0 1 0 0 1
        byte y = 12;      // ..... 0  0  0 1 1 0 0
        byte z;
        z = (byte) (y << 4);
        z = (byte) (z | x);
        byte get_value_9_right_side = (byte) ((z & 0b00001111));
        byte get_value_12_left_side = (byte) ((z & 0b11110000) >> 4);
        System.out.println(get_value_9_right_side);
        System.out.println(get_value_12_left_side);

    }
}
