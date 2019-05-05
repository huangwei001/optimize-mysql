package com.test.service.impl;

import com.test.entity.Menu;
import com.test.mapper.MenuMapper;
import com.test.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public void saveMenu(Menu menu) {
        menuMapper.insert(menu);
    }
}
