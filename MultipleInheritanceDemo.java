    interface A
    {
        int a = 10;
        void getA(int a);
        void dispA();
    }
    class B
    {
        int b;
        public void getB(int b)
        {
            this.b=b;
        }
        public void dispB()
        {
            System.out.println(b);
        }
    }
    class C extends B implements A
    {
        int a;
        public void getA(int a)
        {
            this.a = a;
        }
        public void dispA()
        {
            System.out.println(a);
        }
    }
    public class MultipleInheritanceDemo
    {
        public static void main(String[] args) 
        {
            B b = new B();
            b.getData(20);
            b.display();
        }
    }   
