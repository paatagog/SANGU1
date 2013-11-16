package kvizhinadze;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressChecker {
	public boolean isMatch (String domainName, String ipAdd)throws UnknownHostException {
		InetAddress[] machines = InetAddress.getAllByName(domainName);
		for(InetAddress address : machines){
		  if (address.equals(ipAdd)) {
			  return true;
		  }
		}
		return false;
	}
}
