import Exceptions.InvalidInputException;

public class IntegerNumbers {
    public String calcIntegerNumber(String str) {

        char[] arr = str.toCharArray();
        String temp = "";
        String temp2 = "";
        char operation = ' ';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                operation = arr[i + 1];
                for (int j = i + 3; j < arr.length; j++) {
                    temp2 = temp2 + arr[j];
                }
                break;
            } else {
                temp = temp + arr[i];
            }
        }

        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(temp);
            b = Integer.parseInt(temp2);
        } catch (Exception e) {
            throw new InvalidInputException("Invalid input, please enter only numbers under 10 (including 10)");
        }


        if (a > 10 || b > 10) {
            throw new InvalidInputException("Invalid input, please enter only numbers under 10 (including 10)");
        }
        if (operation == '+') {
            temp = String.valueOf(a + b);
            return temp;
        } else if (operation == '-') {
            temp = String.valueOf(a - b);
            return temp;
        } else if (operation == '*') {
            temp = String.valueOf(a * b);
            return temp;

        } else if (operation == '/') {
            temp = String.valueOf(a / b);
            return temp;
        } else {
            System.out.println("Syntax error");
        }


        return "Something went wrong, please try again with correct syntax";
    }
}
