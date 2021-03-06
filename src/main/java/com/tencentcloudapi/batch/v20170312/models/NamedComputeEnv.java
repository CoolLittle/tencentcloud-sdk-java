package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class NamedComputeEnv  extends AbstractModel{


    /**
    * 计算环境名称
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * 计算环境管理类型
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 计算环境具体参数
    */
    @SerializedName("EnvData")
    @Expose
    private EnvData EnvData;

    /**
    * 计算节点期望个数
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Integer DesiredComputeNodeCount;

    /**
    * 计算环境描述
    */
    @SerializedName("EnvDescription")
    @Expose
    private String EnvDescription;

    /**
    * 数据盘挂载选项
    */
    @SerializedName("MountDataDisks")
    @Expose
    private MountDataDisk [] MountDataDisks;

    /**
    * 授权信息
    */
    @SerializedName("Authentications")
    @Expose
    private Authentication [] Authentications;

    /**
    * 输入映射信息
    */
    @SerializedName("InputMappings")
    @Expose
    private InputMapping [] InputMappings;

    /**
    * agent运行模式，适用于Windows系统
    */
    @SerializedName("AgentRunningMode")
    @Expose
    private AgentRunningMode AgentRunningMode;

    /**
    * 通知信息
    */
    @SerializedName("Notifications")
    @Expose
    private Notification Notifications;

    /**
    * 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
    */
    @SerializedName("ActionIfComputeNodeInactive")
    @Expose
    private String ActionIfComputeNodeInactive;

    /**
     * 获取计算环境名称
     * @return EnvName 计算环境名称
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * 设置计算环境名称
     * @param EnvName 计算环境名称
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * 获取计算环境管理类型
     * @return EnvType 计算环境管理类型
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * 设置计算环境管理类型
     * @param EnvType 计算环境管理类型
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * 获取计算环境具体参数
     * @return EnvData 计算环境具体参数
     */
    public EnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * 设置计算环境具体参数
     * @param EnvData 计算环境具体参数
     */
    public void setEnvData(EnvData EnvData) {
        this.EnvData = EnvData;
    }

    /**
     * 获取计算节点期望个数
     * @return DesiredComputeNodeCount 计算节点期望个数
     */
    public Integer getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * 设置计算节点期望个数
     * @param DesiredComputeNodeCount 计算节点期望个数
     */
    public void setDesiredComputeNodeCount(Integer DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * 获取计算环境描述
     * @return EnvDescription 计算环境描述
     */
    public String getEnvDescription() {
        return this.EnvDescription;
    }

    /**
     * 设置计算环境描述
     * @param EnvDescription 计算环境描述
     */
    public void setEnvDescription(String EnvDescription) {
        this.EnvDescription = EnvDescription;
    }

    /**
     * 获取数据盘挂载选项
     * @return MountDataDisks 数据盘挂载选项
     */
    public MountDataDisk [] getMountDataDisks() {
        return this.MountDataDisks;
    }

    /**
     * 设置数据盘挂载选项
     * @param MountDataDisks 数据盘挂载选项
     */
    public void setMountDataDisks(MountDataDisk [] MountDataDisks) {
        this.MountDataDisks = MountDataDisks;
    }

    /**
     * 获取授权信息
     * @return Authentications 授权信息
     */
    public Authentication [] getAuthentications() {
        return this.Authentications;
    }

    /**
     * 设置授权信息
     * @param Authentications 授权信息
     */
    public void setAuthentications(Authentication [] Authentications) {
        this.Authentications = Authentications;
    }

    /**
     * 获取输入映射信息
     * @return InputMappings 输入映射信息
     */
    public InputMapping [] getInputMappings() {
        return this.InputMappings;
    }

    /**
     * 设置输入映射信息
     * @param InputMappings 输入映射信息
     */
    public void setInputMappings(InputMapping [] InputMappings) {
        this.InputMappings = InputMappings;
    }

    /**
     * 获取agent运行模式，适用于Windows系统
     * @return AgentRunningMode agent运行模式，适用于Windows系统
     */
    public AgentRunningMode getAgentRunningMode() {
        return this.AgentRunningMode;
    }

    /**
     * 设置agent运行模式，适用于Windows系统
     * @param AgentRunningMode agent运行模式，适用于Windows系统
     */
    public void setAgentRunningMode(AgentRunningMode AgentRunningMode) {
        this.AgentRunningMode = AgentRunningMode;
    }

    /**
     * 获取通知信息
     * @return Notifications 通知信息
     */
    public Notification getNotifications() {
        return this.Notifications;
    }

    /**
     * 设置通知信息
     * @param Notifications 通知信息
     */
    public void setNotifications(Notification Notifications) {
        this.Notifications = Notifications;
    }

    /**
     * 获取非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
     * @return ActionIfComputeNodeInactive 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
     */
    public String getActionIfComputeNodeInactive() {
        return this.ActionIfComputeNodeInactive;
    }

    /**
     * 设置非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
     * @param ActionIfComputeNodeInactive 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
     */
    public void setActionIfComputeNodeInactive(String ActionIfComputeNodeInactive) {
        this.ActionIfComputeNodeInactive = ActionIfComputeNodeInactive;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamSimple(map, prefix + "EnvDescription", this.EnvDescription);
        this.setParamArrayObj(map, prefix + "MountDataDisks.", this.MountDataDisks);
        this.setParamArrayObj(map, prefix + "Authentications.", this.Authentications);
        this.setParamArrayObj(map, prefix + "InputMappings.", this.InputMappings);
        this.setParamObj(map, prefix + "AgentRunningMode.", this.AgentRunningMode);
        this.setParamObj(map, prefix + "Notifications.", this.Notifications);
        this.setParamSimple(map, prefix + "ActionIfComputeNodeInactive", this.ActionIfComputeNodeInactive);

    }
}

