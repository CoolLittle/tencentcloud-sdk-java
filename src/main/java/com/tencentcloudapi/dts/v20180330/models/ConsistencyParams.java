package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ConsistencyParams  extends AbstractModel{


    /**
    * 1-100的整数值，select(*)对比时每张表的抽样行数比例
    */
    @SerializedName("SelectRowsPerTable")
    @Expose
    private Integer SelectRowsPerTable;

    /**
    * 1-100的整数值，select(*)对比的表的比例
    */
    @SerializedName("TablesSelectAll")
    @Expose
    private Integer TablesSelectAll;

    /**
    * 1-100的整数值，select count(*)对比的表的比例
    */
    @SerializedName("TablesSelectCount")
    @Expose
    private Integer TablesSelectCount;

    /**
     * 获取1-100的整数值，select(*)对比时每张表的抽样行数比例
     * @return SelectRowsPerTable 1-100的整数值，select(*)对比时每张表的抽样行数比例
     */
    public Integer getSelectRowsPerTable() {
        return this.SelectRowsPerTable;
    }

    /**
     * 设置1-100的整数值，select(*)对比时每张表的抽样行数比例
     * @param SelectRowsPerTable 1-100的整数值，select(*)对比时每张表的抽样行数比例
     */
    public void setSelectRowsPerTable(Integer SelectRowsPerTable) {
        this.SelectRowsPerTable = SelectRowsPerTable;
    }

    /**
     * 获取1-100的整数值，select(*)对比的表的比例
     * @return TablesSelectAll 1-100的整数值，select(*)对比的表的比例
     */
    public Integer getTablesSelectAll() {
        return this.TablesSelectAll;
    }

    /**
     * 设置1-100的整数值，select(*)对比的表的比例
     * @param TablesSelectAll 1-100的整数值，select(*)对比的表的比例
     */
    public void setTablesSelectAll(Integer TablesSelectAll) {
        this.TablesSelectAll = TablesSelectAll;
    }

    /**
     * 获取1-100的整数值，select count(*)对比的表的比例
     * @return TablesSelectCount 1-100的整数值，select count(*)对比的表的比例
     */
    public Integer getTablesSelectCount() {
        return this.TablesSelectCount;
    }

    /**
     * 设置1-100的整数值，select count(*)对比的表的比例
     * @param TablesSelectCount 1-100的整数值，select count(*)对比的表的比例
     */
    public void setTablesSelectCount(Integer TablesSelectCount) {
        this.TablesSelectCount = TablesSelectCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelectRowsPerTable", this.SelectRowsPerTable);
        this.setParamSimple(map, prefix + "TablesSelectAll", this.TablesSelectAll);
        this.setParamSimple(map, prefix + "TablesSelectCount", this.TablesSelectCount);

    }
}

