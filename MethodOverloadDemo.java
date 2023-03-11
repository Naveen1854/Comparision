class Add
{
int a, b;
Add ()
{
a = 10;
b = 20;
}
public void add ()
{
System.out.println(a + b);
}
public void add (int a)
{
System.out.println(a + a);
  } 
public void add(float a)
{
System.out.println(a + a);
}
public void add(int a1,int b1)
{
System.out.println(a1 + b1);
}
}
public class MethodOverloadDemo
{
public static void main(String args [])
{
Add a1 = new Add();
a1.add();
a1.add(10);
  } 
}