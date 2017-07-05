package com.dip.calc.model;

public class CalcModel {

	private int result;
	private int input;

	public enum Operator {
		PLUS, MINUS, EQUALS, NONE, MULTI, DIV
	};

	private enum States {
		INITIAL, SETOPERATION, SETINPUT, RESULT 
	};
	
	private States state = States.INITIAL;

	private Operator operator;
	
	boolean haveInput;

	public CalcModel() {
		clear();
	}

	public int getResult() {
		return result;
	}
	
	public void clear() {
		result = 0;
		input = 0;
		operator = Operator.PLUS;
		haveInput = false;
	}

	
	public void setInput(int input) {
		this.input = input;
		haveInput = true;
	}
	
	public void setOperator(Operator op) {
		if(haveInput) {
			result = doOperation(result, input, operator);
		}
		operator = op;
		haveInput = false;
	}
	
	public int equals() {
		result = doOperation(result, input, operator);
		return result;
	}
	
//	public void setInput(int input) {
//		switch (state) {
//		case INITIAL: {
//			this.input = input;
//			state = States.SETINPUT;
//			break;
//		}
//		case SETOPERATION: {
//			this.input = input;
//			state = States.SETINPUT;
//			break;
//		}
//		case RESULT: {
//			this.input = input;
//			state = States.SETINPUT;
//			break;
//		}
//		default: {
//			break;
//		}
//		}
//	}

//	public void setOperator(Operator o) {
//		switch (state) {
//		case INITIAL: {
//			this.operator = o;
//			this.state = States.SETOPERATION;
//			break;
//		}
//		case SETOPERATION: {
//			this.operator = o;
//			this.state = States.SETOPERATION;
//			break;
//		}
//		case SETINPUT: {
//			this.result = doOperation(this.result, this.input, operator);
//			this.operator = o;
//			this.state = States.SETOPERATION;
//			break;
//		}
//		case RESULT: {
//			this.operator = o;
//			this.state = States.SETOPERATION;
//			break;
//		}
//		default: {
//			break;
//		}
//		}
//	}

	private int doOperation(int val1, int val2, Operator operator) {
		switch (operator) {
		case PLUS: {
			return val1 + val2;
		}
		case MINUS: {
			return val1 - val2;
		}
		case MULTI: {
			return val1 * val2;
		}
		case DIV: {
			return val1 / val2;
		}
		default: {
			return 0;
		}
		}
	}

}
