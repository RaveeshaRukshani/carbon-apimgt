/*
 * Copyright (c) 2021 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.apimgt.gateway.extension.listener.dto;

import java.io.InputStream;
import java.util.Map;

public class ExtensionResponseDTO {

    int statusCode;
    InputStream payload;
    Map<String,String> headers;
    String responseStatus;
    ExtensionErrorResponseDTO errorResponse;
    Map<String,String> customProperties;

    public int getStatusCode() {

        return statusCode;
    }

    public void setStatusCode(int statusCode) {

        this.statusCode = statusCode;
    }

    public InputStream getPayload() {

        return payload;
    }

    public void setPayload(InputStream payload) {

        this.payload = payload;
    }

    public Map<String, String> getHeaders() {

        return headers;
    }

    public void setHeaders(Map<String, String> headers) {

        this.headers = headers;
    }

    public String getResponseStatus() {

        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {

        this.responseStatus = responseStatus;
    }

    public ExtensionErrorResponseDTO getErrorResponse() {

        return errorResponse;
    }

    public void setErrorResponse(ExtensionErrorResponseDTO errorResponse) {

        this.errorResponse = errorResponse;
    }

    public Map<String, String> getCustomProperties() {

        return customProperties;
    }

    public void setCustomProperties(Map<String, String> customProperties) {

        this.customProperties = customProperties;
    }
}

