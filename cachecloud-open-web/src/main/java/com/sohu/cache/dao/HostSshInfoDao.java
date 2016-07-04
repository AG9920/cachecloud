package com.sohu.cache.dao;

import com.sohu.cache.entity.HostSshInfo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by konghui on 16-06-30.
 */
public interface HostSshInfoDao {

    /**
     * 新增SSH密码记录
     * @param hostSshInfo
     */
    public void insertHostSshInfo(HostSshInfo hostSshInfo);

    /**
     * 查询属于某个IP的记录记录
     */
    public List<HostSshInfo> selectHostSshInfo(@Param("hostIp") String hostIp);

    /**
     * 按IP查询
     * @param hostIP
     * @return
     */
    public HostSshInfo getHostSshInfo(@Param("hostIp") String hostIp);

    /**
     * 通过IP更新信息
     */
    public void updateHostSshInfo(@Param("hostIp") String hostIp, @Param("userName") String userName, @Param("userPasswd") String userPasswd, @Param("sshPort") int sshPort);
    
    /**
     * 通过IP查询端口
     */
    public int getSshPort(@Param("hostIp") String hostIp);
    
}
