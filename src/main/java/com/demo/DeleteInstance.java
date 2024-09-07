package com.demo;

import com.demo.entity.Item;
import com.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteInstance {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();) {

            Transaction transaction = session.beginTransaction();

//            Item = session.get(Item.class,1); // or session.find((Item.class,1);
//            session.delete(item); @Deprecated after 5.x

            session.remove(session.get(Item.class, 1));

            transaction.commit();
        }
    }
}
