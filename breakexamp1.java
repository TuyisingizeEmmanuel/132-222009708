public class breakexamp1 {// class declaration

    public static void main(String args[]) {//
        int x = 10;// this is initialization of the code

        while (x < 20) {// the condition of the code for execution
            if (x == 15) {
                break;// this is breaking statement
            }
            System.out.print("value of x : " + x);// code to be executed
            x++;// incrementation
            System.out.print("\n");
        }
    }
}