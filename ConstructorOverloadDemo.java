class Add{
    Add(){
        System.out.println("I am in a Default Constructor");
    }
    Add(int a){
        System.out.println("I am in a Parametrized Constructor with one integer value");
    }
    Add(int a,int b);
    System.out.println("I am in a parametrized Constructor with Two Integer values");
}
Add(int a,float b){
    System.out.println("I am in a Parametrized Constructor with one integer value and one float value");
}
Add(float a,float b){
    System.out.println("I am in a parametrized constructor with two float values");
}
}
public class ConstructorOverloadDemo{
    public static void main(String[] args) {
        Add a1 = new Add();
        Add a2 = new Add(20);
        Add a3 = new Add(20,40);
        Add a4 = new Add(20,40.5f);
        Add a5 = new Add(49.8f,78.8f);
    }
}