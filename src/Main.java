public class Main {
    public static void main(String[] args) {
        System.out.println("Easy Peasy Calculator\n");

        int value1 = 10, value2 = 3;
        int result = 0;
        result = substract(value1, value2);
        System.out.println("Result Substraction:" + result);

        System.out.println("Result Substraction TEST:" + substract(10, 3));

        result = addition(value1, value2);
        System.out.println("Result Addition:" + result);
        result = divide(value1, value2);
        System.out.println("Result Divide:" + result);
        result = multi(value1, value2);
        System.out.println("Result Multi:" + result);
        result = modulo(value1, value2);
        System.out.println("Result Modulo:" + result);
        //Aufgabe2
        //Rückgabe als String nicht int
        System.out.println("Result AddString:" + addString(value1, value2));
        // Bonusaufgabe
        System.out.println("Größer gleich\n" + checkParameter(value1, value2));

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

    public static String addString(int value1, int value2) {
        return "Summe :" + (value1 + value2);
    }

    public static String checkParameter(int value1, int value2){
        int wert = 100;
        if (value1 > wert){
            if (value2 > wert){
                return "Beide Werte größer 100";
            }
            return "Wert 1 größer 100, Wert 2 nicht";
        }
        return "Kein Wert > 100";
    }
}

