package com.tencentcloudapi.msp.v20180319.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SrcInfo  extends AbstractModel{


    /**
    * 迁移源地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 迁移源Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 迁移源端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 迁移源实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * 获取迁移源地域
     * @return Region 迁移源地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置迁移源地域
     * @param Region 迁移源地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取迁移源Ip
     * @return Ip 迁移源Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置迁移源Ip
     * @param Ip 迁移源Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取迁移源端口
     * @return Port 迁移源端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * 设置迁移源端口
     * @param Port 迁移源端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * 获取迁移源实例Id
     * @return InstanceId 迁移源实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置迁移源实例Id
     * @param InstanceId 迁移源实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

