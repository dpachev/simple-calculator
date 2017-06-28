package com.dip.calc.view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

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
		
		panel = new JPanel(new BorderLayout());
		GridBagConstraints p = new GridBagConstraints();
		
		resultPanel = new JPanel();
		
		JLabel resultTextField = new JLabel("0");
		resultPanel.add(resultTextField);
		
		p.weightx = 0.5;
		p.weighty = 0.5;
		p.gridx = 0;
		p.gridy = 0;
		p.gridwidth = 1;
		
		panel.add(resultPanel, BorderLayout.NORTH);
		
		
		frame.add(panel);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
