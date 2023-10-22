public class Main {
    public static void main(String[] args) {
        Tenge tenge = new Tenge(23000);
        Dollar dollarAdapter = new ExchangeRateAdapter(tenge);

        System.out.println("Amount in Tenge: " + tenge.getAmount());
        System.out.println("Amount in Dollars: " + dollarAdapter.getAmount());
    }
}