package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SlowlogDetail  extends AbstractModel{


    /**
    * 花费总时间
    */
    @SerializedName("TotalTime")
    @Expose
    private Float TotalTime;

    /**
    * 调用总次数
    */
    @SerializedName("TotalCalls")
    @Expose
    private Integer TotalCalls;

    /**
    * 脱敏后的慢SQL列表
    */
    @SerializedName("NormalQueries")
    @Expose
    private NormalQueryItem [] NormalQueries;

    /**
     * 获取花费总时间
     * @return TotalTime 花费总时间
     */
    public Float getTotalTime() {
        return this.TotalTime;
    }

    /**
     * 设置花费总时间
     * @param TotalTime 花费总时间
     */
    public void setTotalTime(Float TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * 获取调用总次数
     * @return TotalCalls 调用总次数
     */
    public Integer getTotalCalls() {
        return this.TotalCalls;
    }

    /**
     * 设置调用总次数
     * @param TotalCalls 调用总次数
     */
    public void setTotalCalls(Integer TotalCalls) {
        this.TotalCalls = TotalCalls;
    }

    /**
     * 获取脱敏后的慢SQL列表
     * @return NormalQueries 脱敏后的慢SQL列表
     */
    public NormalQueryItem [] getNormalQueries() {
        return this.NormalQueries;
    }

    /**
     * 设置脱敏后的慢SQL列表
     * @param NormalQueries 脱敏后的慢SQL列表
     */
    public void setNormalQueries(NormalQueryItem [] NormalQueries) {
        this.NormalQueries = NormalQueries;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "TotalCalls", this.TotalCalls);
        this.setParamArrayObj(map, prefix + "NormalQueries.", this.NormalQueries);

    }
}

