package com.demo;

import com.demo.entity.Item;
import com.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateInstance02 {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction();

            //**update method 02**
            Item updated_item = new Item(1,"Rice",200);
            //session.merge(updated_item);

            Item newItem = session.merge(updated_item);
            System.out.println("updated item: "+newItem);
            System.out.println("name: "+newItem.getName());
            System.out.println("price: "+newItem.getUnitPrice());

            transaction.commit();
        }
    }
}
