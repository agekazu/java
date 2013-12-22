package kitaken_kadai.kanpe_vending_machine;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

public class KanpeVendingMachine extends JFrame {
	private static final long serialVersionUID = 1L;

	public KanpeVendingMachine() {
		JFrame frame = new JFrame();
		frame.setTitle("Basic Shapes");
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		VendingMachinePanel vmp = new VendingMachinePanel();
		frame.getContentPane().add(vmp);

		frame.setVisible(true);
	}

	class VendingMachinePanel extends JPanel{

		private static final long serialVersionUID = 1L;

		public VendingMachinePanel(){
			setBackground(Color.white);
		}

		public void paintComponent(Graphics g){
			g.setColor(Color.red);
			g.fillRect(50,100,100,100);
			g.drawRect(200,100,100,100);

			g.setColor(Color.black);
			g.drawLine(350,100,450,200);

			g.setColor(Color.gray);
			g.fillOval(50,240,100,100);
			g.drawOval(200,240,100,100);

			g.setColor(Color.black);
			g.drawString("Welcome to java graphics.", 10, 20);	
		}
	}

	public static void main(String[] args) {
		new KanpeVendingMachine();
	}

}
