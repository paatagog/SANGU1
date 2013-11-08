package kvizhinadze;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddress {
	public static void main(String[] args)throws UnknownHostException {
		InetAddress[] machines = InetAddress.getAllByName("yahoo.com");
		for(InetAddress address : machines){
		  System.out.println(address.getHostAddress());
		}
	}
}
