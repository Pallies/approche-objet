package fr.diginamic.swing.jdr.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
		JPanel heroPanel = new JPanel();
		getContentPane().add(heroPanel, BorderLayout.WEST);
		
		JPanel creaturePanel=new JPanel();
		getContentPane().add(creaturePanel, BorderLayout.EAST);
		
	}
}
