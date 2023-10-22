public class ExchangeRateAdapter implements Dollar {
    private Tenge tenge;
    public ExchangeRateAdapter(Tenge tenge) {
        this.tenge = tenge;
    }
    @Override
    public double getAmount() {
        return tenge.getAmount() / 450;
    }
}
