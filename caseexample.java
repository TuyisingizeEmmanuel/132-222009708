class caseexample{
    public static void main(String args[]){
        int years=50;
        switch(years){
            case 50: System.out.println("Pension of 20%");
            break;
            case 60: System.out.println("Pension of 40%");
            break;
            case 70: System.out.println("Pension of 60%");
            break;
            case 80: System.out.println("Pension of 80%");
            break;
            default:System.out.println("Not allowed for pension");
        }
    }
}