class CI {//CLASS declaration
    public static double multp(double P, double R, double T, double n) {//method declaration
        return P * (Math.pow((1 + R / 1200), n * T));//result to be returned by the method
    }

    class Main {//class declaration
        public static void main(String args[]) {//
            CI myCI = new CI();// object creation
            double result = myCI.multp(500000, 18, 3, 12);//call multp method and assign values for arguments
            System.out.println("RESULT IS: " + result);// code to be executed
        }
    }
}
