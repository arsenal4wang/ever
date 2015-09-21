package com.wang.activeMQ;

import com.sun.xml.internal.ws.client.SenderException;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangyg.
 */
public class QueueSenders {
    // 发送次数
    public static final int SEND_NUM = 5;
    // tcp 地址
    public static final String BROKER_URL = "tcp://localhost:61616";
    // 目标，在ActiveMQ管理员控制台创建 http://localhost:8161/admin/queues.jsp
    public static final String DESTINATION = "wang.activeMQ.queue1";



    public static void sendMessage(QueueSession session, QueueSender sender) throws Exception {
        for (int i = 0; i < SEND_NUM; i++) {
            String message = "发送消息第" + (i + 1) + "条";
            MapMessage map = session.createMapMessage();
            map.setString("text", message);
            map.setString("time",  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            System.out.println(message);
            sender.send(map);
        }
    }

    public static void run() throws Exception {
        QueueConnection connection = null;
        QueueSession session = null;
        try {
            // 创建链接工厂
            QueueConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, BROKER_URL);
            // 通过工厂创建一个连接
            connection = factory.createQueueConnection();
            // 启动连接
            connection.start();
            // 创建一个session会话
            session = connection.createQueueSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            // 创建一个消息队列
            Queue queue = session.createQueue(DESTINATION);
            // 创建消息发送者
            QueueSender sender = session.createSender(queue);
            // 设置持久化模式
            sender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            sendMessage(session, sender);
            // 提交会话
            session.commit();

        } catch (Exception e) {
            throw e;
        } finally {
            // 关闭释放资源
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();

            }
        }
    }

    public static void main(String[] args) throws Exception {
        QueueSenders.run();
    }

}
