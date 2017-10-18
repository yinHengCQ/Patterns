package Interpreter.Demo;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	//左右两个表达式相减
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return super.left.interpreter(var)-super.right.interpreter(var);
	}

}
