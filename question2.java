class CI {
    public static double multp(double P, double R, double T, double n) {
        return P * (Math.pow((1 + R / 1200), n * T));
    }

    class Main {
        public static void main(String args[]) {
            CI myCI = new CI();
            double result = myCI.multp(500000, 18, 3, 12);
            System.out.println("RESULT IS: " + result);
        }
    }
}