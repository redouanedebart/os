package data.arithmeticaloperation;

import data.variable.Intvariable;
import process.visitor.ArrayListVisitor;

public class Substraction extends Arithmeticaloperation{
	
	/*
	 * @author Nicolas CIBULKA
	 */
	
	// --------------------------------------
	// Attributs
	// --------------------------------------

	// --------------------------------------
	// Methods
	// --------------------------------------
	
	// This is the constructor of the Substraction class
	public Substraction(Intvariable a, Intvariable b, Intvariable result) {
		super(a,b, result);
	}
	

	public <T> T accept(ArrayListVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public String toString() {
		return getA().getContent() + " - " + getB().getContent() + " = " + this.getResult().getContent();
	}
}
