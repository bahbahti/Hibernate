package com.netcracker.dao;

import com.netcracker.model.Customer;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;


@Repository("customerDao")
@Transactional
public class CustomerIDAOImpl extends BasicDAO implements IDAO<Customer>, CustomerDAO {
    @Override
    public void add(Customer entity) {
        persist(entity);
    }

    @Override
    public List<Customer> findAll() {
        Criteria criteria = getSession().createCriteria(Customer.class);
        return criteria.list();
    }

    @Override
    public Customer findById(int id) {
        Criteria criteria = getSession().createCriteria(Customer.class);
        criteria.add(Restrictions.eq("id", id));
        return (Customer) criteria.uniqueResult();
    }

    @Override
    public void deleteById(int id) {
        Query query = getSession().createQuery("delete from Customer where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    @Override
    public void updateById(int id, Customer entity) {
        Query query = getSession().createQuery("update Customer set last_name= :lastname, area=:area, discount=:discount where id=:id");
        query.setString("lastname", entity.getLastName());
        query.setString("area", entity.getArea());
        query.setInteger("discount", entity.getDiscount());
        query.setInteger("id", id);
        query.executeUpdate();
    }

    @Override
    public int getRowCount() {
        return ((Long) getSession().createQuery("select count(*) from Customer").uniqueResult()).intValue();
    }

    @Override
    public void showLastNameAndSale() {
        System.out.println("Last names and discount for pople from Nizhegorodskiy district: ");
        List<Object[]> queryObjects = getSession().createQuery("select lastName, discount from Customer where area = 'Nizhegorodskiy'").list();
        queryObjects.forEach(p -> System.out.println("Last name: " + p[0] + ", discount: " + p[1]));
    }
}
