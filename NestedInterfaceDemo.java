interface A{
    void show();
    interface B{
        void message();
    }
}
class c implements A,A.B{
    public void show(){
        System.out.println("Hello");
    }
    public void message(){
        System.out.println("Hi");
    }
}
public class NestedInterfaceDemo{
    public static void main(String args[]){
        c C = new c();
        C.show();
        C.message();
    }
}