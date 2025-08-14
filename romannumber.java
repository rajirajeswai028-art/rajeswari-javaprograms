public class romannumber{
        class Main {
            public static int romanToInt(String s) {
                int result = 0;
                int num = 0;
                for (int i = s.length() - 1; i >= 0; i--) {
                    switch (s.charAt(i)) {
                        case 'I':
                            num = 1;
                            break;
                        case 'V':
                            num = 5;
                            break;
                        case 'X':
                            num = 10;
                            break;

                            num = 50;
                            break;
                        case 'C':
                            num = 100;
                            break;
                        case 'D':  // D was missing in your original switch, standard roman numeral
                            num = 500;
                            break;
                        case 'M':
                            num = 1000;
                            break;
                        default:
                            System.out.println("Invalid roman number:");
                            num = 0; // assign zero to avoid messing result
                            break;
                    }
                    if (num * 4 < result) {
                        result -= num;
                    } else {
                        result += num;
                    }
                }
                return result;
            }

            public static void main(String[] args) {
                int num = romanToInt("LV");
                System.out.println(num);  // Expected output: 55
            }
        }
    }



