package com.netcracker.service;

import com.netcracker.dao.IDAO;
import com.netcracker.dao.ShopDAO;
import com.netcracker.model.Shop;
import com.netcracker.service.interfaces.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("shopService")
public class ShopService implements IShopService {

    @Autowired
    @Qualifier("shopDao")
    IDAO dao;

    @Autowired
    ShopDAO shopDAO;


    @Override
    public void add(Shop entity) {
        dao.add(entity);
    }

    @Override
    public List<Shop> findAll() {
        return dao.findAll();
    }

    @Override
    public Shop findById(int id) {
        return (Shop) dao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateById(int id, Shop entity) {
        dao.updateById(id, entity);
    }

    @Override
    public int getRowCount() {
        return dao.getRowCount();
    }

    @Override
    public void showShopNames() {
        shopDAO.showShopNames();
    }

}
