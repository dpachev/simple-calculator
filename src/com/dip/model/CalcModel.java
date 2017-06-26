package com.dip.model;

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

	public CalcModel() {
		result = 0;
		input = 0;
		operator = Operator.NONE;
	}

	public int getResult() {
		return result;
	}

	public void setInput(int input) {
		switch (state) {
		case INITIAL: {
			this.input = input;
			state = States.SETINPUT;
			break;
		}
		case SETOPERATION: {
			this.input = input;
			state = States.SETINPUT;
			break;
		}
		case RESULT: {
			this.input = input;
			state = States.SETINPUT;
			break;
		}
		default: {
			break;
		}
		}
	}

	public void setOperator(Operator o) {
		switch (state) {
		case INITIAL: {
			this.operator = o;
			this.state = States.SETOPERATION;
			break;
		}
		case SETOPERATION: {
			this.operator = o;
			this.state = States.SETOPERATION;
			break;
		}
		case SETINPUT: {
			this.result = doOperation(this.result, this.input, operator);
			this.operator = o;
			this.state = States.SETOPERATION;
			break;
		}
		case RESULT: {
			this.operator = o;
			this.state = States.SETOPERATION;
			break;
		}
		default: {
			break;
		}
		}
	}

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
