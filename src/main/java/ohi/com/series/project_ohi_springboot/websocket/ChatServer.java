package ohi.com.series.project_ohi_springboot.websocket;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
@ServerEndpoint("/ChatingServer")
public class ChatServer {

    private static Set<Session> clients
            = Collections.synchronizedSet(new HashSet<Session>());

    @OnOpen
    public void onOpen(Session session){



        clients.add(session);
        System.out.println("웹소켓연결 :"+ session.getId());
    }


    @OnMessage
    public void onMessage(String message, Session session) throws IOException{
        System.out.println("메세지전송:"+session.getId()+":"+ message);
        synchronized (clients){

            for(Session client:clients){
                if(!client.equals(session)){
                    client.getBasicRemote().sendText(message);
                }
            }
        }


    }


    @OnClose
    public void onClos(Session session){
        clients.remove(session);
        System.out.println("웹소켓 종료:"+ session.getId());
    }

    @OnError
    public void onError(Throwable e){
        System.out.println("에러!!");
        System.out.println(e);
        e.printStackTrace();
    }
}
*/

@Service
@ServerEndpoint("/websocket")

public class ChatServer {
    private static Set<Session> clients
            = Collections.synchronizedSet(new HashSet<Session>());

    @OnOpen  // 클라이언트 접속 시 실행
    public void onOpen(Session session) {
        clients.add(session);  // 세션 추가
        System.out.println("웹소켓 연결:" + session.getId());
    }

    @OnMessage  // 메시지를 받으면 실행
    public void onMessage(String message, Session session) throws IOException {
        System.out.println("메시지 전송 : " + session.getId() + ":" + message);
        synchronized (clients) {
            for (Session client : clients) {  // 모든 클라이언트에 메시지 전달
                if (!client.equals(session)) {  // 단, 메시지를 보낸 클라이언트는 제외
                    client.getBasicRemote().sendText(message);
                }
            }
        }
    }

    @OnClose  // 클라이언트와의 연결이 끊기면 실행
    public void onClose(Session session) {
        clients.remove(session);
        System.out.println("웹소켓 종료 : " + session.getId());
    }

    @OnError  // 에러 발생 시 실행
    public void onError(Throwable e) {
        System.out.println("에러 발생");
        e.printStackTrace();
    }


}