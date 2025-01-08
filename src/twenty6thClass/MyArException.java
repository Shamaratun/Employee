package twenty6thClass;
public class MyArException {

    public static void main(String[] args) {
        try {
            int devidedByZero = 5 / 0;
            System.out.println("Rest of code in try block");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException =>" + e.getMessage());
        }
    }
}

//package twenty6thClass;
//
//public class MyArException {
//    public static void main(String[] args) {
//        try {
//            int dividedByZero = 5 / 0; // This will throw ArithmeticException
//            System.out.println("Rest of code in try block");
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException => " + e.getMessage()); // Handles division by zero exception
//        }
//    }
//}
