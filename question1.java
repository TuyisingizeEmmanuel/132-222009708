class SI {//class declaration
    public static float multp(int P, int T, int R) {//method declaration
        return (P * T * R) / 100;//result to be returned
    }

    class interest {//class declaration
        public static void main(String args[]) {//main method > this is mandatory statement
            SI mySI = new SI();//creating an object
            float result = mySI.multp(100000, 5, 5);//call method multp and passing argument
            System.out.println("INTEREST IS: " + result);//code to be executed
        }
    }
}
