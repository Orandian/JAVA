import javax.swing.*;

public class GuiIntro {
    public static void guinntro(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        String food = JOptionPane.showInputDialog("Enter your favourite food");

        JOptionPane.showMessageDialog(
                null,
                "Hello " + name +
                        " you are " + age + " years old." +
                        " Your favourite food is " + food
        );
    }
}
