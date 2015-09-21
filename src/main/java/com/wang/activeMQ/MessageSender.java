package com.wang.activeMQ;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by
 */
public class MessageSender {
    // 发送次数
    public static final int SEND_NUM = 1;
    // tcp 地址
    public static final String BROKER_URL = "tcp://localhost:61616";
    // 目标，在ActiveMQ管理员控制台创建 http://localhost:8161/admin/queues.jsp
    public static final String DESTINATION = "wang.activeMQ.queue";


    public static void sendMessage(Session session, MessageProducer producer) throws JMSException {
        for (int i = 0; i < SEND_NUM; i++) {
            String message = "发送消息第" + (i + 1) + "条";
            TextMessage text = session.createTextMessage(message);
            System.out.println(message);
            producer.send(text);
        }
    }

    public static void run() throws JMSException {
        Connection connection = null;
        Session session = null;

        //创建连接工厂
        ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,BROKER_URL);
        connection = factory.createConnection();
        connection.start();
        session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(DESTINATION);
        MessageProducer producer = session.createProducer(destination);
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
        sendMessage(session, producer);
        session.commit();

        if (session != null) {
            session.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public static void main(String[] args) throws JMSException {
        MessageSender.run();
    }

}
