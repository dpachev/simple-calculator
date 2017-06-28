package com.dip.calc.model;

public class CalcModelTest {

	public static void main(String[] args) {
		CalcModel model = new CalcModel();
		System.out.println(model.getResult());
		
		model.setInput(5);
		System.out.println(model.getResult());
		
		model.setOperator(CalcModel.Operator.PLUS);
		System.out.println(model.getResult());
		
		model.setInput(2);
		System.out.println(model.getResult());
		
		model.setOperator(CalcModel.Operator.PLUS);
		System.out.println(model.getResult());
		
		model.setInput(2);
		System.out.println(model.getResult());
		
		model.setOperator(CalcModel.Operator.PLUS);
		System.out.println(model.getResult());
	}
}
