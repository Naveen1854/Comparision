class ArrayDemo{
public static void main(String args[]){
int a[]=new int[10];
for(int i=0;i<10;i++){
a[i]=i;
}
for(int i:a){
System.out.println(i);
    }
  }
}