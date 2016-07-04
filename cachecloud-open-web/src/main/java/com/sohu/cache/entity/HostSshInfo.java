package com.sohu.cache.entity;

/**
 * Created by konghui on 16-06-30.
 */
public class HostSshInfo {

    private long id;

    /**
     * ssh机器的ip
     */
    private String hostIp;
    
    /**
     * ssh机器的端口
     */
    private int sshPort;

    /**
     * ssh用户名
     */
    private String userName;
    
    /**
     * ssh密码
     */
    private String userPasswd;
    
    /**
     *  主机的信息
     */
    private String hostInfo;

 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHostIp() {
        return this.hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public int getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(int sshPort) {
        this.sshPort = sshPort;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPasswd() {
        return this.userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getHostInfo() {
        return this.hostInfo;
    }

    public void setHostInfo(String hostInfo) {
        this.hostInfo = hostInfo;
    }

    @Override
    public String toString() {
        return "HostSshInfo [id=" + id + ", hostIp=" + hostIp + ", sshPort=" + sshPort + ", userName=" + userName + ", userPasswd="
                + userPasswd + ", hostInfo=" + hostInfo  + "]";
    }


}
