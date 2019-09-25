package com.ljh.service;

import com.ljh.domain.TStudent;
import com.ljh.domain.User;
import com.ljh.mapper1.UserMapper;
import com.ljh.mapper2.TStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/25 10:57
 */
@Service
public class TransactionService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private TStudentMapper studentMapper;

	@Transactional
	public void test() {
		User user = new User();
		user.setSex("nv");
		user.setUsername("lisi");
		user.setAge(11);
		userMapper.insert(user);

		int i = 1 / 0;

		TStudent tStudent = new TStudent();
		tStudent.setName("asda");
		tStudent.setAge(11);
		studentMapper.insert(tStudent);

	}

}
