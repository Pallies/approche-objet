package fr.diginamic.swing.jdr.view;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.diginamic.swing.jdr.controler.Combattre;
import fr.diginamic.swing.jdr.personnage.Hero;

public class PanelSouth extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1566338658508418686L;

	public PanelSouth() {
		add(buttonCombattre());
		add(buttonScore());
		add(buttonQuitter());
	}

	public JButton buttonCombattre() {
		JButton combattre = new JButton("Combattre");
		combattre.addActionListener(e -> {
//			COMBATTRE
			System.out.println("COMBATTRE");
			new Combattre();
		});
		return combattre;
	}

	public JButton buttonScore() {
		JButton score = new JButton("Score");
		score.addActionListener(e->{
//			SCORE
			System.out.println("SCORE");
			System.out.println(Hero.getHero().getScore());
		});
		return score;

	}

	public JButton buttonQuitter() {
		JButton quitter = new JButton("Quitter");
		quitter.addActionListener(e -> System.exit(0));
		return quitter;
	}
}
