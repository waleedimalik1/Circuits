package coe318.lab7;

public class Resistor {
	
	public double resistance;
	public Node node1, node2;
	public int res;
	public static int rescounter = 1;
	
	public Resistor(double resistance, Node node1, Node node2) {
		
		if(resistance < 0) {
			throw new IllegalArgumentException("Resistance can't be negative");
		}
		if (node1 == null || node2 == null) {
			throw new IllegalArgumentException("Both nodes must be existent!");
		}
		if (node1 == node2) {
			throw new IllegalArgumentException("The nodes must be different from each other.");
		}
		
		this.resistance = resistance;
		this.node1 = node1;
		this.node2 = node2;
		this.res = rescounter;
		rescounter++;
	}
	
	public Node[] getNodes() {
		Node[] totalnodes = {node1,node2};
		return totalnodes;
	}

	@Override
	public String toString() {
		return ("R" + res + " " + node1 + " " + node2 + " " + resistance);
	}
}

