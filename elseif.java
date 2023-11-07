 class condition{
    public static void main(String args[]){
     int workinghours=5;
    if(workinghours<5)
    {
        System.out.println("Paid 50$");
    }
    else if(workinghours>=5 && workinghours<7)
    {
        System.out.println("Paid 100$");
    }
    else if(workinghours>=7 && workinghours<9)
    {
        System.out.println("Paid 200$");
    }
    else if(workinghours>=9 && workinghours<10)
    {
        System.out.println("Paid 300$");
    }
    else{
        System.out.println("Not valid and there is no payment");
    }
}}