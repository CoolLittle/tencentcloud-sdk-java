/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.tia.v20180226;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tia.v20180226.models.*;

public class TiaClient extends AbstractClient{
    private static String endpoint = "tia.tencentcloudapi.com";
    private static String version = "2018-02-26";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TiaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TiaClient(Credential credential, String region, ClientProfile profile) {
        super(TiaClient.endpoint, TiaClient.version, credential, region, profile);
    }

    /**
     *创建训练任务
     * @param req CreateJobRequest
     * @return CreateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobResponse  CreateJob(CreateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在指定的集群上部署一个模型，用以提供服务。
     * @param req CreateModelRequest
     * @return CreateModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelResponse  CreateModel(CreateModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateModelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateModelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateModel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除训练任务
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse  DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个指定的Model
     * @param req DeleteModelRequest
     * @return DeleteModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelResponse  DeleteModel(DeleteModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteModelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteModelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteModel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取训练任务详情
     * @param req DescribeJobRequest
     * @return DescribeJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobResponse  DescribeJob(DescribeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述Model
     * @param req DescribeModelRequest
     * @return DescribeModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelResponse  DescribeModel(DescribeModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeModel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安装agent
     * @param req InstallAgentRequest
     * @return InstallAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallAgentResponse  InstallAgent(InstallAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstallAgentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InstallAgentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InstallAgent"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列举训练任务
     * @param req ListJobsRequest
     * @return ListJobsResponse
     * @throws TencentCloudSDKException
     */
    public ListJobsResponse  ListJobs(ListJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListJobsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListJobsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListJobs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列举某个指定集群上运行的模型。
     * @param req ListModelsRequest
     * @return ListModelsResponse
     * @throws TencentCloudSDKException
     */
    public ListModelsResponse  ListModels(ListModelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListModelsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListModelsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListModels"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询日志
     * @param req QueryLogsRequest
     * @return QueryLogsResponse
     * @throws TencentCloudSDKException
     */
    public QueryLogsResponse  QueryLogs(QueryLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
