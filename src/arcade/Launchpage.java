package arcade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.*;
public class Launchpage  extends javax.swing.JFrame implements ActionListener {
private static final int EXIT_ON_CLOSE = 0;
JFrame frame = new JFrame();
JButton snakebutton = new JButton("Play");
JButton pinball = new JButton("Play");
JButton tictac = new JButton("Play");
  
Launchpage()
{
	JFrame frame = new JFrame();
	JLabel l;
	l = new JLabel("Arcade Games");
	l.setForeground(Color.GREEN);
	l.setBounds(525, 20, 300, 40);
	l.setFont(new Font("Ink Free", Font.BOLD, 40));
	frame.add(l,BorderLayout.NORTH);
	frame.setLayout(null);
	frame.setVisible(true);
	snakebutton.setBounds(180,650,100,30);
	snakebutton.setBackground(Color.BLUE);
    snakebutton.setForeground(Color.WHITE);
	snakebutton.setFocusable(true);
	snakebutton.addActionListener(this);
	pinball.setBounds(590,650,100,30);
	pinball.setBackground(Color.BLUE);
    pinball.setForeground(Color.WHITE);
	pinball.setFocusable(true);
	pinball.addActionListener(this);
	tictac.setBounds(970,650,100,30);
	tictac.setBackground(Color.BLUE);
    tictac.setForeground(Color.WHITE);
	tictac.setFocusable(true);
	tictac.addActionListener(this);
	
	frame.setTitle("Arcade Games");
	ImageIcon icon = new ImageIcon("F:\\Eclipse Workspace\\Arcade\\src\\arcade\\BG.gif");
	JLabel label = new JLabel(icon);
	label.setBounds(0, 20, 1300,710);
	frame.add(label);


	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	frame.setSize(1270,800);
	frame.getContentPane().setBackground(Color.BLACK);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	frame.add(label);
	frame.add(snakebutton);
	frame.add(pinball);
	frame.add(tictac);	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==snakebutton)
	{
		frame.dispose();
		gameframe game1 = new gameframe();
	}
	else if(e.getSource()==tictac)
	{
		frame.dispose();
		tictactoe tic = new tictactoe();
	}
	else if(e.getSource()==pinball)
	{
		//frame.dispose();
		framepong fpong = new framepong();
	}	
}
}
