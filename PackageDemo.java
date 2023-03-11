package naveen;
class PackageEx{
    int a,b;
    void init(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a+","+b);
    }
}
public class PackageDemo {
    public static void main(String[] args) {
        PackEx p = new packEx();
        p.init(10,20);
        p.display();
    }
}
