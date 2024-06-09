package com.lambda;

import java.util.Random;
import java.util.function.*;

public class Lambdas {
    public static void LambdasExamples(){
        //        IOperation<Integer> operationAdd = (n, m)->n + m;
//        IOperation<Integer> opAddSqr = (x, y) ->{
//            x *= x;
//            y *= y;
//            return x + y;
//        };
//
//        IHello SayHello = (name) -> {
//            System.out.println("Hello " + name);
//        };
//
//        System.out.println(operationAdd.calc(20, 30));
//        System.out.println(opAddSqr.calc(5, 8));
//
//        int value = 100;
//
//        IEmptyFunc ret100 = () -> {
//            //value = 200;
//            return value;
//        };
//
//        SayHello.hello("Billy");

        IOperation<Integer> op = CreateOperation('*');
        //int result = Calculate(20, 30, op);
        int result = Calculate(20, 30, (a, b) -> a - b);
        System.out.println(result);

        result = Calculate(50, 1200, User::AddToAge);
        System.out.println(result);
    }

    public static void SystemsIntefacesFuncs()
    {
        Predicate<Integer> positive = (x) -> x > 0;
        Predicate<String> shortName = (n) -> n.length() < 5;

        BinaryOperator<Integer> add = (a, b) -> a + b;
        UnaryOperator<Integer> sqr = (x) -> x * x;

        Function<Integer, String> starsLine = (count) ->{
            String s = "";
            for(int i = 0; i < count; i++)
                s += "*";
            return s;
        };

        Consumer<String> SayHello = (name) ->
                System.out.println("Hello " + name);

        Supplier<Integer> Rand100 = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
    }

    public static IOperation<Integer> CreateOperation(char sign)
    {
        switch (sign){
            case '+': return (a, b)-> a + b;
            case '*': return (a, b)-> a * b;
            default: return null;
        }
    }

    public static int Calculate(int a, int b, IOperation<Integer> operation)
    {
        return operation.calc(a, b);
    }
}



interface IOperation<T>
{
    T calc(T a, T b);
}

interface IEmptyFunc
{
    int retNumber();
}

interface IHello
{
    void hello(String name);
}

class User
{
    public static int AddToAge(int age, int days)
    {
        return age + days / 365;
    }
}
