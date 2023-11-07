class SI {//class declaration
    public static float multp(int P, int T, int R) {
        return (P * T * R) / 100;
    }

    class interest {
        public static void main(String args[]) {
            SI mySI = new SI();
            float result = mySI.multp(100000, 5, 5);
            System.out.println("INTEREST IS: " + result);
        }
    }
}
