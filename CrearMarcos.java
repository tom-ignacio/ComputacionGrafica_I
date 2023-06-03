package Graficos;
import javax.swing.*;

// Tomas Villasmil (29.546.329)

public class CrearMarcos {
	public static void main(String[] args) {
		miMarco marco1 = new miMarco();
    		marco1.setVisible(true);
    		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class miMarco extends JFrame {
	public miMarco () {
	//	setSize(500,500);
		//setLocation(500,300);
		setBounds(500,300,550,250);
	//	setResizable(false);
	//	setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Mi primera Ventana");
	}	
}
