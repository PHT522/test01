package kh.com.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.com.edu.dao.KhYoutubeDao;
import kh.com.edu.service.KhYoutubeService;

@Service
public class iKhYoutubeService implements KhYoutubeService {

	@Autowired
	private KhYoutubeDao khYoutubeDao;
	
}
