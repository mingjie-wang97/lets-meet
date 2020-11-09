package com.letsmeet.LetsMeet.bean;

import javax.persistence.*;

@Entity
@Table(name="user_preference")
public class UserPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
