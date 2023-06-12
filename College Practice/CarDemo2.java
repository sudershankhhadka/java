
//Using Parameterized Method

class randomCar{
    private String CarName;
    private String Company;
    private int Price;

    public void setCarInfo(String n,String c,int p){
      CarName = n;
      Company = c;
      Price = p;
    }
    public void showCarInfo(){
        System.out.println("Car Name: "+ CarName);
        System.out.println("Company: "+ Company);
        System.out.println("Price: "+ Price);
    }
}

public class CarDemo2 {
    public static void main(String[] args){
        randomCar rc = new randomCar();
        rc.setCarInfo("Ford Mustang","Ford",12112);
        rc.showCarInfo();
    }
}
