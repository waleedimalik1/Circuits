package coe318.lab7;

import java.util.ArrayList;

public class Circuit {
	
	
	ArrayList<Object> finalcircuit;
	private static Circuit instance = null;
	
	public static Circuit getInstance() {
		if (instance == null) {
			instance = new  Circuit();
			}
		return instance;
		}
	
	private Circuit() {
		this.finalcircuit = new ArrayList<Object>();
	}
	public void add(Resistor r) {
		this.finalcircuit.add(r);
	}
	public void add(VoltageSource v) {
		this.finalcircuit.add(v);
	}
	@Override
	public String toString() {
		
		String circuit = new String();
		
		for(int a = 0; a<this.finalcircuit.size(); a++) {
			circuit += this.finalcircuit.get(a).toString() + "\n";
		}
		return (circuit);
	}
}
