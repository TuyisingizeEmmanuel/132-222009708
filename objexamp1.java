class adder {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    class main {
        public static void main(String args[]) {
            adder myadder = new adder();
            int result = myadder.add(5, 3);
            System.out.println("Result: " + result);
        }
    }
}