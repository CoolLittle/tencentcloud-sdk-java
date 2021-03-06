package com.tencentcloudapi.dc.v20180410.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateDirectConnectTunnelRequest  extends AbstractModel{


    /**
    * 专线 ID，例如：dc-kd7d06of
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * 专线通道名称
    */
    @SerializedName("DirectConnectTunnelName")
    @Expose
    private String DirectConnectTunnelName;

    /**
    * 物理专线 owner，缺省为当前客户（物理专线 owner）
共享专线时这里需要填写共享专线的开发商账号 ID
    */
    @SerializedName("DirectConnectOwnerAccount")
    @Expose
    private String DirectConnectOwnerAccount;

    /**
    * 网络类型，分别为VPC、BMVPC
VPC：私有网络
BMVPC：黑石网络
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 网络地域
    */
    @SerializedName("NetworkRegion")
    @Expose
    private String NetworkRegion;

    /**
    * 私有网络统一 ID 或者黑石网络统一 ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 专线网关 ID，例如 dcg-d545ddf
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * 专线带宽，单位：Mbps
默认是物理专线带宽值
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
    * BGP ：BGP路由
STATIC：静态
默认为 BGP 路由
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * BgpPeer，用户侧bgp信息，包括asn和AuthKey
    */
    @SerializedName("BgpPeer")
    @Expose
    private BgpPeer BgpPeer;

    /**
    * 静态路由，用户IDC的网段地址
    */
    @SerializedName("RouteFilterPrefixes")
    @Expose
    private RouteFilterPrefix [] RouteFilterPrefixes;

    /**
    * vlan，范围：0 ~ 3000
0：不开启子接口
默认值是非0
    */
    @SerializedName("Vlan")
    @Expose
    private Integer Vlan;

    /**
    * TencentAddress，腾讯侧互联 IP
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * CustomerAddress，用户侧互联 IP
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
     * 获取专线 ID，例如：dc-kd7d06of
     * @return DirectConnectId 专线 ID，例如：dc-kd7d06of
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * 设置专线 ID，例如：dc-kd7d06of
     * @param DirectConnectId 专线 ID，例如：dc-kd7d06of
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * 获取专线通道名称
     * @return DirectConnectTunnelName 专线通道名称
     */
    public String getDirectConnectTunnelName() {
        return this.DirectConnectTunnelName;
    }

    /**
     * 设置专线通道名称
     * @param DirectConnectTunnelName 专线通道名称
     */
    public void setDirectConnectTunnelName(String DirectConnectTunnelName) {
        this.DirectConnectTunnelName = DirectConnectTunnelName;
    }

    /**
     * 获取物理专线 owner，缺省为当前客户（物理专线 owner）
共享专线时这里需要填写共享专线的开发商账号 ID
     * @return DirectConnectOwnerAccount 物理专线 owner，缺省为当前客户（物理专线 owner）
共享专线时这里需要填写共享专线的开发商账号 ID
     */
    public String getDirectConnectOwnerAccount() {
        return this.DirectConnectOwnerAccount;
    }

    /**
     * 设置物理专线 owner，缺省为当前客户（物理专线 owner）
共享专线时这里需要填写共享专线的开发商账号 ID
     * @param DirectConnectOwnerAccount 物理专线 owner，缺省为当前客户（物理专线 owner）
共享专线时这里需要填写共享专线的开发商账号 ID
     */
    public void setDirectConnectOwnerAccount(String DirectConnectOwnerAccount) {
        this.DirectConnectOwnerAccount = DirectConnectOwnerAccount;
    }

    /**
     * 获取网络类型，分别为VPC、BMVPC
VPC：私有网络
BMVPC：黑石网络
     * @return NetworkType 网络类型，分别为VPC、BMVPC
VPC：私有网络
BMVPC：黑石网络
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * 设置网络类型，分别为VPC、BMVPC
VPC：私有网络
BMVPC：黑石网络
     * @param NetworkType 网络类型，分别为VPC、BMVPC
VPC：私有网络
BMVPC：黑石网络
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * 获取网络地域
     * @return NetworkRegion 网络地域
     */
    public String getNetworkRegion() {
        return this.NetworkRegion;
    }

    /**
     * 设置网络地域
     * @param NetworkRegion 网络地域
     */
    public void setNetworkRegion(String NetworkRegion) {
        this.NetworkRegion = NetworkRegion;
    }

    /**
     * 获取私有网络统一 ID 或者黑石网络统一 ID
     * @return VpcId 私有网络统一 ID 或者黑石网络统一 ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络统一 ID 或者黑石网络统一 ID
     * @param VpcId 私有网络统一 ID 或者黑石网络统一 ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取专线网关 ID，例如 dcg-d545ddf
     * @return DirectConnectGatewayId 专线网关 ID，例如 dcg-d545ddf
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * 设置专线网关 ID，例如 dcg-d545ddf
     * @param DirectConnectGatewayId 专线网关 ID，例如 dcg-d545ddf
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * 获取专线带宽，单位：Mbps
默认是物理专线带宽值
     * @return Bandwidth 专线带宽，单位：Mbps
默认是物理专线带宽值
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置专线带宽，单位：Mbps
默认是物理专线带宽值
     * @param Bandwidth 专线带宽，单位：Mbps
默认是物理专线带宽值
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取BGP ：BGP路由
STATIC：静态
默认为 BGP 路由
     * @return RouteType BGP ：BGP路由
STATIC：静态
默认为 BGP 路由
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * 设置BGP ：BGP路由
STATIC：静态
默认为 BGP 路由
     * @param RouteType BGP ：BGP路由
STATIC：静态
默认为 BGP 路由
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * 获取BgpPeer，用户侧bgp信息，包括asn和AuthKey
     * @return BgpPeer BgpPeer，用户侧bgp信息，包括asn和AuthKey
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * 设置BgpPeer，用户侧bgp信息，包括asn和AuthKey
     * @param BgpPeer BgpPeer，用户侧bgp信息，包括asn和AuthKey
     */
    public void setBgpPeer(BgpPeer BgpPeer) {
        this.BgpPeer = BgpPeer;
    }

    /**
     * 获取静态路由，用户IDC的网段地址
     * @return RouteFilterPrefixes 静态路由，用户IDC的网段地址
     */
    public RouteFilterPrefix [] getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * 设置静态路由，用户IDC的网段地址
     * @param RouteFilterPrefixes 静态路由，用户IDC的网段地址
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix [] RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * 获取vlan，范围：0 ~ 3000
0：不开启子接口
默认值是非0
     * @return Vlan vlan，范围：0 ~ 3000
0：不开启子接口
默认值是非0
     */
    public Integer getVlan() {
        return this.Vlan;
    }

    /**
     * 设置vlan，范围：0 ~ 3000
0：不开启子接口
默认值是非0
     * @param Vlan vlan，范围：0 ~ 3000
0：不开启子接口
默认值是非0
     */
    public void setVlan(Integer Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * 获取TencentAddress，腾讯侧互联 IP
     * @return TencentAddress TencentAddress，腾讯侧互联 IP
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * 设置TencentAddress，腾讯侧互联 IP
     * @param TencentAddress TencentAddress，腾讯侧互联 IP
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * 获取CustomerAddress，用户侧互联 IP
     * @return CustomerAddress CustomerAddress，用户侧互联 IP
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * 设置CustomerAddress，用户侧互联 IP
     * @param CustomerAddress CustomerAddress，用户侧互联 IP
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "DirectConnectTunnelName", this.DirectConnectTunnelName);
        this.setParamSimple(map, prefix + "DirectConnectOwnerAccount", this.DirectConnectOwnerAccount);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkRegion", this.NetworkRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamObj(map, prefix + "BgpPeer.", this.BgpPeer);
        this.setParamArrayObj(map, prefix + "RouteFilterPrefixes.", this.RouteFilterPrefixes);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);

    }
}

