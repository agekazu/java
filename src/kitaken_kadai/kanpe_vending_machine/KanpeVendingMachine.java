package kitaken_kadai.kanpe_vending_machine;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

public class KanpeVendingMachine extends JFrame {
	private static final long serialVersionUID = 1L;

	public KanpeVendingMachine() {
		// 一番下のflame
		JFrame frame = new JFrame();
		frame.setTitle("自動販売機");
		frame.setSize(500, 600);
        // -> new GridLayout(行数=3, 列数=1)
        frame.getContentPane().setLayout(new GridLayout(3, 1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// DrinkPanel(飲み物の提示を行うパネル)
		DrinkPanel dp = new DrinkPanel();
		frame.getContentPane().add(dp);

		// ControlPanel(操作を行うネル)
		ControlPanel cp = new ControlPanel();
		frame.getContentPane().add(cp);

		// ControlPanel(購入履歴を表示するパネル)
		HistoryPanel hp = new HistoryPanel();
		frame.getContentPane().add(hp);

		frame.setVisible(true);
	}

	class DrinkPanel extends JPanel{

		private static final long serialVersionUID = 1L;

		int drinkLength = 5;	// 横列のドリンクの数
		int drinkSide = 2;		// 縦列のドリンクの数
		String[][] drinkName = new String[drinkSide][drinkLength];
		int[][] drinkValue = new int[drinkSide][drinkLength];
		int drinkWidth = 30;
		int drinkHeight = 30;

		public DrinkPanel(){

			drinkName = new String[][] {
					{ "コーヒー", "コーヒー", "オレンジ", "コーラ", "ペプシ"},
					{ "PETお茶", "PETジュース", "PETお茶", "お茶", "お茶"}
			};

			drinkValue = new int [][]{
					{110, 110, 110, 110, 110},
					{150, 150, 150, 110, 110}
			};
		}


		public void paintComponent(Graphics g){

			setBackground(Color.BLUE);
			//			g.setColor(Color.gray);
			//			g.fillOval(50,240,100,100);
			//			g.drawOval(200,240,100,100);

			for (int y = 0; y < 2; y++) {
				for (int x = 0; x < drinkValue[0].length; x++) {
				}
			}
		}

		private void drawDrinkObject(Graphics g, int x, int y, String string, int value) {
		}
	}

	class ControlPanel extends JPanel{
		public ControlPanel(){
			setBackground(Color.RED);
		}
	}

	class HistoryPanel extends JPanel{
		public HistoryPanel(){
			setBackground(Color.YELLOW);
		}
	}

	public static void main(String[] args) {
		new KanpeVendingMachine();
	}

}
