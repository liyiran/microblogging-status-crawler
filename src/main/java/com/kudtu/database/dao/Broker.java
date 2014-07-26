package com.kudtu.database.dao;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.kudtu.entity.PersistentObject;

public class Broker {

    private String connName = "DEFAULT";
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Status");
    private EntityManager em = emf.createEntityManager();
    private static HashMap<String, Broker> brokerPool = new HashMap<String, Broker>();

    public static Broker getInstance() {
	return getInstance("DEFAULT");
    }

    public static Broker getInstance(String connName) {
	if (null == brokerPool.get(connName)) {
	    Broker broker = new Broker(connName);
	    brokerPool.put(connName, broker);
	}
	return brokerPool.get(connName);
    }

    private Broker(String connName) {
	this.connName = "connName";
    }

    public String getConnName() {
	return connName;
    }

    public void setConnName(String connName) {
	this.connName = connName;
    }

    public <T> T getInstanceById(Class<T> type, Serializable id) {
	return em.find(type, id);
    }

    public void persist(PersistentObject object) {
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(object);
	tx.commit();
    }

    public void merge(PersistentObject object) {
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.merge(object);
	tx.commit();
    }
}
