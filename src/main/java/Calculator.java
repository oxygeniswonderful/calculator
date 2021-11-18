public class Calculator {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        Calculator mainClass = new Calculator();

        System.out.println(mainClass.plus(x,y));
        System.out.println(mainClass.minus(x,y));




    }

    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    public int minus(int number1, int number2) {
        return number1 - number2;
    }
}
