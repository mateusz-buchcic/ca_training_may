package com.example.workflow.mvc.delegates;

import com.example.workflow.mvc.service.ClientService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMailToUsers implements JavaDelegate {

    @Autowired
    RuntimeService runtimeService;

    @Autowired
    ClientService clientService;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {


        //delegateExecution.setVariable("clients", clients);


        System.out.println("------------klienci " + delegateExecution.getVariable("client"));
    
    }
}