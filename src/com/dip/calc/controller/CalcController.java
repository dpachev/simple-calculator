package com.dip.calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dip.calc.model.CalcModel;
import com.dip.calc.view.CalcView;

public class CalcController {

	CalcView calcView;
	CalcModel calcModel;
	
	public CalcController(CalcView calcView, CalcModel calcModel) {
		this.calcView = calcView;
		this.calcModel = calcModel;
		
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
		this.calcView.addButtonEqualsListener(new ButtonEqualsListener());
	}
	
	class Button0Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button1Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button3Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button4Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button5Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button6Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button7Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button8Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class Button9Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
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
			
		}
	}
	
	class ButtonMinusListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	class ButtonEqualsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	
}
