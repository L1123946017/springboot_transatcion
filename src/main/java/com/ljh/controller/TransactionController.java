package com.ljh.controller;

import com.ljh.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/25 11:39
 */
@RestController
@RequestMapping("/api/tran")
public class TransactionController {
	@Autowired
	private TransactionService service;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void testTran() {
		service.test();
	}
}
