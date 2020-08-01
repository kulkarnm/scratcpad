package product.config.fees;

public abstract class ServiceFee {
    private String feeId;
    private FeeType feeType;
    private double feeValue;
    public abstract double computeFee();
}
