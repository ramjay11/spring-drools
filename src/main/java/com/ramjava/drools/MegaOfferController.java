package com.ramjava.drools;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {

	@PostMapping("/order")
	public String orderNow(@RequestBody Order order) {
		// Rule engine
		return null;
		
	}
}
