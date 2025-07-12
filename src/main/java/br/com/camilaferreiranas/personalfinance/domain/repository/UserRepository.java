package br.com.camilaferreiranas.personalfinance.domain.repository;

import br.com.camilaferreiranas.personalfinance.domain.model.User;

import java.util.UUID;

public interface UserRepository {

    void save(User user);
    void update(User user);
    User findByEmail(String email);
    User findById(UUID id);
}
