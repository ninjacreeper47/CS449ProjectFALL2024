import java.util.stream.DoubleStream;

public class Calculator {


    //example from tutorial
    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    //example from tutorial
    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    //function written by me
    static double addseventeen ( double number)
    {
        return number + 17.0;
    }
    //function written by me
    static int MakeNegative(int num)
    {
        if(num <0)
        {
            return num;
        }
        else
        {
            return num * -1;
        }
    }

}