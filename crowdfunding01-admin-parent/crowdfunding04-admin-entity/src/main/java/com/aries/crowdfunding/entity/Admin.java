package com.aries.crowdfunding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer userId;

    private String userAccount;

    private String userPswd;

    private String userName;

    private String email;

    private String createTime;
}