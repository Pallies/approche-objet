package fr.diginamic.swing.jdr.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

/**
 * Fenêtre principale
 * @author Yvan Palliès
 *
 */
public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5122795491589640476L;

	public Frame() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setBounds(10, 10, 700, 600);
		getContentPane().setLayout(new BorderLayout(0, 0));

		PanelSouth panelSouth = new PanelSouth();
		getContentPane().add(panelSouth, BorderLayout.SOUTH);
		
		JPanel HeroCadre = new JPanel();
		getContentPane().add(HeroCadre, BorderLayout.WEST);
		HeroCadre.setLayout(null);
		
		JLabel heroImg = new JLabel("");
		heroImg.setBounds(0, 0, 230, 528);
		heroImg.setHorizontalAlignment(SwingConstants.LEFT);
		heroImg.setIcon(new ImageIcon("C:/Users/Peac178/Documents/dev/Diginamic/Exercices/approche-object/images/hero.jpg"));
		HeroCadre.add(heroImg);
		
	}
}
