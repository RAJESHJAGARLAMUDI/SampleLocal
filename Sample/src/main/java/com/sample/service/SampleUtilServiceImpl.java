package com.sample.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("sampleUtilService")
@Transactional("transactionManager")
public class SampleUtilServiceImpl implements SampleUtilService {
	
}