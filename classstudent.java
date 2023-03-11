Class Student
{
    int rno;
    string name;
    Student (int num,string sname){
        rno=num;
        name=sname;
    }

void display()
    {
        System.out.println(rno+"\t"+name);
    }
}
class studentDemo
{
    public static void main(String[] args) {
        student s1= new student(1,"karthik");
        s1.display();
    }
}