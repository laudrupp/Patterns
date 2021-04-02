package teht15;

public class DiscountAdapterJimms implements DiscountAdapter {
	
	private Product product;
	
	public DiscountAdapterJimms(Product product) {
		this.product = product;
	}

	@Override
	public double getPrice() {
		return product.getPrice()-getDiscount(product.getPrice());
	}
	
	@Override
	public double getDiscount(double price) {
		return price * 0.20;
	}
	
	@Override
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
