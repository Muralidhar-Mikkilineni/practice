package sample;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;


public class HTTP_Connection {
	private final String USER_AGENT = "dd4bddc68f2d0a5d4cbe621223cfbd31";

	public static void main(String[] args) throws Exception {

		HTTP_Connection http = new HTTP_Connection();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
		BufferedReader br = new BufferedReader(new FileReader("/home/muralidar/Desktop/response"));
		Gson obj = new Gson();
		
		Example c= obj.fromJson(br, Example.class);
		System.out.println(c.getCategories());
		
	}

	// HTTP GET request
	void sendGet() throws Exception {

		String url = "https://developers.zomato.com/api/v2.1/categories";

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
        BufferedWriter writer=new BufferedWriter(new FileWriter("/home/muralidar/Desktop/response"));
        writer.write(st);
        writer.close();
	}
}
