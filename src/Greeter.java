import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String n = JOptionPane.showInputDialog("what is your name");
	JOptionPane.showMessageDialog(null, "hi " + n);
}
}
