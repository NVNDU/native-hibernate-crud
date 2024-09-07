package com.demo;

import com.demo.entity.Item;
import com.demo.entity.User;
import com.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SaveInstance { // create instance
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction();

            //1.create item instance
            Item item = new Item(1,"peanut-butter",450);

            //var save_id = session.save(item); @Deprecated after 5.x
            //System.out.println(save_id);

            session.persist(item); // 6.x cannot return values

            //2.create user instance
            User user = new User(1L,"Navindu","Galle");
            session.persist(user);

            transaction.commit();
        }
    }
}
