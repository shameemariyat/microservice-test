package com.zafin.accounts.model;

import javax.persistence.*;

@Entity
@Table(name = "T_ACCOUNT")
public class Account {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "account_number")
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "test1",
            initialValue = 101
    )
    private Long id;

    @Column(name = "name")
    private String name;
}
