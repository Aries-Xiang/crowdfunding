package com.aries.crowdfunding.service.impl;

import com.aries.crowdfunding.entity.Admin;
import com.aries.crowdfunding.entity.AdminExample;
import com.aries.crowdfunding.mapper.AdminMapper;
import com.aries.crowdfunding.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: crowdfunding
 * @description:
 * @author: Aries
 * @create: 2020-04-22 10:51
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void saveAdmin(Admin admin) {

        adminMapper.insert(admin);
    }

    @Override
    public List<Admin> getAll() {
        return adminMapper.selectByExample(new AdminExample());
    }
}
