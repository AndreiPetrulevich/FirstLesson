
public class Main {
    // the task 2
    public static byte wight = 1;
    public static short higth = 2;
    public static int radius = 3;
    public static long number = 4L;

    public static double pi = 3.14;
    public static float libNumber = 3.41F;

    public static char yesChar = 'A';

    public static boolean question = true;

    public static String text = "The result of the equalization is: ";

    public static void main(String[]args) {
        System.out.println(text + equation(5.3F, 4.3F, 5.2F, 2.3F));
        checkRange(5,6);
        checkTheNumber(-2);
        greeting("Puding");
        checkLeapYear(1700);
    }

    // the task 3
    public static float equation(float a, float b, float c, float d){
        return a*(b+(c/d));
    }

    // the task 4
    public static boolean checkRange(int x, int y){
        int sum = x + y;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        else {
            return false;
        }
    }

    // the task 5
    public static void checkOnPositiveOrNegative (int number){
        if(number >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // the task 6
    public static boolean checkTheNumber (int number){
        if(number < 0){
            return true;
        }
        return false;
    }

    // the task 7
    public static void greeting (String name){
        System.out.println("Привет, " + name + "!");
    }

    // the task 8
    public static void checkLeapYear (int year){
        if(year % 400 == 0){
            System.out.println(year + " год - високосный.");
        } else if(year % 100 == 0){
            System.out.println(year + " год - не високосный.");
        } else if(year % 4 == 0){
            System.out.println(year + " год - високосный.");
        } else System.out.println(year + " год - не високосный.");
    }
}
