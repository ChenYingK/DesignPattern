package Strategy;


//未使用策略模式
public class TaxCaculateWithoutStrategy {
	
}

enum Tax {
	Tax_CN, Tax_US, Tax_FR
}

class SalesOrder{
	private Tax tax;
	
	SalesOrder(Tax tax){
		this.tax=tax;
	}
	
	
	public void Caculate() {
		if(tax==Tax.Tax_CN) {
			System.out.println("Tax_CN ");
		}else if(tax==Tax.Tax_US) {
			System.out.println("Tax_US ");
		}else if(tax==Tax.Tax_FR) {
			System.out.println("Tax_FR");
		}
	}
}


