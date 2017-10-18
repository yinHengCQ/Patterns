package Interpreter.Demo;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	//把左右两个表达式运算的结果加起来
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return super.left.interpreter(var)+super.right.interpreter(var);
	}

}
