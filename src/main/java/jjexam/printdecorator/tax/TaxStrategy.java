package jjexam.printdecorator.tax;

public interface TaxStrategy {
    public void calcTax();
    public static TaxStrategy create(String country) {
        return switch (country) {
            case "Ireland" -> new TaxStrategyIreland();
            case "Germany" -> new TaxStrategyGermany();
            case "Uk" -> new TaxStrategyUk();
            default -> new TaxStrategyIreland();
        };
    }
}
