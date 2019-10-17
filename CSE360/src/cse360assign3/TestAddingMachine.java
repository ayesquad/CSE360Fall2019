package cse360assign3;


public class TestAddingMachine {

	public static void main(String[] args) {
		Calculator am = new Calculator();
//		System.out.print(am.getTotal());
		am.add(10);
//		System.out.print(am.toString());
		am.subtract(7);
//		System.out.print(am.toString());
//		am.clear();
//		System.out.print("\n" + am.getTotal());
		am.mult(10);
//		System.out.print(am.toString());
		am.div(5);
//		System.out.print(am.toString());
		am.power(2);
		System.out.print(am.toString());
		System.out.print("\n" + am.getTotal());

	}

}
