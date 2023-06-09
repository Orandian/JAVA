import javax.swing.*;
public class Hypotenuse {
    public  static  void hypotenuse(String[] args){
        double x;
        double y;
        double z;

        x = Double.parseDouble(JOptionPane.showInputDialog("Enter side x : "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Enter side y : " ));

        z = Math.sqrt((x * x) + (y + y));

        JOptionPane.showMessageDialog(null, "The hypotenuse is : " + z);
    }
}
