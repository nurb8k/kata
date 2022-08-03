public class Main {
    public static void calc(String input) {
//        IntegerNumbers integerNumbers = new IntegerNumbers();
//        RimNumbers rimNumbers = new RimNumbers();
//        char[] arr = input.toCharArray();
//        boolean fistNum = false;
//        boolean secNum = false;
//        boolean firstRimNum = false;
//        boolean secRimNum = false;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==' '){
//                break;
//            }else if(arr[i]!=' '){
//                if(arr[i] > '0' && arr[i] >= '9' ){
//                    fistNum= true;
//                }else{
//                    fistNum= false;
//                    break;
//                }
//            }
//        }
//        for (int j = arr.length-1;j > 0; j--) {
//            if(arr[j]==' '){
//                break;
//            }else if{
//                if(arr[j] > '0' && arr[j] >= '9' ){
//                    secNum= true;
//                }else{
//                    secNum= false;
//                    break;
//                }
//            }
//        }
//        if(fistNum && secNum){
//            integerNumbers.calcIntegerNumber(input);
//        }
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
            System.out.println(integerNumbers.calcIntegerNumber(input));
        } else if (itsRim  && count == 1) {
            System.out.println(rimNumbers.calculateRimNumbers(input));
        }else{
            System.out.println("Error");
        }


    }

    public static void main(String[] args) {
        String str = "I + II";


        calc(str);

    }


}
