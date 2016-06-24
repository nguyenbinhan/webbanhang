package com.tdt.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		String kk = "Duyen do ne";
		model.addAttribute("message", kk);

		return "home";
	}

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String inghhjdex(@RequestParam String id, @RequestParam String pass, Locale locale, Model model) {
////		if(request.getParameter("special") == null){
////		
////		logger.info("Welcome home! The client locale is {}.", locale);
////
////		Date date = new Date();
////		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
////
////		String formattedDate = dateFormat.format(date);
////			return "home";
////		}
//		model.addAttribute("id",id);
//        model.addAttribute("pass",pass);
//        //request.setAttribute("user", request.getParameter("special"));
//		return "index";
//	}

}
