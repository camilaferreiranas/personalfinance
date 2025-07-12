package br.com.camilaferreiranas.personalfinance.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

public class BankAccount {

    private UUID id;
    private Long agency;
    private Long account;
    private BigDecimal value;
    private User user;

    public BankAccount() {
    }

    public BankAccount(UUID id, Long agency, Long account, BigDecimal value, User user) {
        this.id = id;
        this.agency = agency;
        this.account = account;
        this.value = value;
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getAgency() {
        return agency;
    }

    public void setAgency(Long agency) {
        this.agency = agency;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
