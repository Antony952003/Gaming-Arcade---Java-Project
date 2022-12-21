package arcade;
import java.awt.*;
//import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class gameframe extends JFrame{
	
gameframe()
{	
	
	gamepanel gamep = new gamepanel();
	this.add(gamep);
	this.setTitle("Snake Game");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
	this.pack();
	this.setVisible(true);
	this.setLocationRelativeTo(null);
}
}
