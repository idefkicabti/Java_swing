import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		
		ImageIcon image = new ImageIcon(new ImageIcon("C:/Users/63963/eclipse-workspace/Java_labels/src/me.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
		Border border = BorderFactory.createLineBorder(Color.CYAN,5);
		
		
		JLabel label = new JLabel();
		label.setText("Yhancy Choi G. Abella");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); 
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(new Color(255,255,255));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setIconTextGap(25);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(150, 150, 400, 400);
		
		JPanel colorCyan = new JPanel();
		colorCyan.setBackground(Color.CYAN);
		colorCyan.setBounds(0, 0, 250, 250);
		
		JPanel colorRed = new JPanel();
	    colorRed.setBackground(Color.RED);
		colorRed.setBounds(250, 0, 250, 250);
		
		JPanel colorGreen = new JPanel();
		colorGreen.setBackground(Color.GREEN);
		colorGreen.setBounds(0, 250, 250, 250);
		
		JPanel colorGray = new JPanel();
		colorGray.setBackground(Color.DARK_GRAY);
		colorGray.setBounds(500, 250, 250, 250);
		
		JPanel colorYellow = new JPanel();
		colorYellow.setBackground(Color.YELLOW);
		colorYellow.setBounds(500, 0, 250, 250);
		
		JPanel colorBlue = new JPanel();
		colorBlue.setBackground(Color.BLUE);
	    colorBlue.setBounds(0, 500, 250, 250);
		
	    JPanel colorMagenta = new JPanel();
		colorMagenta.setBackground(Color.MAGENTA);
		colorMagenta.setBounds(250, 500, 250, 250);
		
		JPanel colorOrange = new JPanel();
		colorOrange.setBackground(Color.ORANGE);
		colorOrange.setBounds(500, 500, 250, 250);
	
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(null);
		jframe.setSize(1000, 1000);
		jframe.setVisible(true);
		jframe.add(label);
		jframe.add(colorCyan);
		jframe.add(colorRed);
		jframe.add(colorGreen);
		jframe.add(colorGray);
		jframe.add(colorYellow);
		jframe.add(colorBlue);
		jframe.add(colorMagenta);
		jframe.add(colorOrange);
		jframe.pack();	
		}
}
