package com.example;

public class UserRepository {

    public String findUser(String userId) {
        String sql = "SELECT * FROM users WHERE id = '" + userId + "'";

        System.out.println("Executing SQL: " + sql);

        return sql;
    }
}
