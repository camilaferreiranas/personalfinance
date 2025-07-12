package br.com.camilaferreiranas.personalfinance.domain.repository;

import br.com.camilaferreiranas.personalfinance.domain.model.Category;
import br.com.camilaferreiranas.personalfinance.domain.model.User;

import java.util.List;
import java.util.UUID;

public interface CategoryRepository {

    void save(Category category);
    Category findById(UUID id);
    List<Category> findAllByUser(User user);
}
