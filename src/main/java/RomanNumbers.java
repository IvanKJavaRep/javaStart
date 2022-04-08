public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println(FromRomanToInt("MCMXCIV"));
    }

    public static int FromRomanToInt(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        for (int I = 0; I < arr.length; I++) {
            if(I<arr.length-1) {
                switch (arr[I]) {
                    case 'I':
                        if (arr[I + 1] != 'V' && arr[I + 1] != 'X') {
                            result += 1;

                        } else if (arr[I + 1] == 'V') {
                            result += 4;
                            I += 1;
                        } else {
                            result += 9;
                            I += 1;
                        }
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        if (arr[I + 1] != 'L' && arr[I + 1] != 'C') {
                            result += 10;

                        } else if (arr[I + 1] == 'L') {
                            result += 40;
                            I += 1;
                        } else {
                            result += 90;
                            I += 1;
                        }
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        if (arr[I + 1] != 'D' && arr[I + 1] != 'M') {
                            result += 100;

                        } else if (arr[I + 1] == 'D') {
                            result += 400;
                            I += 1;
                        } else {
                            result += 900;
                            I += 1;
                        }
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            }
            else
            {
                switch (arr[I]) {
                    case 'I':
                        result += 1;
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        result += 10;
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        result += 100;
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            }

        }
        return result;
    }

}
