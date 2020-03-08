package coe318.lab7;

public class Node {
	
	private int node;
	private int value;
	private static int nodecounter = 0;
	
	public Node(int counter) {
		this.value = counter;
		this.node = nodecounter;
		nodecounter++;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		return ("" + this.value);
	}
}

