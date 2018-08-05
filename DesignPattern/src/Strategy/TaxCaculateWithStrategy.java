package Strategy;

public class TaxCaculateWithStrategy implements TaxStrategy {

	TaxStrategy tax;
	
	public TaxCaculateWithStrategy(TaxStrategy tax) {
		this.tax=tax;
	}
	
	@Override
	public void Caculate() {
		// TODO Auto-generated method stub
		tax.Caculate();
	}

}
