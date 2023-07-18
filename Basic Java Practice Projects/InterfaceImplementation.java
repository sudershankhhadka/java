interface Test1{
    String Name= "Sudershan Khadka";
    int age=21;
    void showInfo();
}

class Test2 implements Test1{
    public void showInfo(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+ age);
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {


        Test2 t = new Test2();
        t.showInfo();
    }

}
