// This is the one handling the core business logic
package org.abhinay.stockpulse.service;

import org.abhinay.stockpulse.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class stockService {
    private final StockRepository stockRepository;

    public stockService(stockRepository)
    {
        this.stockRepository =  StockRepository();
    }

}
