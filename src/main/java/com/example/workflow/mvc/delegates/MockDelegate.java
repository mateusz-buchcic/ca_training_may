package com.example.workflow.mvc.delegates;


import com.example.workflow.mvc.service.ClientService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockDelegate implements JavaDelegate {

    @Autowired
    RuntimeService runtimeService;

    @Autowired
    ClientService clientService;

    @Override
    public void execute(DelegateExecution delegateExecution) {

        String previousLoanData = "false";
        delegateExecution.setVariable("previousLoanData", previousLoanData);

        //causing incident
        //delegateExecution.getVariable("someNonExistingVariable");

    }
}