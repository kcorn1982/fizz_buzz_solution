import java.util.ArrayList;

public class FizzBuzzSolver {

    public boolean divisibleBy(int num1, int num2){
        return num1 % num2 == 0;
    }

    public ArrayList<String> fizzBuzzSolution(int lowestNumber, int highestNumber){
        ArrayList<String> fizzBuzzArrList = new ArrayList<String>();

        for (int i = lowestNumber; i <= highestNumber; i++) {
            if (divisibleBy(i, 15)){
                fizzBuzzArrList.add("FizzBuzz");
            } else if (divisibleBy(i, 3)){
                fizzBuzzArrList.add("Fizz");
            } else if (divisibleBy(i, 5)){
                fizzBuzzArrList.add("Buzz");
            } else {
                fizzBuzzArrList.add(Integer.toString(i));
            }
        }

        return fizzBuzzArrList;
    }

}
