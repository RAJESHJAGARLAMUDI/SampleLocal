package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dao.SampleAdminDao;

@Service("sampleAdminService")
@Transactional("transactionManager")
public class SampleAdminServiceImpl implements SampleAdminService
{
	@Autowired
	SampleAdminDao sampleAdminDao;
	
	
}