package app.bridgepattern;

/**
 * BigWheel
 */
public class BigWheel extends Car {

    private final Product product;
    private final String carType;

    public BigWheel(Product product, String carType) {
        super(product, carType);
        this.carType = carType;
        this.product = product;
    }

    @Override
    public void assemble() {
        System.out.println(String.format("Assembling %s for %s", product.productName(), carType));

    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println(String.format("Modifying Product %s according to %s", product.productName(), carType));
    }
}