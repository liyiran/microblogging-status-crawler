/**********************************************************************
Copyright (c) 2006 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
 **********************************************************************/
package com.kudtu.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.datanucleus.util.NucleusLogger;

import com.kudtu.entity.Status;
import com.kudtu.entity.User;

/**
 * Controlling application for the DataNucleus Tutorial using JPA. Uses the
 * "persistence-unit" called "Tutorial".
 */
public class PersistTest {
    public static void main(String args[]) {
	// Create an EntityManagerFactory for this "persistence-unit"
	// See the file "META-INF/persistence.xml"
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Status");
	System.out.println("=============================");

	// Persistence of a Product and a Book.
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	try {
	    tx.begin();

	    User user = new User(2, "test_user88", 11, 22, 33, 44, true, "test descrpiton88", "http://88", new Date());
	    Status status = new Status(2, 1, 2, 3, "status 1", 1, 1, 0, 0, new Date(), 1);
	    user.save();
	    status.save();
	    tx.commit();
	    System.out.println("User and Status have been persisted");

	} catch (Exception e) {
	    NucleusLogger.GENERAL.error(">> Exception persisting data", e);
	    System.err.println("Error persisting data : " + e.getMessage());
	    return;
	} finally {
	    if (tx.isActive()) {
		tx.rollback();
	    }
	    em.close();
	}
	emf.getCache().evictAll();
	System.out.println("End");
	emf.close();
    }
}