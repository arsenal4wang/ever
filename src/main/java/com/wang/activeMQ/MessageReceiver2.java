package com.wang.activeMQ;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 *
 */

public class MessageReceiver2 {

    // tcp 地址
    public static final String BROKER_URL = "tcp://localhost:61616";
    // 目标，在ActiveMQ管理员控制台创建 http://localhost:8161/admin/queues.jsp
    public static final String DESTINATION = "wang.activeMQ.queue";


    public  static  void  run() throws JMSException {
        Connection connection=null;
        Session session=null;

        ConnectionFactory factory=new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD,BROKER_URL);
        connection=factory.createConnection();
        connection.start();
        session=connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);
        //创建一个消息队列
        Destination destination=session.createQueue(DESTINATION);
        //创建一个消息接受者
        MessageConsumer consumer = session.createConsumer(destination);

        {            //接收数据的等待时间 100ms
            Message  message=consumer.receive(1000*100);
            TextMessage text= (TextMessage) message;
            if (text!=null){
                System.out.println("接收： "+text.getText());
            }else {
                System.out.println("没有消息接收了");

            }
        }
        session.commit();
        //关闭资源
        if (session != null) {
            session.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public static void main(String[] args) throws JMSException {
        MessageReceiver2.run();
    }

}
