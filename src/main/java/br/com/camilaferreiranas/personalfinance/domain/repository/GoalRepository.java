package br.com.camilaferreiranas.personalfinance.domain.repository;

import br.com.camilaferreiranas.personalfinance.domain.model.Goal;
import br.com.camilaferreiranas.personalfinance.domain.model.User;

import java.util.List;
import java.util.UUID;

public interface GoalRepository {

    void save(Goal goal);
    List<Goal> findAllByUser(User user);
    void update(Goal goal);
    void delete(UUID id);
}
