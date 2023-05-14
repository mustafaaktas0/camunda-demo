package com.example.demo.delegate;

import com.example.demo.service.LeaveService;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Slf4j
@Named(value = "initiateDelegate")
public class InitiateLeaveDelegate implements JavaDelegate {


    private final LeaveService leaveService;

    @Autowired
    public InitiateLeaveDelegate(LeaveService leaveService) {
        this.leaveService = leaveService;
    }


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        delegateExecution.setVariable("userManager","MUSTAFAAKTAS");
        log.info("initiate leave on delegate");
        leaveService.initLeave();
    }
}
