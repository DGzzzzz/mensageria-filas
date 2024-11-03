package com.dg.mensageria_filas.consumidor;

import com.dg.mensageria_filas.config.ConfigRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfigRabbitMQ.NOME_FILA)
public class Consumidor {

    @RabbitHandler
    public void ConsumirMensagem(String mensagem) {
        System.out.println("============================ RECEBENDO MENSAGEM ============================");
        System.out.println("============================ " + mensagem + " ============================");
        System.out.println("============================ FIM RECEBENDO MENSAGEM ============================");
    }
}
