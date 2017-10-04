package com.exercises;

public class PE52 {
	private class Inner{

		public Inner() {
			super();
		}
		
	}
	
	private PE52.Inner getInnerobject(){
		PE52.Inner inner = new Inner();
		return inner;
	}
	public static void main(String[] args) {
		PE52 ob = new PE52();
		Inner in = ob.getInnerobject();
		System.out.println(in.getClass());
	}
}
