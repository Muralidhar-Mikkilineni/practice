package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import sample.Outer_class;

public class Cuisine_HTTP_Connection {
	private final String USER_AGENT = "dd4bddc68f2d0a5d4cbe621223cfbd31";
	public static void http_Connection() throws Exception {

		Cuisine_HTTP_Connection http = new Cuisine_HTTP_Connection();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
		BufferedReader br = new BufferedReader(new FileReader("/home/muralidar/Desktop/cuisine"));
		Gson obj = new Gson();
		Outer_class outer_class=obj.fromJson(br, Outer_class.class);
		
		Integration integrate=new Integration();
		integrate.match(outer_class);
    }

	// HTTP GET request
	private void sendGet() throws Exception {

		String url = "https://developers.zomato.com/api/v2.1/cuisines?city_id=4";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("user-key", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

	 	while ((inputLine = in.readLine()) != null) {
	 		response.append(inputLine);
	 	}
	 	in.close();
        String st=response.toString();
        BufferedWriter writer=new BufferedWriter(new FileWriter("/home/muralidar/Desktop/cuisine"));
        writer.write(st);
        writer.close();
	}
}
