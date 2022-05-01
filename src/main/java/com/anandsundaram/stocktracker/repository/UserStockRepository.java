package com.anandsundaram.stocktracker.repository;

import com.anandsundaram.stocktracker.model.UserStock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserStockRepository extends MongoRepository<UserStock,Long> {
}
