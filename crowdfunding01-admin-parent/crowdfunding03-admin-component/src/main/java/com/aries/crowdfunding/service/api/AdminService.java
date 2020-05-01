package com.aries.crowdfunding.service.api;

import com.aries.crowdfunding.entity.Admin;

import java.util.List;

public interface AdminService {

    void saveAdmin(Admin admin);

    List<Admin> getAll();
}
