public class WizardAdapter implements Warrior {
	private Wizard wizard;
	
	public WizardAdapter(Wizard wizard) {
		this.wizard = wizard;
	}
		public void attack() {
		wizard.performSpell();
	}
	
	public void defend() {
			wizard.heal();
	}
}
