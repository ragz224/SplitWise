package com.splitwise.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity(name = "UserGroup")
public class Group extends BaseModel{
    private int GroupId;
    private String name;
    @ManyToMany
    private List<User> users;
    @ManyToOne
    private User UserAdmin;
    @OneToMany
    private List<Expense> expenses;


}
