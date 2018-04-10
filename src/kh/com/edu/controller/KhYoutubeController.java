package kh.com.edu.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kh.com.edu.service.KhYoutubeService;

@Controller
public class KhYoutubeController {
	
	private static final Logger logger = LoggerFactory.getLogger(KhYoutubeController.class);
	
	@Autowired
	KhYoutubeService khYoutubeService;
	
	
	@RequestMapping(value="youtube.do", method={RequestMethod.GET, RequestMethod.POST})
	public String youtube(Model model) {
		logger.info("KhYoutubeController youtube" + new Date());		
		return "youtube.tiles";
	}
	
}
