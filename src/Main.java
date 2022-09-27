public class Main {
    public static void main(String[] args) {
        System.out.println("Easy Peasy Calculator\n");

        int value1 = 10, value2 = 3;
        int result = 0;
        result = substract(value1, value2);
        System.out.println("Result Substraction:" + result);
        result = addition(value1, value2);
        System.out.println("Result Addition:" + result);
        result = divide(value1, value2);
        System.out.println("Result Divide:" + result);
        result = multi(value1, value2);
        System.out.println("Result Multi:" + result);
        result = modulo(value1, value2);
        System.out.println("Result Modulo:" + result);
    }

    public static int substract(int value1, int value2) {
        return value1 - value2;
    }
    public static int addition(int value1, int value2) {
        return value1 + value2;
    }
    public static int divide(int value1, int value2) {
        return value1/value2;
    }
    public static int multi(int value1, int value2) {
        return value1 * value2;
    }
    public static int modulo(int value1, int value2) {
        return value1%value2;
    }
}

