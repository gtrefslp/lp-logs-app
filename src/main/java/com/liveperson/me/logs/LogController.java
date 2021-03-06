package com.liveperson.me.logs;

import com.liveperson.me.logs.models.Log;
import com.liveperson.me.logs.repositories.LogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class LogController {

	private final LogRepository logRepository;

	@Autowired
	LogController(LogRepository logRepository) {
		this.logRepository = logRepository;
	}

	@RequestMapping(value = "/logs", method = RequestMethod.GET)
	List<Log> getLogs() {
		List<Log> logs = logRepository.findAll();
		return logs;
	}

	@RequestMapping(value = "/logs/count", method = RequestMethod.GET)
	String logCount() {
		return logRepository.count() + "";
	}

}
