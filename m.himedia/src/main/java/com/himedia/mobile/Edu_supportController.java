package com.himedia.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Edu_supportController {
		/**
		 * Simply selects the home view to render by returning its name.
		 */
		@RequestMapping(value = "edu_support/himedia_intro.hi", method = RequestMethod.GET)
		public String goto_Introduction()
		{
			
			
			return "/pages/introduction/himedia_intro";
		}
}
