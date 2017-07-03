package com.dip.calc.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalcView {

	private JFrame frame;
	private JPanel panel;
	
	private JPanel resultPanel;
	
	private JPanel inputPanel;
	private JPanel inputButtonsPanel;
	private JPanel operatorsPanel;
	private JLabel resultTextField;
	
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonDot;
	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonEquals;
	
	
	public CalcView() {
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Main panel
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Result Panel
		resultPanel = new JPanel();
		resultTextField = new JLabel("0");
		resultPanel.add(resultTextField);
		
		// Input Panel
		inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
		
		// Input Buttons Panel
		inputButtonsPanel = new JPanel();
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonDot = new JButton(".");
		buttonPlus = new JButton("+");
		buttonMinus = new JButton("-");
		buttonEquals= new JButton("=");
		
		inputButtonsPanel.setLayout(new GridLayout(4, 3));
		inputButtonsPanel.add(button7);
		inputButtonsPanel.add(button8);
		inputButtonsPanel.add(button9);
		inputButtonsPanel.add(button4);
		inputButtonsPanel.add(button5);
		inputButtonsPanel.add(button6);
		inputButtonsPanel.add(button1);
		inputButtonsPanel.add(button2);
		inputButtonsPanel.add(button3);
		inputButtonsPanel.add(new JButton(""));
		inputButtonsPanel.add(button0);
		inputButtonsPanel.add(buttonDot);
		
		// Operators Panel
		operatorsPanel = new JPanel();
		operatorsPanel.setLayout(new BoxLayout(operatorsPanel, BoxLayout.Y_AXIS));
		operatorsPanel.add(buttonPlus);
		operatorsPanel.add(buttonMinus);
		operatorsPanel.add(buttonEquals);
		
		inputPanel.add(inputButtonsPanel);
		inputPanel.add(operatorsPanel);
		
		panel.add(resultPanel);
		panel.add(inputPanel);
		
		
		frame.add(panel);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void addButton0Listener(ActionListener actionListener) {
		button0.addActionListener(actionListener);
	}
	
	public void addButton1Listener(ActionListener actionListener) {
		button1.addActionListener(actionListener);
	}
	
	public void addButton2Listener(ActionListener actionListener) {
		button2.addActionListener(actionListener);
	}
	
	public void addButton3Listener(ActionListener actionListener) {
		button3.addActionListener(actionListener);
	}
	
	public void addButton4Listener(ActionListener actionListener) {
		button4.addActionListener(actionListener);
	}
	
	public void addButton5Listener(ActionListener actionListener) {
		button5.addActionListener(actionListener);
	}
	
	public void addButton6Listener(ActionListener actionListener) {
		button6.addActionListener(actionListener);
	}
	
	public void addButton7Listener(ActionListener actionListener) {
		button7.addActionListener(actionListener);
	}
	
	public void addButton8Listener(ActionListener actionListener) {
		button8.addActionListener(actionListener);
	}
	
	public void addButton9Listener(ActionListener actionListener) {
		button9.addActionListener(actionListener);
	}
	
	public void addButtonDotListener(ActionListener actionListener) {
		buttonDot.addActionListener(actionListener);
	}
	
	public void addButtonPlusListener(ActionListener actionListener) {
		buttonPlus.addActionListener(actionListener);
	}
	
	public void addButtonMinusListener(ActionListener actionListener) {
		buttonMinus.addActionListener(actionListener);
	}
	
	public void addButtonEqualsListener(ActionListener actionListener) {
		buttonEquals.addActionListener(actionListener);
	}
	
	public void addDigitToValue(int digit) {
		resultTextField.setText(resultTextField.getText() + Integer.toString(digit));
	}
	
	public void setValue(String value) {
		resultTextField.setText(value);
	}
	
	public String getValue() {
		return resultTextField.getText();
	}
	
	public void clearScreen() {
		resultTextField.setText("0");
	}
	
}
