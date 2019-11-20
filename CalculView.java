package aftis.calculatrice.tuto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculView extends JFrame {
	
	JPanel panelNorth,panelCentre, panelEst,panelSouth;
	
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSous,bDiv,bMulti, bEqual;
	
	JLabel labelA, labelB, labelResultat;
	
	JTextField nombreA, nombreB, resultat;
	
	JTextField jTextFiledCurrent = nombreA;
	

	CalculController controller;

	public CalculView(String name, CalculModel model) {
		
		super(name);
		
		controller = new CalculController(model,this);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(new Dimension(600,400));
		this.setLocationRelativeTo(null); // Etre centré par Rapport a l'ecran principale
		
		conctructionHaut();
		constructionEst();
		constructionCentre();
		constructionSud();
		addListener();
		
	
		this.setVisible(true);
		
    }



	private void constructionSud() {
		// TODO Auto-generated method stub
		
		labelResultat = new JLabel("Resultat : ");
		
		resultat = new JTextField(10);
		
		panelSouth = new JPanel();
		
		panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		panelSouth.add(labelResultat);
		panelSouth.add(resultat);
		
		this.getContentPane().add(panelSouth,BorderLayout.SOUTH);
		
		
		
		
	}



	private void constructionCentre() {
		// TODO Auto-generated method stub
		
		panelCentre = new JPanel();
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		GridLayout gl = new GridLayout(5,2);
		
		gl.setHgap(10);
		gl.setVgap(10);
		
		panelCentre.setLayout(gl);
		
		panelCentre.setBorder(new EmptyBorder(5,20,10,30));
		
		panelCentre.add(b8);
		panelCentre.add(b9);
		panelCentre.add(b6);
		panelCentre.add(b7);
		panelCentre.add(b4);
		panelCentre.add(b5);
		panelCentre.add(b2);
		panelCentre.add(b3);
		panelCentre.add(b0);
		panelCentre.add(b1);
		
		this.getContentPane().add(panelCentre, BorderLayout.CENTER);
		
				
		
		
		
	}



	private void constructionEst() {
		
		panelEst = new JPanel();
		
		GridLayout gl = new GridLayout(5,1);
		
		
		gl.setVgap(10);
		
		panelEst.setLayout(gl);
		
		panelEst.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		bAdd = new JButton("+");
		bSous = new JButton("-");
		bMulti = new JButton("*");
		bDiv = new JButton("/");
		bEqual = new JButton ("=");
		

		panelEst.add(bAdd);
		panelEst.add(bSous);
		panelEst.add(bMulti);
		panelEst.add(bDiv);
		panelEst.add(bEqual);
		
		
		
		
		this.getContentPane().add(panelEst, BorderLayout.EAST);
		
		
		
	}



	private void conctructionHaut() {
		// TODO Auto-generated method stub
		
		panelNorth = new JPanel();
		
		panelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5,5));
		
		panelNorth.setBorder(new EmptyBorder(3,0,10,0));
		
		labelA = new JLabel("operande A : ");
		labelB = new JLabel("operande B : ");
		
		
		nombreA = new JTextField("Operande A",10);
		nombreB = new JTextField("Operande B",10);
		
		
		panelNorth.add(labelA);
		panelNorth.add(nombreA);
		panelNorth.add(labelB);
		panelNorth.add(nombreB);
		
		this.getContentPane().add(panelNorth, BorderLayout.NORTH);
		
	}
	
	
	
	public void addListener() {
		
		b0.addActionListener(controller);
		b1.addActionListener(controller);
		b2.addActionListener(controller);
		b3.addActionListener(controller);
		b4.addActionListener(controller);
		b5.addActionListener(controller);
		b6.addActionListener(controller);
		b7.addActionListener(controller);
		b8.addActionListener(controller);
		b9.addActionListener(controller);
		
		
		bAdd.addActionListener(controller);
		bSous.addActionListener(controller);
		bMulti.addActionListener(controller);
		bEqual.addActionListener(controller);
		
		
		nombreB.addMouseListener(new TextFieldMouseListener());
		nombreA.addMouseListener(new TextFieldMouseListener());
		
		
		
		
	}
	
	
	
	public JTextField getTextField() {
			
		
		
		 return this.jTextFiledCurrent;
		
	}
	
	
	

public class TextFieldMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		jTextFiledCurrent = (JTextField) e.getSource();
		
		jTextFiledCurrent.setText("");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
	

	//1-Ajouter des listener a tout nos bouttons.
	//2- Si on detecte un clique sur une de nos operation (+,-,/,*) alors on bascule vers le 
	// deuxieme champs de notre operande a savoire openade b
	
	

}





