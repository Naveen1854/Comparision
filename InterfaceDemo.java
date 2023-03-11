interface A
{
int a = 10;  //public final int a = 10;
void getData(int a);  //public abstract void getData(int a);
void display();  //public abstract void display();
}
class B implements A
{
int a;
public void getData(int a)
{
this.a = a;
}
public void display()
{
System.out.println(a);
}
}
public class InterfaceDemo
{
public static void main(String args[])
{
B b = new B();
b.getData(20);
b.display();
}
}
 


