package org.acme.websockets;

import Energistics.Etp.v12.Datatypes.*;
import Energistics.Etp.v12.Protocol.Core.RequestSession;
import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@QuarkusTest
public class ChatTest
{
	@TestHTTPResource("/chat/stu")
	URI uri;

	@Test
	public void testWebsocketChat() throws Exception
	{
		try (Session session = ContainerProvider.getWebSocketContainer().connectToServer(Client.class, uri))
		{
			Thread.sleep(10000);
//			session.getAsyncRemote().sendText("hello world");
		}
	}

	public static Uuid newUuid()
	{
		var uuid = UUID.randomUUID();
		var bb = ByteBuffer.wrap(new byte[16]);
		bb.putLong(uuid.getMostSignificantBits());
		bb.putLong(uuid.getLeastSignificantBits());

		return new Uuid(bb.array());
	}

	@ClientEndpoint
	public static class Client
	{
		@OnOpen
		public void open(Session session)
		{
			var request = new RequestSession(
					"appname",
					"appversion",
					newUuid(),
					List.of(
							new SupportedProtocol(
									1,
									new Version(1, 1, 1, 1),
									"consumer",
									Map.of("prot", new DataValue(1)))),
					List.of(
							new SupportedDataObject(
									"a",
									Map.of("a", new DataValue(1)))),
					List.of("gzip"),
					List.of("binary"),
					1L,
					1L,
					true,
					Map.of("serde", new DataValue("2"))
			);

			try
			{
				session.getAsyncRemote().sendBinary(request.toByteBuffer());
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
