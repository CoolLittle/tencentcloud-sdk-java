package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RollbackTableName  extends AbstractModel{


    /**
    * 回档前的原数据库表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 回档后的新数据库表名
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
     * 获取回档前的原数据库表名
     * @return TableName 回档前的原数据库表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * 设置回档前的原数据库表名
     * @param TableName 回档前的原数据库表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * 获取回档后的新数据库表名
     * @return NewTableName 回档后的新数据库表名
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * 设置回档后的新数据库表名
     * @param NewTableName 回档后的新数据库表名
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);

    }
}

