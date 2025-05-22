package org.example.learning.utils.numbers.docs;

/**
 * Created by User on 23.05.2025
 */
public class NumberDocs {

    public static void main(String[] args) {
        NumberDocs voidDocs = new NumberDocs();
        voidDocs.reverseIntegerNumberVoid();
    }


    private void reverseIntegerNumberVoid() {
        //declaring number
        int number = 12345;
        //printing number
        System.out.println(number);

        String string = String.valueOf(number); //applying n number to string object
        char[] charArray = string.toCharArray(); //converting string to char array
        //noinspection ForLoopReplaceableByForEach
        for(int i =0;i<charArray.length;i++){
            System.out.print(charArray[i]+" ");  //printing characters from char array
        }
        System.out.println();
        for(int i =charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]+" ");  //printing characters from char array
        }
        System.out.println();
        char[] reversed  = new char[charArray.length]; //creating new char array
        for(int i =0;i<charArray.length;i++){
            reversed[i]=charArray[charArray.length-i-1]; // applying numbers to new char array named reversed
            System.out.print(reversed[i]+" ");
        }
        System.out.println();
        int reversedNumber = 0;
        for(int i =0;i<reversed.length;i++){
            //reversing number
            reversedNumber = (int) (reversedNumber+ (reversed.length-i)*Math.pow(10,reversed.length-i-1));
            // System.out.print(reversed[i]+" "); //we're testing if reversed array works
            System.out.print(reversedNumber+" ");
        }
        System.out.println();
        System.out.println(reversedNumber);
    }

}
