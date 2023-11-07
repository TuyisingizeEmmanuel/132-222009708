class main {
    public static int addNumbers(int numb1, int numb2) {
        return numb1 + numb2;
    }

    public static void main(String args[]) {
        int number1 = 5;
        int number2 = 7;
        int result = addNumbers(number1, number2);
        System.out.println("The sum of" + number1 + " and " + number2 + " is:" + result);
    }
}