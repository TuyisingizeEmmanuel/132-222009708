class calculation{
    public static void main(String args[]){
        A obj=new A();
        obj.show();
        obj.display();
        obj.different();
        obj.sum();
        obj.interfacef();
    }

}
class D {
    int a = 70;
    int b = 30;

    public void sum() {
        int answer = a + b;
       System.out.println(+answer);
    }
}

class C extends D {
    public static void display() {
        System.out.println("this is answer from c:");
    }
}

class B extends C {
    public static void different() {
        int x = 32;
        int y = 20;
        int result = x - y;
        System.out.println(+result);
    }
}

interface E {
    void interfacef();
}

class A extends B implements E {
    public void show() {
        System.out.println(a - b);
    }



    public void interfacef() {
        System.out.println("those are the answers:");
    }
}
     
