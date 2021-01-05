package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int ENDVALUE=12;
	private final int EXPECTED=11;
	private int[] numbers = new int[ENDVALUE];

	private final int EXPECTEDVALUE=-1;
	private int total = EXPECTEDVALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EXPECTEDVALUE;
	}

	public boolean isFull() {
		return total == EXPECTED;
	}

	protected int peekaboo() {
		if (callCheck())
			return EXPECTEDVALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EXPECTEDVALUE;
		return numbers[total--];
	}

}
