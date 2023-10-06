import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Task 1
        System.out.println("Hello world!");
        // Task 2
        int a = 7;
        float b = 7.7F;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        // Task 3
        boolean x = true;
        boolean y = false;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x && y);
        System.out.println(x || y);
        // Task 4
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        // Task 5
        String str = "Hello World!";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            System.out.println(c);
        }
        // Task 6
        String text = "Hello World!";
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[j] + " ");
                    break;
                }
            }
        }
        // Task 7
        int per = 0;
        for (int i = 100; i > per; i--) {
            System.out.println(i + " бутылок стояло на столе, одна из них упала и разбилась.");
        }
        // Task 8
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
        // Task 9
        String check = "Never Odd or Even";
        System.out.println(isPalindrome(check));
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
        public static char getOperation() {
            System.out.println("Введите операцию:");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }

        public static int calc( int num1, int num2, char operation){
            int result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, getOperation());
            }
            return result;
        }
    public static boolean isPalindrome(String word) {
        String myWord = word.replaceAll("\\s+","");
        String reverse = new StringBuffer(myWord).reverse().toString();
        return reverse.equalsIgnoreCase(myWord);
    }
}