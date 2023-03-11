class Student
{
int rno;
String name;
void getData(int num,String Sname)
{
rno = num;
name = Sname;
}
}
class MyDemo
{
public static void main(String args [])
{
Student s1 = new Student();
s1.getData(1,"Naveen");
System.out.println(s1.rno + "\n" +s1. name);
  }
}