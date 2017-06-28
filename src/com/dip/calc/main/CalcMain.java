package com.dip.calc.main;

import com.dip.calc.controller.CalcController;
import com.dip.calc.model.CalcModel;
import com.dip.calc.view.CalcView;

public class CalcMain {

	public static void main(String[] args) {
		
		CalcModel calcModel = new CalcModel();
		CalcView calcView = new CalcView();
		CalcController calcController = new CalcController(calcView, calcModel);
		
		
		
	}
	
}
