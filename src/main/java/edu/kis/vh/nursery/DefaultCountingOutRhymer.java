package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private  final int SIZE =12;
	private final int SIZE2=11;
	private int[] numbers = new int[SIZE];

	private final int EXPECTED=-1;
	private int total = EXPECTED;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EXPECTED;
	}

	public boolean isFull() {
		return total == SIZE2;
	}

	protected int peekaboo() {
		if (callCheck())
			return EXPECTED;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EXPECTED;
		return numbers[total--];
	}

}
