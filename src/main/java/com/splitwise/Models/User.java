package com.splitwise.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name= "userIn")
public class User extends BaseModel {

    private String Name;
    private String Email;
    private String Password;
    private String PhoneNum;
}
