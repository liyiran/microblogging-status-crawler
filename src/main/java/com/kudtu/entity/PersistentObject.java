package com.kudtu.entity;

import com.kudtu.database.dao.Broker;

public abstract class PersistentObject {

    protected abstract long getId();

    private Broker broker = Broker.getInstance("PERSISTENT_OBJECT");

    public void save() {
	if (null == broker.getInstanceById(this.getClass(), getId())) {
	    broker.persist(this);
	} else {
	    broker.merge(this);
	}
    }

    public Broker getBroker() {
	return broker;
    }

    public void setBroker(Broker dao) {
	this.broker = dao;
    }

}
