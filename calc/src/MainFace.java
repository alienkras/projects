

import javax.swing.JFrame;

public class MainFace {

	public static void main(String[] args) {
		Calc r = new Calc("Каркулятор епт.");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		r.setSize(220, 300);
		
		r.setLocationRelativeTo(null);
		//r.setResizable(false);     // чет у меня глючит когда активна  эта команда, не видно окна (os linux)
		

	}

}
