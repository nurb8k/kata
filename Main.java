public class Main {
    public static String calc(String input) {

        IntegerNumbers integerNumbers = new IntegerNumbers();
        RimNumbers rimNumbers = new RimNumbers();
        char[] check = new char[input.length()];
        boolean itsInt = false;
        boolean itsRim = false;
        int count = 0;
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                for (int j = i + 3; j < arr.length; j++) {
                    check[j] = arr[j];
                }
                for (int k = i+1;k< arr.length;k++){

                    if(arr[k] >= '*' && arr[k] <='/'){
                        count++;
                    }
                }
                break;
            } else {

                check[i] = arr[i];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (check[i] > '0' && check[i] <= '9') {
                itsInt = true;
            } else {
                itsInt = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (check[i] >= 'I' && check[i] <= 'X') {
                itsRim = true;
            } else {
                itsRim = false;
            }
        }

        if (itsInt  && count == 1 ) {
            return integerNumbers.calcIntegerNumber(input);
        } else if (itsRim  && count == 1) {
             return rimNumbers.calculateRimNumbers(input);
        }else{
            System.out.println("Error");
        }

        return "Error";
    }




}
