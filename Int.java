public class Int {



        static int value(char r) {
            if (r == 'I')
                return 1;
            if (r == 'V')
                return 5;
            if (r == 'X')
                return 10;
            return -1;
        }

        public static void main(String[] args) {
            String str = "VI + IV";

            try {
                char[] arr = str.toCharArray();
                String temp = "";
                String temp2 = "";
                char operation = ' ';
                if (arr[0] < '9') {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == ' ') {
                            operation = arr[i + 1];
                            for (int j = i + 3; j < arr.length; j++) {
                                /* Kosu Azaitu Bolu */
                                temp2 = temp2 + arr[j];

                            }
                            break;
                        } else {

                            temp = temp + arr[i];
                        }
                    }
                }
                // RIM
                else {
                    int res = 0;
                    // VI + IV
                    // V + I
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == ' ') {
                            operation = arr[i + 1];
                            for (int j = i + 3; j < arr.length; j++) {

                            }
                            break;
                        } else {
                            int s1 = value(str.charAt(i));

                            if (i + 1 < arr.length && arr[i + 1] != ' ') {
                                int s2 = value(str.charAt(i + 1));

                                if (s1 >= s2) {
                                    res = res + s1 + 1;
                                } else {
                                    res = res + s2 - s1;
                                }
                                System.out.println(res);
                            } else {
                                res = res + s1;
                            }

                        }
                    }


                }




            } catch (Exception e) {

                e.printStackTrace();

            }

        }




}
