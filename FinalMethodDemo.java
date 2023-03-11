class A
{
int a,b;
A()
{
a = 10;
b = 20;
}
final void display()
{
System.out.println(a + " , "  + b);
}
}
class B extends A
{
B()
{
super();
}
public void display();
{
System.out.println(a + " ," + b);
}
}
public class FinalMethodDemo
{
public static void main(String args[])
{
B b = new B();
b.display();
}
}

