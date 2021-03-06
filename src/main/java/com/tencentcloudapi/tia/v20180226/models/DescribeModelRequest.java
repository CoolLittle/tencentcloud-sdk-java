package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeModelRequest  extends AbstractModel{


    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模型所在集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
     * 获取模型名称
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取模型所在集群名称
     * @return Cluster 模型所在集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置模型所在集群名称
     * @param Cluster 模型所在集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);

    }
}

