public class StringDemo{
    public static void main(String[] args){
    String s1=new String("Naveen");
    String s2="Naveen";
    String s3=s2;
    String s4=new String();
    String s5="Naveen";
    String s6="Naveen";
    System.out.println("The length of s1 is:"+s1.length());
    System.out.println(s4.isEmpty());
    System.out.println(s1.isEmpty());
    System.out.println(s1.indexOf('y'));
    System.out.println(s1.indexOf('a'));
    System.out.println(s5.indexOf('a'));
    System.out.println(s5.lastIndexOf('a'));
    System.out.println(s5.substring(4));
    System.out.println(s5.substring(4,6));
    System.out.println(s5.substring(0,4));
    System.out.println(s5.equals(s1));
    System.out.println(s2.equals(s1));
    System.out.println(s2.equals(s3));
    System.out.println(s2.equals(s6));
    System.out.println(s2.equalsIgnoreCase(s6));
    System.out.println(s2.toLowerCase());
    System.out.println(s2.toUpperCase());
    System.out.println(s2.compareTo(s6));
    System.out.println("A".compareTo("B"));
    System.out.println("B".compareTo("A"));
    System.out.println("A".compareTo("A"));
    System.out.println(s5.replace('i','!'));
    System.out.println(s5.trim());
    }
    }