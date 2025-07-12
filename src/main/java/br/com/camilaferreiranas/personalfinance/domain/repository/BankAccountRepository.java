package br.com.camilaferreiranas.personalfinance.domain.repository;

import br.com.camilaferreiranas.personalfinance.domain.model.BankAccount;
import br.com.camilaferreiranas.personalfinance.domain.model.User;

import java.util.List;

public interface BankAccountRepository {

    void save(BankAccount bankAccount);
    BankAccount findByAccount(Long account);
    List<BankAccount> findByUser(User user);

}
