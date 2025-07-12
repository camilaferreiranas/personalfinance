package br.com.camilaferreiranas.personalfinance.domain.repository;

import br.com.camilaferreiranas.personalfinance.domain.enums.TransactionalCategoryEnum;
import br.com.camilaferreiranas.personalfinance.domain.enums.TransactionalTypeEnum;
import br.com.camilaferreiranas.personalfinance.domain.model.Transaction;
import br.com.camilaferreiranas.personalfinance.domain.model.User;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface TransactionRepository {

    void save(Transaction transaction);
    List<Transaction> findAllByUser(User user);
    List<Transaction> findByFilter(LocalDate date, TransactionalTypeEnum type, TransactionalCategoryEnum category);
    Transaction findById(UUID id);
    void update(Transaction transaction);
    void delete(UUID id);
}
