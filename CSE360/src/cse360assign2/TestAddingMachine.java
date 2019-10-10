package cse360assign2;


public class TestAddingMachine {

	public static void main(String[] args) {
		AddingMachine am = new AddingMachine();
		System.out.print(am.getTotal());
		am.add(10);
		System.out.print(am.toString());
		am.subtract(7);
		System.out.print(am.toString());

	}

}
