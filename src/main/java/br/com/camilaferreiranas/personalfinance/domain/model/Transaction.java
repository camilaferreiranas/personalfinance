package br.com.camilaferreiranas.personalfinance.domain.model;

import br.com.camilaferreiranas.personalfinance.domain.enums.TransactionalCategoryEnum;
import br.com.camilaferreiranas.personalfinance.domain.enums.TransactionalTypeEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {

    private UUID id;
    private BigDecimal value;
    private LocalDateTime createdAt;
    private TransactionalCategoryEnum category;
    private TransactionalTypeEnum type;
    private User user;

    public Transaction() {
    }

    public Transaction(UUID id, BigDecimal value, LocalDateTime createdAt, TransactionalCategoryEnum category, TransactionalTypeEnum type, User user) {
        this.id = id;
        this.value = value;
        this.createdAt = createdAt;
        this.category = category;
        this.type = type;
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public TransactionalCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(TransactionalCategoryEnum category) {
        this.category = category;
    }

    public TransactionalTypeEnum getType() {
        return type;
    }

    public void setType(TransactionalTypeEnum type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
