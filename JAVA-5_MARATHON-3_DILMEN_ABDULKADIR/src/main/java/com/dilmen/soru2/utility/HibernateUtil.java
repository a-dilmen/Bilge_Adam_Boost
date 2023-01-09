package com.dilmen.soru2.utility;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.dilmen.soru2.entity.Musteri;
import com.dilmen.soru2.entity.Siparis;
import com.dilmen.soru2.entity.SiparisKalemi;
import com.dilmen.soru2.entity.Urun;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/productdb");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "postgres");

				settings.put(Environment.HBM2DDL_AUTO, "create"); 

//				settings.put(Environment.SHOW_SQL, "true"); 
//				settings.put(Environment.FORMAT_SQL, "true");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Musteri.class);
				configuration.addAnnotatedClass(Urun.class);
				configuration.addAnnotatedClass(Siparis.class);
				configuration.addAnnotatedClass(SiparisKalemi.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("hibernate hatası session factory step");
			}
		}
		return sessionFactory;
	}

}
