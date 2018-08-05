package Strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

	@Test
	public void TaxCaculateWithoutStrategyTest() {
		SalesOrder so=new SalesOrder(Tax.Tax_CN);
		so.Caculate();
	}
	
	@Test
	public void TaxCaculateWithStrategyTest() {
		TaxStrategy ts=new USTax();
		TaxCaculateWithStrategy tc=new TaxCaculateWithStrategy(ts);
		tc.Caculate();
	}
	
	@Test//升级了需求之后
	public void TaxCaculateWithStrategyTest2() {
		TaxStrategy ts=new JPTax();
		TaxCaculateWithStrategy tc=new TaxCaculateWithStrategy(ts);
		tc.Caculate();
	}
	
}
