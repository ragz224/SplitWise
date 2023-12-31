package com.splitwise.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;
@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private int ExpenseId;
    private String Description;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;
    @ManyToOne
    private User createdBy;

}
