import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calc = scanner.nextLine();
        String a = calc.replace(" ", "");
        boolean stop = false;
        String br = "";
        String first = "";
        String second = "";
        String operation = "";
        String math_first = "";
        String math_second = "";
        String roma_select = "";
        String[] roma = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] roma_continue = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '*' || a.charAt(i) == '/') {
                if (!operation.equals("")) {
                    br = "exit";
                }
                operation = String.valueOf(a.charAt(i));
                first = a.substring(0, i);
                second = a.substring(i + 1);
            }
        }

        if (!first.equals("") && !second.equals("")) {
            for (int i = 0; i < 10; i++) {
                String n = String.valueOf(i + 1);
                if (first.equals(n)) {
                    math_first = "+";
                    first = String.valueOf(i + 1);
                } else if (first.equals(roma[i])) {
                    math_first = "-";
                    first = String.valueOf(i + 1);
                }
                if (second.equals(n)) {
                    math_second = "+";
                    second = String.valueOf(i + 1);
                } else if (second.equals(roma[i])) {
                    math_second = "-";
                    second = String.valueOf(i + 1);
                }
            }

            if (!br.equals("exit")) {
                if (math_first.equals("+") && math_second.equals("+")) {
                    if (operation.equals("+")) {
                        int result = Integer.parseInt(first) + Integer.parseInt(second);
                        System.out.println(result);
                    } else if (operation.equals("-")) {
                        int result = Integer.parseInt(first) - Integer.parseInt(second);
                        System.out.println(result);
                    } else if (operation.equals("*")) {
                        int result = Integer.parseInt(first) * Integer.parseInt(second);
                        System.out.println(result);
                    } else if (operation.equals("/")) {
                        int result = Integer.parseInt(first) / Integer.parseInt(second);
                        System.out.println(result);
                    }
                } else if (math_first.equals("-") && math_second.equals("-")) {
                    if (operation.equals("+")) {
                        int result = Integer.parseInt(first) + Integer.parseInt(second);
                        if (result < 1) {
                            System.out.println("Error");
                        } else {
                            String roma_result = "";
                            for (int i = 0; i < 10; i++) {
                                if (stop) {
                                    break;
                                }
                                for (int j = 0; j < 10; j++) {
                                    if (j == 9) {
                                        roma_result = roma_continue[i];
                                    } else {
                                        roma_result = roma_select + roma[j];
                                    }
                                    if (result == i * 10 + j + 1) {
                                        System.out.println(roma_result);
                                        stop = true;
                                        break;
                                    }
                                }
                                roma_select = roma_continue[i];
                            }
                        }
                    } else if (operation.equals("-")) {
                        int result = Integer.parseInt(first) - Integer.parseInt(second);
                        if (result < 1) {
                            System.out.println("Error");
                        } else {
                            String roma_result = "";
                            for (int i = 0; i < 10; i++) {
                                if (stop) {
                                    break;
                                }
                                for (int j = 0; j < 10; j++) {
                                    if (j == 9) {
                                        roma_result = roma_continue[i];
                                    } else {
                                        roma_result = roma_select + roma[j];
                                    }
                                    if (result == i * 10 + j + 1) {
                                        System.out.println(roma_result);
                                        stop = true;
                                        break;
                                    }
                                }
                                roma_select = roma_continue[i];
                            }
                        }
                    } else if (operation.equals("*")) {
                        int result = Integer.parseInt(first) * Integer.parseInt(second);
                        if (result < 1) {
                            System.out.println("Error");
                        } else {
                            String roma_result = "";
                            for (int i = 0; i < 10; i++) {
                                if (stop) {
                                    break;
                                }
                                for (int j = 0; j < 10; j++) {
                                    if (j == 9) {
                                        roma_result = roma_continue[i];
                                    } else {
                                        roma_result = roma_select + roma[j];
                                    }
                                    if (result == i * 10 + j + 1) {
                                        System.out.println(roma_result);
                                        stop = true;
                                        break;
                                    }
                                }
                                roma_select = roma_continue[i];
                            }
                        }
                    } else if (operation.equals("/")) {
                        int result = Integer.parseInt(first) / Integer.parseInt(second);
                        if (result < 1) {
                            System.out.println("Error");
                        } else {
                            String roma_result = "";
                            for (int i = 0; i < 10; i++) {
                                if (stop) {
                                    break;
                                }
                                for (int j = 0; j < 10; j++) {
                                    if (j == 9) {
                                        roma_result = roma_continue[i];
                                    } else {
                                        roma_result = roma_select + roma[j];
                                    }
                                    if (result == i * 10 + j + 1) {
                                        System.out.println(roma_result);
                                        stop = true;
                                        break;
                                    }
                                }
                                roma_select = roma_continue[i];
                            }
                        }
                    }
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
    }
}

