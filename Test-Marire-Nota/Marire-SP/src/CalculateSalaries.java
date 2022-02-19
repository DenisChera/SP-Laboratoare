
public class CalculateSalaries implements Visitor{
	private int devSalaries;
	private int hrSalaries;
	private int mngSalaries;
	
	@Override
	public void salariesDeveloper(Developer dev) {
		// TODO Auto-generated method stub
		devSalaries += dev.getSalariu();
	}

	@Override
	public void salariesHr(HR h) {
		// TODO Auto-generated method stub
		hrSalaries += h.getSalariu();
	}

	@Override
	public void salariesManager(Manager m) {
		// TODO Auto-generated method stub
		mngSalaries += m.getSalariu();
	}

	
	public void printSalaries() {
		System.out.println("Salriu total developeri: " + this.devSalaries);
		System.out.println("Salariu total hr: " + this.hrSalaries);
		System.out.println("Salariu total manageri: " + this.mngSalaries);
		
	}
	
}
