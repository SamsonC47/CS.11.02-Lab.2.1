/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Samson
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {



    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String a) {
        return "早上好, " + a + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String a){
        return "下午好, " + a + "!";
    }
    // 5. triple
    public static String triple(String a){
        return a + a + a;
    }

    // 6. half
    public static double half(double a){
        return a/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value){
        return(int) Math.round(value);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value) {
        return (int)(value-0.5);
    }
}


