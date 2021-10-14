package OverLoadingAndOverRiding;

public class Main {
    public static void main(String[] args) {
        Fan basicFan=new Fan();
        //Overloading
        basicFan.setTheParameters();
        basicFan.setTheParameters(25,4,500);
        //OverRiding
        basicFan.show();
        Fan HavellsFan=new HavellsFan();
        HavellsFan.show();
    }
}
