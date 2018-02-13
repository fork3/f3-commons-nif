/*
 * Copyright (c) 2010-2018 fork2
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR 
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package f3.commons.nif.listener;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import f3.commons.listener.ListenerList;
import f3.commons.listener.event.Listener;
import f3.commons.listener.executors.EventSingleExecutor;
import f3.commons.nif.NetworkClient;
import f3.commons.nif.listener.events.INetworkClientOnCloseConnection;
import f3.commons.nif.listener.events.INetworkClientOnDisconnect;

/**
 * @author n3k0nation
 *
 */
public class NetworkClientListenerList extends ListenerList<NetworkClient> {

	private final static Set<Listener<NetworkClient>> global = new CopyOnWriteArraySet<>();
	
	public NetworkClientListenerList(NetworkClient owner) {
		super(owner, new EventSingleExecutor<>(), new CopyOnWriteArraySet<>());
	}
	
	public static void addGlobal(Listener<NetworkClient> listener) {
		global.add(listener);
	}

	public static void removeGlobal(Listener<NetworkClient> listener) {
		global.remove(listener);
	}
	
	public void onCloseConnection() {
		callEvent(INetworkClientOnCloseConnection.class, l -> l.onCloseConnection(getOwner()));
	}
	
	public void onDisconnect() {
		callEvent(INetworkClientOnDisconnect.class, l -> l.onDisconnect(getOwner()));
	}
}
