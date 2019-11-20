package aftis.calculatrice.tuto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculController implements ActionListener{

	
	CalculModel model;
	CalculView view;
	
	
	public CalculController(CalculModel model, CalculView view) {
		
		this.model = model;
		this.view = view;
		
		
	}

	// Si on detecte le clique d'un boutton.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s =  ((JButton) e.getSource()).getText();
		
		if(view.getTextField() == null) {
			
			view.nombreA.setText("");
			
			view.jTextFiledCurrent = view.nombreA;
		}
		switch(s) {
		
		case "0" : 
			
			view.getTextField().setText(view.getTextField().getText()+"0");
			break;
		case "1" : 
			view.getTextField().setText(view.getTextField().getText()+"1");
			break;
		case "2" : 
			view.getTextField().setText(view.getTextField().getText()+"2");
			break;
		case "3" : 
			view.getTextField().setText(view.getTextField().getText()+"3");
			break;
		case "4" : 
			view.getTextField().setText(view.getTextField().getText()+"4");
			break;
		case "5" : 
			view.getTextField().setText(view.getTextField().getText()+"5");
			break;
		case "6" : 
			view.getTextField().setText(view.getTextField().getText()+"6");
			break;
		case "7" : 
			view.getTextField().setText(view.getTextField().getText()+"7");
			break;
		case "8" : 
			view.getTextField().setText(view.getTextField().getText()+"8");
			break;
		case "9" : 
			view.getTextField().setText(view.getTextField().getText()+"9");
			break;
			
		case "+" :
			 
			
			view.resultat.setText(""+model.addition(Integer.parseInt(view.nombreA.getText()), Integer.parseInt(view.nombreB.getText())));
			break;
		
		case "-" :
			view.resultat.setText(""+model.soustraction(Integer.parseInt(view.nombreA.getText()), Integer.parseInt(view.nombreB.getText())));
			break;
			
		case "/" :
			
			view.resultat.setText(""+model.division(Integer.parseInt(view.nombreA.getText()), Integer.parseInt(view.nombreB.getText())));
			break;
			
			
		case "*" :
			
			view.resultat.setText(""+model.multiplication(Integer.parseInt(view.nombreA.getText()), Integer.parseInt(view.nombreB.getText())));
			break;
		
		}
		
		
	   
		System.out.println(Integer.parseInt(view.getTextField().getText()));
		
		
	}

}
