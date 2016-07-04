package com.sohu.cache.web.service;

import com.sohu.cache.entity.*;

/**
 * ssh信息的相关操作
 * @author konghui
 * @Time 2016年07月01日
 */
public interface SshService {
	/**
	 * 获取ssh的登录信息
	 * @param ip
	 * @return
	 */
	HostSshInfo getHostSshInfo(String ip);
	/**
	 * 获取ssh的端口
	 * @param ip
	 * @return
	 */
	int getSshPort(String ip);
}