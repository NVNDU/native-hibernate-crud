package com.demo;

import com.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer { //check session
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();){

            System.out.println("---------------------");
            System.out.println("session :"+session);
            System.out.println("---------------------");

        }
    }
}
