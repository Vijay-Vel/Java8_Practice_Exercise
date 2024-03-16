package problemStatement6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("AAPL", 318.65, 10.0));
        stocks.add(new Stock("MSFT", 160.86, 45.01));
        stocks.add(new Stock("Google", 99.0, 12.5));
        stocks.add(new Stock("AMZ", 1866.74, 45.0));
        stocks.add(new Stock("600GL", 1480.2, 3.5));
        stocks.add(new Stock("AAPL", 318.65, 8.0));
        stocks.add(new Stock("AMZ", 1866.74, 9.0));

        // Print all stocks using forEach and Method Reference
        System.out.println("-------------------Print all the Stock Details----------------------");
        stocks.forEach(System.out::println);
        System.out.println("\n");

        // Print stocks with symbol "AMZ"
        System.out.println("-------------------Symbol is equals to AMZ----------------------");
        List<Stock> filteredBySymbolAMZ = StockFilters.bySymbol(stocks, "AMZ");
        filteredBySymbolAMZ.forEach(System.out::println);
        System.out.println("\n");

        // Print stocks with price above 300
        System.out.println("-------------------Price is above 300----------------------");
        List<Stock> filteredByPriceAbove300 = StockFilters.byPriceAbove(stocks, 300);
        filteredByPriceAbove300.forEach(System.out::println);
    }

}
