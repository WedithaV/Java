import javax.swing.JOptionPane;

public class GUI_basics {
  public static void main(String[] args){
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null,"Hello "+name);
    
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    // convert string to a int
    JOptionPane.showMessageDialog(null,"Your age is "+age);

    float height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height"));
    JOptionPane.showMessageDialog(null,"Your height is "+height);

  }  
}
