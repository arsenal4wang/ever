package com.wang.activeMQ;

import com.wang.spring.basic.User;
import org.apache.xbean.spring.context.FileSystemXmlApplicationContext;
import org.hibernate.annotations.SourceType;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangyg.
 */
public class SpringSender {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("spring_application.xml");
        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                MapMessage message = session.createMapMessage();
                message.setString("message", "current system time is: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                System.out.println(message);
                return message;
            }
        });
    }
}
