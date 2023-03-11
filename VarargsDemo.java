class Numbers{
    void add(int...a){
        for (int i:a){
            System.out.println(i);
        }
    }
}
public class VarargsDemo{
    public static void main(String[] args) {
        Numbers n1 = new Numbers();
        n1.add(5);
        n1.add(10,20);
        n1.add(30,40,50,60);
    }
}