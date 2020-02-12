package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class AppConfiguration {

		@RequestMapping("/test")
		public String test(Model model) {
			
			FleetInfo info = new FleetInfo();
			info.setFleetMake("Johndeere");
			info.setFleetModel("8R Tractor");
			info.setFleetName("Customer Combine");
			List<FleetInfo> fleetInfo = new ArrayList<FleetInfo>();
			
			fleetInfo.add(info);
			
			model.addAttribute("fleetList", fleetInfo);
			
			return "test";
		
	}
}

