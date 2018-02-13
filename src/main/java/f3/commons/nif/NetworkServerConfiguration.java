package f3.commons.nif;

import java.net.InetAddress;
import java.nio.ByteOrder;

/**
 * @author n3k0nation
 *
 */
public interface NetworkServerConfiguration {
	int getReadBufferSize();
	void setReadBufferSize(int readBufferSize);
	
	int getWriteBufferSize();
	void setWriteBufferSize(int writeBufferSize);
	
	int getMaxSendPerPass();
	void setMaxSendPerPass(int maxSendPerPass);
	
	long getSelectorSleepTime();
	void setSelectorSleepTime(long selectorSleepTime);
	
	long getInterestDelayTime();
	void setInterestDelayTime(long interestDelayTime);
	
	int getPacketHeaderSize();
	void setPacketHeaderSize(int packetHeaderSize);
	
	int getMaxPacketSize();
	void setMaxPacketSize(int maxPacketSize);
	
	int getSecondaryBufferCount();
	void setSecondaryBufferCount(int secondaryBufferCount);
	
	long getAuthTimeout();
	void setAuthTimeout(long authTimeout);
	
	long getCloseTimeout();
	void setCloseTimeout(long closeTimeout);
	
	int getBacklog();
	void setBacklog(int backlog);
	
	ByteOrder getByteOrder();
	void setByteOrder(ByteOrder byteOrder);
	
	InetAddress getBindAddress();
	void setBindAddress(InetAddress bindAddress);
	
	int getBindPort();
	void setBindPort(int port);
	
	IncomePacketListener getIncomePacketListener();
	void setIncomePacketListener(IncomePacketListener listener);
	
	PacketSerializer getPacketSerializer();
	void setPacketSerializer(PacketSerializer listener);
}
