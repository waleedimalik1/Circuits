package coe318.lab7;

public class VoltageSource {
	
	public double voltage;
	public Node node1, node2;
	public int volts;
	public static int voltcounter = 1;
	
	public VoltageSource(double voltage, Node node1, Node node2) {
		
		if(voltage < 0) {
			throw new IllegalArgumentException("Voltage can't be negative");
		}
		if (node1 == null || node2 == null) {
			throw new IllegalArgumentException("Both nodes must be existent!");
		}
		if (node1.equals(node2)) {
			throw new IllegalArgumentException("The nodes must be different from each other.");
		}
		
		this.voltage = voltage;
		this.node1 = node1;
		this.node2 = node2;
		if (this.node1.getValue() > this.node2.getValue()) {
			this.voltage = -this.voltage;
		}
		this.volts = voltcounter;
		voltcounter++;
	}
	
	public Node[] getNodes() {
		Node[] totalnodes = {node1,node2};
		return totalnodes;
	}
	
	@Override
	public String toString() {
		return ("V" + volts + " " + node1 + " " + node2 + " DC " + voltage);
	}
}

