package com.dip.calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dip.calc.model.CalcModel;
import com.dip.calc.model.CalcModel.Operator;
import com.dip.calc.view.CalcView;

public class CalcController {

	CalcView calcView;
	CalcModel calcModel;
	int numDelClicked;
	boolean haveInput;
	
	public CalcController(CalcView calcView, CalcModel calcModel) {
		this.calcView = calcView;
		this.calcModel = calcModel;
		numDelClicked = 0;
		haveInput = false;
		
		this.calcView.addButton0Listener(new Button0Listener());
		this.calcView.addButton1Listener(new Button1Listener());
		this.calcView.addButton2Listener(new Button2Listener());
		this.calcView.addButton3Listener(new Button3Listener());
		this.calcView.addButton4Listener(new Button4Listener());
		this.calcView.addButton5Listener(new Button5Listener());
		this.calcView.addButton6Listener(new Button6Listener());
		this.calcView.addButton7Listener(new Button7Listener());
		this.calcView.addButton8Listener(new Button8Listener());
		this.calcView.addButton9Listener(new Button9Listener());
		this.calcView.addButtonDotListener(new ButtonDotListener());
		this.calcView.addButtonPlusListener(new ButtonPlusListener());
		this.calcView.addButtonMinusListener(new ButtonMinusListener());
		this.calcView.addButtonDelListener(new ButtonDelListener());
		this.calcView.addButtonEqualsListener(new ButtonEqualsListener());
	}
	
	class Button0Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(0);
		}
	}
	
	class Button1Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(1);
		}
	}
	
	class Button2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(2);
		}
	}
	
	class Button3Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(3);
		}
	}
	
	class Button4Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(4);
		}
	}
	
	class Button5Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(5);
		}
	}
	
	class Button6Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(6);
		}
	}
	
	class Button7Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(7);
		}
	}
	
	class Button8Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(8);
		}
	}
	
	class Button9Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputDigit(9);
		}
	}
	
	class ButtonDotListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class ButtonPlusListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			addOperator(Operator.PLUS);
		}
	}
	
	class ButtonMinusListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			addOperator(Operator.MINUS);
		}
	}
	
	class ButtonEqualsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			addOperator(Operator.EQUALS);
		}
	}
	
	class ButtonDelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			calcView.clearScreen();
			numDelClicked++;
			if(numDelClicked >= 2) {
				calcModel.clear();
				numDelClicked = 0;
			}
		}
	}
	
	private void inputDigit(int digit) {
		
		numDelClicked = 0;
		
		if(!haveInput) {
			calcView.setValue(Integer.toString(digit));
			calcModel.setInput(digit);
			haveInput = true;
			return;
		}
		
		if(calcView.getValue().length() >= 8) {
			return;
		}
		
		haveInput = true;
		
		if(calcView.getValue().equals("0")) {
			calcView.setValue(Integer.toString(digit));
		} else {
			calcView.setValue(calcView.getValue() + Integer.toString(digit));
		}
		
		calcModel.setInput(Integer.parseInt(calcView.getValue()));
		
	}
	
	private void addOperator(Operator op) {
		calcModel.setOperator(op);
		calcView.setValue(Integer.toString(calcModel.getResult()));
		haveInput = false;
	}
	
}
