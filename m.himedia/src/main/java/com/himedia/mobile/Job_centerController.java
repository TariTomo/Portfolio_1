package com.himedia.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Job_centerController {
		/**
		 * Simply selects the home view to render by returning its name.
		 */
		@RequestMapping(value = "job_center/himedia_intro.hi", method = RequestMethod.GET)
		public String goto_Introduction()
		{
			
			
			return "/pages/introduction/himedia_intro";
		}
}
