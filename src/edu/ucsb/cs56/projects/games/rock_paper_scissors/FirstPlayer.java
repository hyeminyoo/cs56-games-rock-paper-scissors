package edu.ucsb.cs56.projects.games.rock_paper_scissors;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


/**
*This class allows the first player to choose their Pokemon. It creates a window that gives the first player the options.
*@author Lesley Khuu
*@version for CS56, W14
*/

public class FirstPlayer extends JFrame {
    
    private ButtonGroup group;
    
    public FirstPlayer() {
        super("Pick your Pokemon Ash!");
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout( new GridLayout(1, 4) );
        group = new ButtonGroup();
        JRadioButton charmander = new JRadioButton("Charmander", true );
        JRadioButton bulbasaur = new JRadioButton("Bulbasaur");
        JRadioButton squirtle = new JRadioButton("Squirtle");
	//	JRadioButton eevee = new JRadioButton("Eevee");
	JRadioButton pik = new JRadioButton("Pikachu");
        charmander.setActionCommand("Charmander");
        bulbasaur.setActionCommand("Bulbasaur");
        squirtle.setActionCommand("Squirtle");
	//	eevee.setActionCommand("Eevee");
	pik.setActionCommand("Pikachu");
        group.add(charmander);
        group.add(bulbasaur);
        group.add(squirtle);
	//	group.add(eevee);
	group.add(pik);
        radioPanel.add(charmander);
        radioPanel.add(bulbasaur);
        radioPanel.add(squirtle);
	//	radioPanel.add(eevee);
	radioPanel.add(pik);
        getContentPane().add( radioPanel, BorderLayout.CENTER );
        JPanel buttonPanel = new JPanel();
        JButton pickFirst = new JButton("I choose you!");
        pickFirst.addActionListener(new PickGameListener());
        buttonPanel.add(pickFirst);
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(600, 300);
        setVisible(true);
    }

    
    private class PickGameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String selected = group.getSelection().getActionCommand();
            
            //make Squirtle image for first player
            if (selected == "Squirtle"){
                new SecondPlayer(1);
		        dispose();
            }
            
            //make bulbasaur image for first player
            if (selected == "Bulbasaur"){
                new SecondPlayer(0);
                dispose();
            }
            
            //make Charmander image for first player
            if (selected == "Charmander"){
                new SecondPlayer(2);
                dispose();
            }
	    /*        //make bulbasaur image for first player
            if (selected == "Eevee"){
                new SecondPlayer(3);
                dispose();
		}*/
            
            //make Charmander image for first player
            if (selected == "Pikachu"){
                new SecondPlayer(3);
                dispose();
            }

	    
       }
    }



}
