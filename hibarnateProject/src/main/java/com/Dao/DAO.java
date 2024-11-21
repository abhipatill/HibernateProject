package com.Dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entit.Candidate;

public class DAO {

	public Candidate getCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Candidate object = session.load(Candidate.class, 1);

		return object;

	}

	public Serializable insertCandidate() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session Session = factory.openSession();

		Transaction tx = Session.beginTransaction();
		Candidate c1 = new Candidate(20, "Devendra", "nagpur", "bjp", "maharashtra", "male", 55);
		Serializable s = Session.save(c1);
		tx.commit();
		Session.close();
		return s;

	}

	public boolean UpdateCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session Session = factory.openSession();

		Transaction tx = Session.beginTransaction();
		Candidate c1 = new Candidate(20, "Nitin", "nagpur", "bjp", "maharashtra", "male", 55);
		Session.update(c1);
		tx.commit();

		boolean b = true;

		return b;

	}

	public boolean SaveOrUpdateCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session Session = factory.openSession();

		Transaction tx = Session.beginTransaction();
		Candidate c1 = new Candidate(20, "Devendra", "nagpur", "bjp", "maharashtra", "male", 55);
		Session.saveOrUpdate(c1);
		tx.commit();
		boolean b = true;
		return b;

	}

	public boolean DeleteCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session Session = factory.openSession();

		Transaction tx = Session.beginTransaction();
		Candidate c1 = new Candidate();
		c1.setId(20);
		Session.delete(c1);
		tx.commit();
		boolean b = true;

		return b;

	}

	
}
