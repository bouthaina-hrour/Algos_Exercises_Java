package others;

import org.example.others.MyBigInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBigIntegerTest {

    @Test
    void positivePlusPositiveTest(){

        MyBigInteger num1 = new MyBigInteger(3);
        MyBigInteger num2 = new MyBigInteger(5);

        assertEquals(num1.add(num2).toString(),"8");
    }
    @Test
    void positivePlusNegativeTest(){

        MyBigInteger num1 = new MyBigInteger(3);
        MyBigInteger num2 = new MyBigInteger(-5);

        assertEquals(num1.add(num2).toString(),"-2");
    }
    @Test
    void negativePlusNegativeTest(){

        MyBigInteger num1 = new MyBigInteger(-3);
        MyBigInteger num2 = new MyBigInteger(-5);

        assertEquals(num1.add(num2).toString(),"-8");
    }
    @Test
    void negativePlusPositiveTest(){

        MyBigInteger num1 = new MyBigInteger(-3);
        MyBigInteger num2 = new MyBigInteger(5);

        assertEquals(num1.add(num2).toString(),"2");
    }
    @Test
    void positiveMinusPositiveTest(){

        MyBigInteger num1 = new MyBigInteger(3);
        MyBigInteger num2 = new MyBigInteger(5);

        assertEquals(num1.substract(num2).toString(),"-2");
    }
    @Test
    void positiveMinusNegativeTest(){

        MyBigInteger num1 = new MyBigInteger(3);
        MyBigInteger num2 = new MyBigInteger(-5);

        assertEquals(num1.substract(num2).toString(),"8");
    }
    @Test
    void negativeMinusNegativeTest(){

        MyBigInteger num1 = new MyBigInteger(-3);
        MyBigInteger num2 = new MyBigInteger(-5);

        assertEquals(num1.substract(num2).toString(),"2");
    }
    @Test
    void negativeMinusPositiveTest(){

        MyBigInteger num1 = new MyBigInteger(-3);
        MyBigInteger num2 = new MyBigInteger(5);

        assertEquals(num1.substract(num2).toString(),"-8");
    }

    @Test
    void positivePlusPositiveWithCaryTest(){
        MyBigInteger num1 = new MyBigInteger(19);
        MyBigInteger num2 = new MyBigInteger(9);

        assertEquals(num1.add(num2).toString(),"28");
    }
    @Test
    void positiveMinusPositiveWithBorrowTest(){
        MyBigInteger num1 = new MyBigInteger(10);
        MyBigInteger num2 = new MyBigInteger(9);

        assertEquals(num1.substract(num2).toString(),"1");
    }
}
