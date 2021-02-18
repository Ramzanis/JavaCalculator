
public class Calculator {

    public int subtract(int sub, int sub2) {
        //Returns the value that was subtracted

        int subtraction = (Math.subtractExact(sub, sub2));

        return subtraction;
    }

    public int addition(int add, int add2){
        //Returns the value that was added

        int addition = (Math.addExact(add, add2));

        return addition;
    }

    public int multiply(int multi, int multi2){
        //Returns the value that was multiplied

        int multiply = (Math.multiplyExact(multi, multi2));

        return multiply;

    }

    public int division(int div, int div2){
        //Returns the value that was divided

        int divide = (Math.floorDiv(div, div2));

        return divide;

    }
















}
