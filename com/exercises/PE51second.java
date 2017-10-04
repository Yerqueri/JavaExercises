package com.exercises;


public class PE51second {
	private class Inner{
		String s;
		public Inner() {
			super();
			PE51 ob = new PE51("hello");
			s =ob.string;
		}
			
	}
	private PE51second.Inner getInnerobject(){
		PE51second.Inner inner = new Inner();
		return inner;
	}
	
	public static void main(String[] args) {
		PE51second ob = new PE51second();
		Inner in = ob.getInnerobject();
		System.out.println(in.s);
	}
}
