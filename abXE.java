abstract class Xe{

abstract public void  brake();
}

class xemaythethao extends Xe{

	@Override
	public void brake(){

		System.out.println(" Phanh xe may leo nui chat luong cao");
	}
}

class xemayleonui extends Xe{
	@Override
	public void brake(){

		System.out.println("Phanh xe may leo nui chat luong cao");
	}
}

public class abXE{

public static void main(String[] args) {
	
	xemaythethao xmt = new xemaythethao();
	xmt.brake();

	xemayleonui xmn = new xemayleonui();
	xmn.brake();
	
}
}

