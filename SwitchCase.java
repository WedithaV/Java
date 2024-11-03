import javax.swing.JOptionPane;

public class SwitchCase { 
  public static void main(){
    String date = JOptionPane.showInputDialog("Enter Day");
    switch(date){
      case "Sunday":
      JOptionPane.showMessageDialog(null,"Sun");
      break;
      case "Monday":
      JOptionPane.showMessageDialog(null,"Mon");
      break;
      case "Tuesday":
      JOptionPane.showMessageDialog(null,"Tue");
      break;
      default:
      JOptionPane.showMessageDialog(null,"A day");
    }
  }
}

