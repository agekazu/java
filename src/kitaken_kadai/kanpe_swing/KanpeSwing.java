package kitaken_kadai.kanpe_swing;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class KanpeSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	public KanpeSwing() {
		super();
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		JLabel l1 = new JLabel("Hello,Swing World");
		this.add(l1,BorderLayout.NORTH);
		l1.setText("rice_american");
		this.setVisible(true);
		JButton b1 = new JButton("Click here!");
		b1.addActionListener(new MyJButtonActionAdapter());
		this.add(b1,BorderLayout.CENTER);
		this.setVisible(true);
	}

	public static void main (String[] agrs) {
		new KanpeSwing();
	}
}

class MyJButtonActionAdapter implements ActionListener {
	long a = 0;
	public void actionPerformed(ActionEvent ev) {
		System.out.println("clicked." + a + "time");
		a++;
	}
}