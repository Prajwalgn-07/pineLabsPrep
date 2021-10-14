package OverLoadingAndOverRiding;

public class HavellsFan extends Fan{
    public String nameOfTheCompany;
    public HavellsFan(){
        this.nameOfTheCompany="Havells";
    }
    @Override
    public void show() {
        System.out.println("Name "+nameOfTheCompany+" Speed is "+30+" Wings "+5+" Price "+4000);
    }
}
