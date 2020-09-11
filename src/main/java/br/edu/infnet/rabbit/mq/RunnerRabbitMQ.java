package br.edu.infnet.rabbit.mq;

//import java.util.concurrent.TimeUnit;

//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerRabbitMQ implements CommandLineRunner{

	
	//private @Autowired RabbitTemplate rabbitTemplate;
	
	
	//private @Autowired ReceiverRabbitMQ receiver;

	/*
	  public void RunnerRabbitMQ(ReceiverRabbitMQ receiver, RabbitTemplate rabbitTemplate) {
	    this.receiver = receiver;
	    this.rabbitTemplate = rabbitTemplate;
	  }
	  */
	
	// Runner para Teste LOCAL
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending message...");
	    //rabbitTemplate.convertAndSend(ProducesQueueRabbitMqApplication.topicExchangeName, "foo.bar.baz", "MSG 8 from RabbitMQ!");
	    //receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
		
	}


	

	
}
