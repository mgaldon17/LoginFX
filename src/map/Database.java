package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Database {
	
	private String user;
	private String pass;
	
	HashMap<String, String> hs = new HashMap<String, String>();
	
	public void add(String user, String pass) {
		
		hs.put(user, pass);
		
		System.out.println("User " + user + " and pass " + pass + " added");
		
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void delete(String user, String pass) {
		
		hs.remove(user, pass);
		
		System.out.println("User " + user + "and pass " + pass + " deleted");

		
	}
	
	public void consultation(String user, String pass) {
		
		if(hs.containsKey(user) && hs.containsValue(pass)){
			
			System.out.println("User and pass exist");
			
		}else{
			
			System.out.println("User not registered");
		}
	}
	
	public void showMap(HashMap<String, String> hs) {
		
		Iterator it = null;
				
		while(it.hasNext()) {

	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println("User" + pair.getKey() + " and pass " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
				
		}
		
	}

}