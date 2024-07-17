package util;

public class CurrencyConverter
{
    public static double toReais(double dollarPrice, double dollarQuantity)
    {
        return (dollarPrice * dollarQuantity) * (1 + 6.0 / 100);
    }
}
