package edu.ucsb.cs56.projects.games.rock_paper_scissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *This class allows the second player to choose their Pokemon depending on what player one selected
 *@author Jordan Nguyen, Brandon Wicka
 *@version for CS56, W15
 */
public class SecondPlayer extends JFrame{

    private ButtonGroup group;
    String first;
    String second;
    String third;
    JRadioButton firstPokemon;
    JRadioButton secondPokemon;
    JRadioButton thirdPokemon;
    JButton pickFirst;
    JPanel buttonPanel;

    public SecondPlayer(final int x) {
        super("Pick your Pokemon Gary!");
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout( new GridLayout(1, 4) );
        group = new ButtonGroup();
        // if bulbasaur was selected first
        if (x == 0) {
            firstPokemon = new JRadioButton("Charmander", true);
            firstPokemon.setActionCommand("Charmander");
            secondPokemon = new JRadioButton("Squirtle");
            secondPokemon.setActionCommand("Squirtle");
	    thirdPokemon = new JRadioButton("Pikachu");
            thirdPokemon.setActionCommand("Pikachu");
        }
        // if squirtle was selected first
        else if (x == 1) {
            firstPokemon = new JRadioButton("Bulbasaur", true);
            firstPokemon.setActionCommand("Bulbasaur");
            secondPokemon = new JRadioButton("Charmander");
            secondPokemon.setActionCommand("Charmander");
	    thirdPokemon = new JRadioButton("Pikachu");
            thirdPokemon.setActionCommand("Pikachu");
        }
        // if charmander was selected first
        else if (x == 2) {
            firstPokemon = new JRadioButton("Bulbasaur", true);
            firstPokemon.setActionCommand("Bulbasaur");
            secondPokemon = new JRadioButton("Squirtle");
            secondPokemon.setActionCommand("Squirtle");
	    thirdPokemon = new JRadioButton("Pikachu");
            thirdPokemon.setActionCommand("Pikachu");
        }

	else {
            firstPokemon = new JRadioButton("Bulbasaur", true);
            firstPokemon.setActionCommand("Bulbasaur");
            secondPokemon = new JRadioButton("Squirtle");
            secondPokemon.setActionCommand("Squirtle");
	    	    thirdPokemon = new JRadioButton("Charmander");
            thirdPokemon.setActionCommand("Charmander");
	}

        group.add(firstPokemon);
        group.add(secondPokemon);
	group.add(thirdPokemon);
        radioPanel.add(firstPokemon);
        radioPanel.add(secondPokemon);
	radioPanel.add(thirdPokemon);
        getContentPane().add( radioPanel, BorderLayout.CENTER );
        buttonPanel = new JPanel();
        pickFirst = new JButton("I choose you!");
        buttonPanel.add(pickFirst);
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(600, 300);
        setVisible(true);

        pickFirst.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                String selected = group.getSelection().getActionCommand();

                if (selected == "Squirtle" && x == 0){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/bulbasaur.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/squirtle.jpg");
                    new TicTacToe(first, second, "Bulbasaur", "Squirtle");
                    dispose();
                }

                if (selected == "Squirtle" && x == 2){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/charmander.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/squirtle.jpg");
                    new TicTacToe(first, second, "Charmander", "Squirtle");
                    dispose();
                }
		
		if (selected == "Squirtle" && x == 3){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/pikachu.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/squirtle.jpg");
                    new TicTacToe(first, second, "Pikachu", "Squirtle");
                    dispose();
                }

                if (selected == "Bulbasaur" && x == 1){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/squirtle.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/bulbasaur.jpg");
                    new TicTacToe(first, second, "Squirtle", "Bulbasaur");
                    dispose();
                }

                if (selected == "Bulbasaur" && x == 2){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/charmander.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/bulbasaur.jpg");
                    new TicTacToe(first, second, "Charmander", "Bulbasaur");
                    dispose();
                }
		
                if (selected == "Bulbasaur" && x == 3){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/pikachu.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/bulbasaur.jpg");
                    new TicTacToe(first, second, "Pikachu", "Bulbasaur");
                    dispose();
                }
                if (selected == "Charmander" && x == 0){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/bulbasaur.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/charmander.jpg");
                    new TicTacToe(first, second, "Bulbasaur", "Charmander");
                    dispose();
                }

                if (selected == "Charmander" && x == 1){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/squirtle.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/charmander.jpg");
                    new TicTacToe(first, second, "Squirtle", "Charmander");
                    dispose();
                }

		if (selected == "Charmander" && x == 3){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/pikachu.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/charmander.jpg");
                    new TicTacToe(first, second, "Pikachu", "Charmander");
                    dispose();
                }

		if (selected == "Pikachu" && x == 0){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/bulbasaur.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/pikachu.jpg");
                    new TicTacToe(first, second, "Bulbasaur", "Pikachu");
                    dispose();
                }

                if (selected == "Pikachu" && x == 1){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/squirtle.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/pikachu.jpg");
                    new TicTacToe(first, second, "Squirtle", "Pikachu");
                    dispose();
                }

		if (selected == "Pikachu" && x == 2){
                    ImageIcon first = new ImageIcon("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/charmander.jpg");
                    ImageIcon second = new ImageIcon ("src/edu/ucsb/cs56/projects/games/rock_paper_scissors/images/pikachu.jpg");
                    new TicTacToe(first, second, "Charmander", "Pikachu");
                    dispose();
                }
            }
        });
    }

}




