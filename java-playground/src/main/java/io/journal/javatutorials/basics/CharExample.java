package io.journal.javatutorials.basics;

public class CharExample {
    public static void main(String[] args) {
        char character = 'Z';
        String magicWord = "XYZZY";

        char anotherChar = magicWord.charAt(0);

        System.out.println(character);
        System.out.println(anotherChar);

        /**
         * The + operator concatenates strings, but characters are internally represented using numbers, with a code called Unicode.
         * Since the unicode value of ‘X’ is 88, and the unicode value of ‘Z’ is 90, the + operator adds the two up and returns an int.
         * */
        System.out.println(character + anotherChar);


        /**
         * You can concatenate a character to a string easily with +,
         * since the + operator converts both operands to strings if one of the operands is a string.
         * */
        System.out.println("Z" + 'X');

    }
}