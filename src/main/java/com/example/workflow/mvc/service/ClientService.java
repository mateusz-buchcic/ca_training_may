package com.example.workflow.mvc.service;

import com.example.workflow.mvc.entity.Client;
import com.example.workflow.mvc.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private RuntimeService runtimeService;

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.getById(id);
    }

    public void correlateMessage(String messageId) {
        runtimeService.correlateMessage(messageId);
    }

    public void signal(String signalId) {
        runtimeService.signalEventReceived(signalId);
    }

    public Optional<Client> findCientById(Long clientId) {
        return clientRepository.findById(clientId);
    }
}
