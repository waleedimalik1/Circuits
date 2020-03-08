package coe318.lab7;

import java.util.*;
public class UserMain {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Circuit circuit = Circuit.getInstance();
		Node node1, node2;
		String kind;
		int n1,n2;
		double value;
			do {
				kind = scan.next().toLowerCase();
				
				if (kind.equals("end")) {
					System.out.println("All Done");
					break;
				}
				else if (kind.equals("spice")) {
					System.out.println(circuit.toString());
				}
				else if (kind.equals("v") || kind.equals("r")) {
					n1 = scan.nextInt();
					n2 = scan.nextInt();
					node1 = new Node(n1);
					node2 = new Node(n2);
					value = scan.nextDouble();
					if (kind.equals("v")) {
						VoltageSource v = new VoltageSource(value, node1, node2);
						circuit.add(v);
					}
					else if (kind.equals("r")) {
						Resistor r = new Resistor(value, node1, node2);
						circuit.add(r);
					}	
				}

			} while (!kind.equals("end"));	
	}
}
