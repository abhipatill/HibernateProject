package com.controller;

import java.io.Serializable;
import com.service.Service;
import com.entit.Candidate;

public class Controller {

    private final Service service = new Service();

    public Candidate getCandidate() {
        return service.getCandidate();
    }

    public Serializable insertCandidate() {
        return service.insertCandidate();
    }

    public boolean updateCandidate() {
        return service.updateCandidate();
    }

    public boolean saveOrUpdateCandidate() {
        return service.saveOrUpdateCandidate();
    }

    public boolean deleteCandidate() {
        return service.deleteCandidate();
    }
}
