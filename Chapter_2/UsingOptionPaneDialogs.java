import javax.swing.JOptionPane;

public class UsingOptionPaneDialogs {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
        
        if (name != null && !name.isEmpty()) {
            int response = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Action canceled.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must enter a name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
