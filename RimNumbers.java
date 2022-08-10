import Exceptions.invalidInputException;

public class RimNumbers {
    public String calculateRimNumbers(String input){
        char[] arr = input.toCharArray();
        RomanToInteger romanToInteger = new RomanToInteger();
        IntegerToRoman integerToRoman = new IntegerToRoman();
        char operation = ' ';
        String temp = "";
        String temp2 = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                int a = romanToInteger.romanToDecimal(temp);
                operation = arr[i+1];
                for (int j = i + 3; j < arr.length; j++) {
                    temp2 = temp2 + arr[j];
                    if( j == arr.length-1){
                        int b = romanToInteger.romanToDecimal(temp2);
                        String res = "";
                        if(a<b && a > 10 || b > 10 && operation == '-' || operation == '/'){
                            throw new invalidInputException("invalid input , please enter number like n1 > n2 ");
                        }
                        if(operation == '+'){
                            res = IntegerToRoman.intToRoman(a+b);
                            return res;
                        }
                        else if(operation == '-' && a-b > 0){
                            res = IntegerToRoman.intToRoman(a-b);
                            return res;
                        }
                        else if(operation == '*'){
                            res = IntegerToRoman.intToRoman(a*b);
                            return res;
                        }
                        else if(operation == '/' && a/b > 0){
                            res = IntegerToRoman.intToRoman(a/b);
                            return res;
                        }
                        else{
                            return "";
                        }

                    }
                }
                break;
            }else{
                temp = temp + arr[i];
            }
        }
        return "";
    }

}
