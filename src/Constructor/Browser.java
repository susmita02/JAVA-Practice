package Constructor;

import java.util.ArrayList;

public class Browser {
	
	
    String	browserName;
	String vendorName;
	Double currentVersion;
	ArrayList<String> plugin;

	public static void main(String[] args) {
		
		ArrayList<String> plugin = new ArrayList<String>();
		plugin.add("Chrome");
		plugin.add("Firefox");
		plugin.add("IE");
		plugin.add("Safari");
		plugin.add("Mac");
			
		new Browser("Chrome","Google",80.2);
		new Browser(plugin);

	}


//	2. Design a browser class template with the following features:
//	 variables:
//	browserName
//	vendorName
//	currentVersion
	
	public Browser(String browserName, String vendorName, Double currentVersion) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		System.out.println("The browser name is " +browserName+ ", "+"Vendor name is " +vendorName +" ,"+ "Browser version is " +currentVersion);
	}


//	List of plugins supported by Browser in Array List<String>
	

public Browser(ArrayList<String> plugin) {
		
		this.plugin = plugin;
		System.out.println("List of Plugins are : "+plugin);
	}


}
