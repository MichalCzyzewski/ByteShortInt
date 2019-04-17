package pl.mczyzewski.main;

public class Main {

    public static void main(String[] args) {

        //1.    Create a byte veriable and set it to any valid byte number
        byte myByteNumber = 120;
        //2.    Create a short veriable and set it to any valid byte number
        short myShortNumber = 22222;
       //3. Create a integer veriable and set it to any valid byte number
        int myIntegerNumber = 23334443;
        //4.    Create a varible of type long, and make it equal to 50000 + 10 times
        //      to sum of the byte, plus the short plus the int
        long totalValue = 5000 + (myByteNumber * 10) + myShortNumber + myIntegerNumber;

        System.out.println(totalValue);
    }
}                                 
