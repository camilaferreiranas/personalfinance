package br.com.camilaferreiranas.personalfinance.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Goal {

    private UUID id;
    private String title;
    private String description;
    private BigDecimal value;
    private BigDecimal valueInvested;
    private boolean complete;
    private User user;
    private LocalDate dueDate;

    public Goal() {
    }

    public Goal(UUID id, String title, String description, BigDecimal value, BigDecimal valueInvested, boolean complete, User user, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.value = value;
        this.valueInvested = valueInvested;
        this.complete = complete;
        this.user = user;
        this.dueDate = dueDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValueInvested() {
        return valueInvested;
    }

    public void setValueInvested(BigDecimal valueInvested) {
        this.valueInvested = valueInvested;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
