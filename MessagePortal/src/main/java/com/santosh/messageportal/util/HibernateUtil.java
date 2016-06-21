package com.santosh.messageportal.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public final class HibernateUtil {
  private static SessionFactory sessionFactory;
  
  public Session getSession(){
	  return sessionFactory.openSession();
  }
}
