package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DownloadCustomerGatewayConfigurationRequest  extends AbstractModel{


    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * VPN通道实例ID。形如：vpnx-f49l6u0z。
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * 对端网关厂商信息对象，可通过DescribeCustomerGatewayVendors获取。
    */
    @SerializedName("CustomerGatewayVendor")
    @Expose
    private CustomerGatewayVendor CustomerGatewayVendor;

    /**
    * 通道接入设备物理接口名称。
    */
    @SerializedName("InterfaceName")
    @Expose
    private String InterfaceName;

    /**
     * 获取VPN网关实例ID。
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * 设置VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * 获取VPN通道实例ID。形如：vpnx-f49l6u0z。
     * @return VpnConnectionId VPN通道实例ID。形如：vpnx-f49l6u0z。
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * 设置VPN通道实例ID。形如：vpnx-f49l6u0z。
     * @param VpnConnectionId VPN通道实例ID。形如：vpnx-f49l6u0z。
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * 获取对端网关厂商信息对象，可通过DescribeCustomerGatewayVendors获取。
     * @return CustomerGatewayVendor 对端网关厂商信息对象，可通过DescribeCustomerGatewayVendors获取。
     */
    public CustomerGatewayVendor getCustomerGatewayVendor() {
        return this.CustomerGatewayVendor;
    }

    /**
     * 设置对端网关厂商信息对象，可通过DescribeCustomerGatewayVendors获取。
     * @param CustomerGatewayVendor 对端网关厂商信息对象，可通过DescribeCustomerGatewayVendors获取。
     */
    public void setCustomerGatewayVendor(CustomerGatewayVendor CustomerGatewayVendor) {
        this.CustomerGatewayVendor = CustomerGatewayVendor;
    }

    /**
     * 获取通道接入设备物理接口名称。
     * @return InterfaceName 通道接入设备物理接口名称。
     */
    public String getInterfaceName() {
        return this.InterfaceName;
    }

    /**
     * 设置通道接入设备物理接口名称。
     * @param InterfaceName 通道接入设备物理接口名称。
     */
    public void setInterfaceName(String InterfaceName) {
        this.InterfaceName = InterfaceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamObj(map, prefix + "CustomerGatewayVendor.", this.CustomerGatewayVendor);
        this.setParamSimple(map, prefix + "InterfaceName", this.InterfaceName);

    }
}

