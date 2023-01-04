package heritage;

public class Moto extends Vehicule {
	private int cylindree;
	
	public Moto() {
		super();
	}

	public Moto(String modele, String marque, String immat, int cylindree) {
		super(modele, marque, immat);
		this.cylindree = cylindree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getCylindree() {
		return cylindree;
	}

	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + "cylindree= " + cylindree;
}

@Override
public void rouler() {
	System.out.println("je rouler avec une moto");
}


}
