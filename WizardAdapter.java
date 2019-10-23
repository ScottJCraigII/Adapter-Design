public class WizardAdapter implements Warrior {
	private Wizard wizard;
	
	public TurkeyAdapter(Wizard wizard) {
		this.wizard = wizard;
	}
		public void attack() {
		wizard.performSpell();
	}
	
	public void defend() {
			wizard.heal();
	}
}
