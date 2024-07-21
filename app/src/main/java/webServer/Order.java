package webServer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Order
 */
public class Order {
	@JsonProperty("cn")
	public String name;
	@JsonProperty("cd")
	public int id;
	@Override
	public String toString() {
		return "Order [name=" + name + ", id=" + id + "]";
	}
}
