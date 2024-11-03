package com.dg.mensageria_filas.service;

import com.dg.mensageria_filas.config.ConfigRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoRabbitMQ {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviaMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(ConfigRabbitMQ.NOME_EXCHANGE, "rota.ebac.mensagem", mensagem);
    }
}
