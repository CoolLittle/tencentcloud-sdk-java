package com.tencentcloudapi.aai.v20180522.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TextToVoiceRequest  extends AbstractModel{


    /**
    * 合成语音的源文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 模型类型，1-默认模型
    */
    @SerializedName("ModelType")
    @Expose
    private Integer ModelType;

    /**
    * 音量大小，暂仅支持默认值1
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 语速，暂仅支持默认值1
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * 用户自定义项目id，默认为0
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 音色，1-默认音色
    */
    @SerializedName("VoiceType")
    @Expose
    private Integer VoiceType;

    /**
    * 主语言类型<li>1-中文(包括粤语)，最大300字符</li><li>2-英文，最大支持600字符</li>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Integer PrimaryLanguage;

    /**
    * 音频采样率：暂仅支持16k
    */
    @SerializedName("SampleRate")
    @Expose
    private Integer SampleRate;

    /**
     * 获取合成语音的源文本
     * @return Text 合成语音的源文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * 设置合成语音的源文本
     * @param Text 合成语音的源文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * 获取一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     * @return SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     * @param SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取模型类型，1-默认模型
     * @return ModelType 模型类型，1-默认模型
     */
    public Integer getModelType() {
        return this.ModelType;
    }

    /**
     * 设置模型类型，1-默认模型
     * @param ModelType 模型类型，1-默认模型
     */
    public void setModelType(Integer ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * 获取音量大小，暂仅支持默认值1
     * @return Volume 音量大小，暂仅支持默认值1
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * 设置音量大小，暂仅支持默认值1
     * @param Volume 音量大小，暂仅支持默认值1
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取语速，暂仅支持默认值1
     * @return Speed 语速，暂仅支持默认值1
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * 设置语速，暂仅支持默认值1
     * @param Speed 语速，暂仅支持默认值1
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * 获取用户自定义项目id，默认为0
     * @return ProjectId 用户自定义项目id，默认为0
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置用户自定义项目id，默认为0
     * @param ProjectId 用户自定义项目id，默认为0
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取音色，1-默认音色
     * @return VoiceType 音色，1-默认音色
     */
    public Integer getVoiceType() {
        return this.VoiceType;
    }

    /**
     * 设置音色，1-默认音色
     * @param VoiceType 音色，1-默认音色
     */
    public void setVoiceType(Integer VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * 获取主语言类型<li>1-中文(包括粤语)，最大300字符</li><li>2-英文，最大支持600字符</li>
     * @return PrimaryLanguage 主语言类型<li>1-中文(包括粤语)，最大300字符</li><li>2-英文，最大支持600字符</li>
     */
    public Integer getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * 设置主语言类型<li>1-中文(包括粤语)，最大300字符</li><li>2-英文，最大支持600字符</li>
     * @param PrimaryLanguage 主语言类型<li>1-中文(包括粤语)，最大300字符</li><li>2-英文，最大支持600字符</li>
     */
    public void setPrimaryLanguage(Integer PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * 获取音频采样率：暂仅支持16k
     * @return SampleRate 音频采样率：暂仅支持16k
     */
    public Integer getSampleRate() {
        return this.SampleRate;
    }

    /**
     * 设置音频采样率：暂仅支持16k
     * @param SampleRate 音频采样率：暂仅支持16k
     */
    public void setSampleRate(Integer SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "PrimaryLanguage", this.PrimaryLanguage);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);

    }
}

