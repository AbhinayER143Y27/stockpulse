//Business between the business logic and the database
package org.abhinay.stockpulse.repository;

import org.abhinay.stockpulse.model.Stock;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StockRepository {

    private final List<Stock> stocks = new ArrayList<>();

    public StockRepository() {
        stocks.add(new Stock(1, "Tata Consultancy Services", 3900.50, "TCS"));
        stocks.add(new Stock(2,"Infosys", 1500.25, "INFY"));
    }

    public List<Stock> findAll()
    {
        return stocks;
    }

    public Optional<Stock> findBySymbol(String symbol)
    {
        return stocks.stream()
                .filter(s->s.getSymbol().equalsIgnoreCase(symbol))
                .findFirst();
    }

}
