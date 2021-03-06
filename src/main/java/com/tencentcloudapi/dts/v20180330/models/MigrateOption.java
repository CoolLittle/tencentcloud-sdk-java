package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class MigrateOption  extends AbstractModel{


    /**
    * 任务运行模式，值包括：1-立即执行，2-定时执行
    */
    @SerializedName("RunMode")
    @Expose
    private Integer RunMode;

    /**
    * 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
    */
    @SerializedName("MigrateType")
    @Expose
    private Integer MigrateType;

    /**
    * 迁移对象，1-整个实例，2-指定库表
    */
    @SerializedName("MigrateObject")
    @Expose
    private Integer MigrateObject;

    /**
    * 数据对比类型，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
    */
    @SerializedName("ConsistencyType")
    @Expose
    private Integer ConsistencyType;

    /**
    * 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
    */
    @SerializedName("IsOverrideRoot")
    @Expose
    private Integer IsOverrideRoot;

    /**
    * 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
    */
    @SerializedName("ExternParams")
    @Expose
    private String ExternParams;

    /**
    * 抽样检验时的抽样参数
    */
    @SerializedName("ConsistencyParams")
    @Expose
    private ConsistencyParams ConsistencyParams;

    /**
     * 获取任务运行模式，值包括：1-立即执行，2-定时执行
     * @return RunMode 任务运行模式，值包括：1-立即执行，2-定时执行
     */
    public Integer getRunMode() {
        return this.RunMode;
    }

    /**
     * 设置任务运行模式，值包括：1-立即执行，2-定时执行
     * @param RunMode 任务运行模式，值包括：1-立即执行，2-定时执行
     */
    public void setRunMode(Integer RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * 获取期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
     * @return ExpectTime 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * 设置期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
     * @param ExpectTime 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * 获取数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
     * @return MigrateType 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
     */
    public Integer getMigrateType() {
        return this.MigrateType;
    }

    /**
     * 设置数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
     * @param MigrateType 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
     */
    public void setMigrateType(Integer MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * 获取迁移对象，1-整个实例，2-指定库表
     * @return MigrateObject 迁移对象，1-整个实例，2-指定库表
     */
    public Integer getMigrateObject() {
        return this.MigrateObject;
    }

    /**
     * 设置迁移对象，1-整个实例，2-指定库表
     * @param MigrateObject 迁移对象，1-整个实例，2-指定库表
     */
    public void setMigrateObject(Integer MigrateObject) {
        this.MigrateObject = MigrateObject;
    }

    /**
     * 获取数据对比类型，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
     * @return ConsistencyType 数据对比类型，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
     */
    public Integer getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * 设置数据对比类型，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
     * @param ConsistencyType 数据对比类型，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
     */
    public void setConsistencyType(Integer ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * 获取是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
     * @return IsOverrideRoot 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
     */
    public Integer getIsOverrideRoot() {
        return this.IsOverrideRoot;
    }

    /**
     * 设置是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
     * @param IsOverrideRoot 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
     */
    public void setIsOverrideRoot(Integer IsOverrideRoot) {
        this.IsOverrideRoot = IsOverrideRoot;
    }

    /**
     * 获取不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
     * @return ExternParams 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
     */
    public String getExternParams() {
        return this.ExternParams;
    }

    /**
     * 设置不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
     * @param ExternParams 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
     */
    public void setExternParams(String ExternParams) {
        this.ExternParams = ExternParams;
    }

    /**
     * 获取抽样检验时的抽样参数
     * @return ConsistencyParams 抽样检验时的抽样参数
     */
    public ConsistencyParams getConsistencyParams() {
        return this.ConsistencyParams;
    }

    /**
     * 设置抽样检验时的抽样参数
     * @param ConsistencyParams 抽样检验时的抽样参数
     */
    public void setConsistencyParams(ConsistencyParams ConsistencyParams) {
        this.ConsistencyParams = ConsistencyParams;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamSimple(map, prefix + "MigrateObject", this.MigrateObject);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "IsOverrideRoot", this.IsOverrideRoot);
        this.setParamSimple(map, prefix + "ExternParams", this.ExternParams);
        this.setParamObj(map, prefix + "ConsistencyParams.", this.ConsistencyParams);

    }
}

