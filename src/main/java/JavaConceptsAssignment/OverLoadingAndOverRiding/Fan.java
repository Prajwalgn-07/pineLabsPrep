package JavaConceptsAssignment.OverLoadingAndOverRiding;

public class Fan {
    public int Speed;
    public int NumberOfWings;
    public int PriceInRs;
    public void setTheParameters(){
        this.Speed=24;
        this.NumberOfWings=3;
        this.PriceInRs=25;
    }
    public void setTheParameters(int speed,int numberOfWings,int priceInRs){
        this.Speed=speed;
        this.NumberOfWings=numberOfWings;
        this.PriceInRs=priceInRs;
    }
    public void show(){
        System.out.println("Speed is "+Speed+" Wings "+NumberOfWings+" Price "+PriceInRs);
    }
}

