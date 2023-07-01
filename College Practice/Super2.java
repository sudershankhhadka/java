
class Numbers{
    int m = 200,n=400;
}
class Sum extends Numbers{
    private int m=20,n=90,p=100;
    public void sum(){
        int sum1 = m+n+p;
        System.out.println("The sum without super keyword:"+sum1);
        int sum2 = super.m + super.n+ p;
        System.out.println("The sum with the super keyword:"+sum2);
    }


}
public class Super2 {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum();
    }
}
