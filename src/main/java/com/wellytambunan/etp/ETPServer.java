package com.wellytambunan.etp;

import Energistics.Etp.v12.Protocol.Core.RequestSession;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint("/chat/{username}")
@ApplicationScoped
public class ETPServer
{
	private static final Logger LOG = Logger.getLogger(ETPServer.class);

	Map<String, Session> sessions = new ConcurrentHashMap<>();

	@OnOpen
	public void onOpen(Session session, @PathParam("username") String username)
	{
		sessions.put(username, session);
	}

	@OnClose
	public void onClose(Session session, @PathParam("username") String username)
	{
		sessions.remove(username);
	}

	@OnError
	public void onError(Session session, @PathParam("username") String username, Throwable throwable)
	{
		sessions.remove(username);
		LOG.error("onError", throwable);
	}

	@OnMessage
	public void onMessage(Session session, ByteBuffer message)
	{
		System.out.println("Binary message: " + message.remaining());

		RequestSession request = null;
		try
		{
			request = RequestSession.fromByteBuffer(message);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.println(request.getApplicationName());
	}


}