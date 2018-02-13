package f3.commons.nif;

import java.util.Collection;

import f3.commons.nif.listener.NetworkClientListenerList;

/**
 * @author n3k0nation
 *
 */
public interface NetworkClient {
	int getRuntimeId();
	
	boolean isAuthed();
	void setAuthed(boolean isAuthed);
	
	void closeNow();
	void closeLater();
	
	boolean isConnected();
	
	NetworkCipher getCipher();
	void setCipher(NetworkCipher cipher);
	
	void sendPacket(OutcomeNetworkPacket...packets);
	void sendPacket(Collection<OutcomeNetworkPacket> packets);
	
	NetworkClientListenerList getListeners();
	
}
