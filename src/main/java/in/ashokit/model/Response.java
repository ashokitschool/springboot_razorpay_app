package in.ashokit.model;

import lombok.Data;

@Data
public class Response {
	
	private int statusCode;
	private RazorPay razorPay;

}
