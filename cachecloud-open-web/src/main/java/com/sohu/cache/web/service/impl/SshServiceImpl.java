package com.sohu.cache.web.service.impl;

import com.sohu.cache.entity.HostSshInfo;
import com.sohu.cache.web.service.SshService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sohu.cache.dao.HostSshInfoDao;

public class SshServiceImpl implements SshService {
	
	private Logger logger = LoggerFactory.getLogger(SshServiceImpl.class);

	private HostSshInfoDao hostSshInfoDao;
	
	public void setHostSshInfoDao(HostSshInfoDao hostSshInfoDao) {
		this.hostSshInfoDao = hostSshInfoDao;
	}
	
	public HostSshInfoDao getHostSshInfoDao() {
		return this.hostSshInfoDao;
	}
	
	@Override
	public HostSshInfo getHostSshInfo(String ip) {
		return this.hostSshInfoDao.getHostSshInfo(ip);
	}

	@Override
	public int getSshPort(String ip) {
		// TODO Auto-generated method stub
		return this.hostSshInfoDao.getSshPort(ip);
	}
	
}