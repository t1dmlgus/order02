package com.t1dmlgus.orderPilot.domain.user;

import com.t1dmlgus.orderPilot.domain.AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@Table(name = "users")
@NoArgsConstructor
@Entity
public class User extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @Getter
    @RequiredArgsConstructor
    public enum Grade{
        MEMBER("멤버"), ADMIN("관리자");
        private final String description;
    }

    @Builder
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.grade = Grade.MEMBER;
    }
}
