package com.demo;

import com.demo.entity.Item;
import com.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateInstance01 {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction();

            //**update method 01**
            Item ex_item = session.get(Item.class,1); // or session.find(Item.class,1)
            ex_item.setName("vinegar");
            ex_item.setUnitPrice(320);
            session.persist(ex_item);

            transaction.commit();
        }
    }
}
