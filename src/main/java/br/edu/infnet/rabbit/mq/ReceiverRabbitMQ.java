package br.edu.infnet.rabbit.mq;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;

@Component
public class ReceiverRabbitMQ {

	 private CountDownLatch latch = new CountDownLatch(1);

	  public void receiveMessage(String message) {
	    System.out.println("Mensagem Recuperada da Fila MQ <" + message + ">");
	    latch.countDown();
	  }

	  public CountDownLatch getLatch() {
	    return latch;
	  }
}
