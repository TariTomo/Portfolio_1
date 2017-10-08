package com.himedia.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {
		/**
		 * Simply selects the home view to render by returning its name.
		 */
	
	    // 웹디자인&웹퍼블리싱
		@RequestMapping(value = "course/publisher/visual_digital.hi", method = RequestMethod.GET)
		public String goto_course_visual_digital()
		{
			return "/course/publisher/visual_digital";
		}
		
		@RequestMapping(value = "course/publisher/ui_ux_engineering.hi", method = RequestMethod.GET)
		public String goto_course_uiuxengineering()
		{
			return "/course/publisher/ui_ux_engineering";
		}
		
		@RequestMapping(value = "course/publisher/web_publisher.hi", method = RequestMethod.GET)
		public String goto_course_webpublisher()
		{
			return "/course/publisher/web_publisher";
		}

		@RequestMapping(value = "course/publisher/web_design.hi", method = RequestMethod.GET)
		public String goto_course_webdesign()
		{
			return "/course/publisher/web_design";
		}
		
		@RequestMapping(value = "course/publisher/smart_contents.hi", method = RequestMethod.GET)
		public String goto_course_smartcontents()
		{
			return "/course/publisher/smart_contents";
		}
		
	    // IT/개발
		@RequestMapping(value = "course/it_development/arduino.hi", method = RequestMethod.GET)
		public String goto_course_arduino()
		{
			return "/course/it_development/arduino";
		}
		
		// 전산세무회계
		@RequestMapping(value = "course/tax/tax_1.hi", method = RequestMethod.GET)
		public String goto_course_tax_1()
		{
			return "/course/tax/tax_1";
		}

		@RequestMapping(value = "course/tax/tax_2.hi", method = RequestMethod.GET)
		public String goto_course_tax_2()
		{
			return "/course/tax/tax_2";
		}
		
		// 게임
		@RequestMapping(value = "course/game/mobile_contents.hi", method = RequestMethod.GET)
		public String goto_course_mobile_contents()
		{
			return "/course/game/mobile_contents";
		}
		@RequestMapping(value = "course/game/game_contents.hi", method = RequestMethod.GET)
		public String goto_course_game_contents()
		{
			return "/course/game/game_contents";
		}
		
		// 사무자동화 / OA
		@RequestMapping(value = "course/oa/oa_1.hi", method = RequestMethod.GET)
		public String goto_course_oa_1()
		{
			return "/course/oa/oa_1";
		}
		@RequestMapping(value = "course/oa/oa_2.hi", method = RequestMethod.GET)
		public String goto_course_oa_2()
		{
			return "/course/oa/oa_2";
		}
		
		// 편집디자인 / 영상
		@RequestMapping(value = "course/editing/editing_design.hi", method = RequestMethod.GET)
		public String goto_course_visual_design()
		{
			return "/course/editing/editing_design";
		}
		
		// 실내건축 / 기계설계
		@RequestMapping(value = "course/bim/bim.hi", method = RequestMethod.GET)
		public String goto_course_bim()
		{
			return "/course/bim/bim";
		}
}
