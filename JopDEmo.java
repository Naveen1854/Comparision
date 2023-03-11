import javax.swing.*;
public class JopDemo{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        System.out.println(name + "\t" + age);
    }
}