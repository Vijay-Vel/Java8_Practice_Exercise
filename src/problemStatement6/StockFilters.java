package problemStatement6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

	public static List<Stock> bySymbol(List<Stock> list, String symbol) {
        return filter(list, stock -> stock.getSymbol().equals(symbol));
    }

    public static List<Stock> byPriceAbove(List<Stock> list, double price) {
        return filter(list, stock -> stock.getPrice() > price);
    }

    public static List<Stock> filter(List<Stock> list, Predicate<Stock> p) {
        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {
            if (p.test(stock)) {
                filteredData.add(stock);
            }
        }

        return filteredData;
    }
}
