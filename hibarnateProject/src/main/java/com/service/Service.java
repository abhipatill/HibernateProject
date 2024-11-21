package com.service;

import java.io.Serializable;

import com.Dao.DAO;
import com.entit.Candidate;

public class Service {

	public Candidate getCandidate() {
		DAO dao = new DAO();
		Candidate object = dao.getCandidate();
		return object;
	}

	public Serializable insertCandidate() {
		DAO dao = new DAO();
		Serializable s = dao.insertCandidate();
		return s;
	}

	public boolean updateCandidate() {
		DAO dao = new DAO();
		boolean b = dao.UpdateCandidate();
		return b;
	}

	public boolean saveOrUpdateCandidate() {
		DAO dao = new DAO();
		boolean b = dao.SaveOrUpdateCandidate();
		return b;
	}

	public boolean deleteCandidate() {
		DAO dao = new DAO();
		boolean b = dao.DeleteCandidate();
		return b;
	}
}
