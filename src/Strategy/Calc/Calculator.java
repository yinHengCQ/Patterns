package Strategy.Calc;

public enum Calculator {

	ADD("+"){

		@Override
		public int exec(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
		
	},
	SUB("-"){

		@Override
		public int exec(int a, int b) {
			// TODO Auto-generated method stub
			return a-b;
		}
		
	};
	String value="";
	
	private Calculator(String _value){
		this.value=_value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public abstract int exec(int a ,int b);
}
