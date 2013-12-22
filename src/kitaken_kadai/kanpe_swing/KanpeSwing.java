package kitaken_kadai.kanpe_swing;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

public class KanpeSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton b1;
	JLabel l1;
	Font fonts[] = {
			new Font("Safari",Font.PLAIN,14), new Font("SanSerif",Font.PLAIN,14),
			new Font("Monospaced",Font.PLAIN,14), new Font("Dialog",Font.PLAIN,14),
			new Font("DialogInput",Font.PLAIN,14) };

	public KanpeSwing() {
		super();
		this.setSize(300,200);
		l1 = new JLabel("Hello,Swing World");
		l1.setOpaque(true);
		this.add(l1,BorderLayout.CENTER);
		b1 = new JButton("Click");
		b1.addActionListener(new MyActionAdapter());
		this.add(b1,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main (String[] agrs) {
		new KanpeSwing();
	}

	class MyActionAdapter implements ActionListener {
		int a = 0;
		public void actionPerformed(ActionEvent ev) {
			l1.setFont(fonts[a % fonts.length]);
			l1.setText(l1.getFont().getFamily());
			System.out.println(fonts[a % fonts.length]);
			b1.setText("you clicked " + a + "time.");
			a++;
		}
	}
}