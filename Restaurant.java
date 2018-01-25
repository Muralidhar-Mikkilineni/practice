package sample;

public class Restaurant 
{
	private R R;

	public R getR() {
	return R;
	}

	public void setR(R r) {
	R=r;
	}
	private String apiKey;
	 private int id;
	 private String name;
	 private String url;
	 
	 private Location location;
		public Location getLocation() {
			return location;
			}

			public void setLocation(Location location) {
			this.location = location;
			}
			
	 private int switch_to_order_menu;
	 private String cuisines;
	 private int average_cost_for_two;
	 private int price_range;
	 private String currency;
	 
	 private User_rating user_rating;
		public User_rating getUser_rating() {
			return user_rating;
			}

			public void setUser_rating(User_rating user_rating) {
			this.user_rating = user_rating;
			}
			
	 private String photos_url;
	 private String menu_url;
	 private int has_online_delivery;
	 private int is_delivering_now;
	 private String deeplink;
	 private int has_table_booking;
	 private String events_url;
	 
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getSwitch_to_order_menu() {
		return switch_to_order_menu;
	}
	public void setSwitch_to_order_menu(int switch_to_order_menu) {
		this.switch_to_order_menu = switch_to_order_menu;
	}
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	public int getAverage_cost_for_two() {
		return average_cost_for_two;
	}
	public void setAverage_cost_for_two(int average_cost_for_two) {
		this.average_cost_for_two = average_cost_for_two;
	}
	public int getPrice_range() {
		return price_range;
	}
	public void setPrice_range(int price_range) {
		this.price_range = price_range;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPhotos_url() {
		return photos_url;
	}
	public void setPhotos_url(String photos_url) {
		this.photos_url = photos_url;
	}
	public String getMenu_url() {
		return menu_url;
	}
	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}
	public int getHas_online_delivery() {
		return has_online_delivery;
	}
	public void setHas_online_delivery(int has_online_delivery) {
		this.has_online_delivery = has_online_delivery;
	}
	public int getIs_delivering_now() {
		return is_delivering_now;
	}
	public void setIs_delivering_now(int is_delivering_now) {
		this.is_delivering_now = is_delivering_now;
	}
	public String getDeeplink() {
		return deeplink;
	}
	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}
	public int getHas_table_booking() {
		return has_table_booking;
	}
	public void setHas_table_booking(int has_table_booking) {
		this.has_table_booking = has_table_booking;
	}
	public String getEvents_url() {
		return events_url;
	}
	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}
}
