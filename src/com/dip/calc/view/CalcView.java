package com.dip.calc.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
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
	
	public CalcView() {
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Main panel
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Result Panel
		resultPanel = new JPanel();
		JLabel resultTextField = new JLabel("0");
		resultPanel.add(resultTextField);
		
		// Input Panel
		inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
		
		// Input Buttons Panel
		inputButtonsPanel = new JPanel();
		inputButtonsPanel.setLayout(new GridLayout(4, 3));
		inputButtonsPanel.add(new Button("7"));
		inputButtonsPanel.add(new Button("8"));
		inputButtonsPanel.add(new Button("9"));
		inputButtonsPanel.add(new Button("4"));
		inputButtonsPanel.add(new Button("5"));
		inputButtonsPanel.add(new Button("6"));
		inputButtonsPanel.add(new Button("1"));
		inputButtonsPanel.add(new Button("2"));
		inputButtonsPanel.add(new Button("3"));
		inputButtonsPanel.add(new Button(""));
		inputButtonsPanel.add(new Button("0"));
		inputButtonsPanel.add(new Button("."));
		
		// Operators Panel
		operatorsPanel = new JPanel();
		operatorsPanel.setLayout(new BoxLayout(operatorsPanel, BoxLayout.Y_AXIS));
		operatorsPanel.add(new Button("+"));
		operatorsPanel.add(new Button("-"));
		operatorsPanel.add(new Button("="));
		
		inputPanel.add(inputButtonsPanel);
		inputPanel.add(operatorsPanel);
		
		panel.add(resultPanel);
		panel.add(inputPanel);
		
		
		frame.add(panel);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
