package com.demo;

import com.demo.entity.Item;
import com.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GetInstance{ //read instance
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction();

            Item item = session.get(Item.class,1); // or session.find((Item.class,1);
            System.out.println(item);
            System.out.println("id :"+item.getId());
            System.out.println("name : "+item.getName());
            System.out.println("price : "+item.getUnitPrice());

            transaction.commit();
        }
    }
}
