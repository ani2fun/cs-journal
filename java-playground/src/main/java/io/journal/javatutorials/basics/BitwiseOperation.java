package io.journal.javatutorials.basics;

// IMP: BITWISE operation is always performed on integer datatype only
public class BitwiseOperation {
    public static void main(String[] args) {

        int x = 0b1010; // 1 0 1 0
        int z = 0;

        // Left shift by 1 place. (it is multiplied by 2)
        // If you are moving by K places then The result will be [ result = nx2^k ]
        z = x << 1;

        int left_shift_by_two_places = x << 2;

        System.out.println("x: " + x);

        System.out.println("z: " + z);
        System.out.println("when x = 0b1010 then x<<2: " + left_shift_by_two_places); // res: 40


        // Left shift by 1 place. (it is divided by 2)
        // If you are moving by K places then The result will be [ result = n/2^k ]
        int right_shift_by_1_place = x >> 1;
        int right_shift_by_2_place = x >> 2;

        System.out.println("when x = 0b1010 then x>>1: " + right_shift_by_1_place); // res: 5
        System.out.println("when x = 0b1010 then x>>2: " + right_shift_by_2_place); // res: 2, take Floor value


        int a = -0b1010;
        int left_shift_negative_10 = a << 1;
        int right_shift_negative_10 = a >> 1;
        int unsign_right_shift_negative_10 = a >>> 1;
        int unsign_right_shift_positive_10 = 10 >>> 1;
        System.out.println("when a = -10 then a<<1: " + left_shift_negative_10); // res: -20
        System.out.println("when a = -10 then a>>1: " + right_shift_negative_10); // res: -5

        System.out.println("when a = -10 then a>>>1: " + unsign_right_shift_negative_10); // res: 2147483643
        System.out.println("when 10>>>1 then: " + unsign_right_shift_positive_10); // res: 2147483643


        System.out.println(String.format("Binary of 10       : %32s", Integer.toBinaryString(a)));
        System.out.println(String.format("Binary of 10 >>> 1 : %32s", Integer.toBinaryString(unsign_right_shift_negative_10)));

    }
}
