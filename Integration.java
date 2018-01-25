package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.gson.Gson;

import sample.Outer_class;

public class Integration {
	public static int cuisine_id;

	public static void main(String[] args) throws Exception {
		Input user_input = new Input();
		user_input.input();

		Cuisine_HTTP_Connection http = new Cuisine_HTTP_Connection();
		http.http_Connection();

		Search_HTTP_Connection source_http = new Search_HTTP_Connection();
		source_http.search();

	}

	void match(Outer_class outer_class) throws Exception {
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < outer_class.cuisines.size(); i++) {
			hashMap.put(outer_class.getCuisines().get(i).getCuisine().getCuisine_name(),
					outer_class.getCuisines().get(i).getCuisine().getCuisine_id());
		}

		cuisine_id = hashMap.get(Input.name);

	}

	void restaurants(Level1 level1) {
		Map<String, Float> hashMap = new HashMap<>();
		for (int i = 0; i < level1.restaurants.size(); i++) {
			hashMap.put(level1.getRestaurants().get(i).getRestaurant().getName(), Float
					.parseFloat(level1.getRestaurants().get(i).getRestaurant().getUser_rating().getAggregate_rating()));
		}

		Map<String, Float> tempMap = new HashMap<String, Float>();
		for (String wsState : hashMap.keySet()) {
			tempMap.put(wsState, hashMap.get(wsState));
		}
		int count = 0;
		Set<Map.Entry<String, Float>> mappingSet = tempMap.entrySet();
		for (Map.Entry<String, Float> set : mappingSet) {
			++count;
			System.out.println("name:" + set.getKey() + "     rating:" + set.getValue());
			if (count == 5)
				break;
		}
	}

}
