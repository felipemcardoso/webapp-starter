package dev.felipemcardoso.webstarter.controller;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/notification")
public class WebSocketController {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println(session.getId());
    }

    @OnMessage
    public String onMessage(String message) {
        System.out.println(message);

        return message + " received";
    }
}
