package com.dip.calc.controller;

import com.dip.calc.model.CalcModel;
import com.dip.calc.view.CalcView;

public class CalcController {

	CalcView calcView;
	CalcModel calcModel;
	
	public CalcController(CalcView calcView, CalcModel calcModel) {
		this.calcView = calcView;
		this.calcModel = calcModel;
	}
	
}
