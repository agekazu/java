package kitaken_kadai.kanpe_swing;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class KanpeSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton b1;
	JLabel l1;
	Color color[] = {Color.BLACK, Color.RED, Color.BLUE,
			Color.CYAN,Color.DARK_GRAY, Color.GRAY,
			Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
			Color.ORANGE, Color.PINK, Color.WHITE, Color.YELLOW,
			Color.RED, new Color(100, 150, 200)};

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
			l1.setBackground(color[a % color.length]);
			System.out.println(a % color.length);
			b1.setText("you clicked " + a + "time.");
			a++;
		}
	}
}