/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.api.model;

import java.util.List;
import java.util.Map;

public class DeploymentEnvironments {
    //use this class to build the model for selected deployment environments
    private String type;
    private List<String> clusterNames;

    public DeploymentEnvironments(String type, List<String> clusterNames) {
        this.type = type;
        this.clusterNames = clusterNames;
    }

    public DeploymentEnvironments() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getClusterNames() {
        return clusterNames;
    }

    public void setClusterNames(List<String> clusterNames) {
        this.clusterNames = clusterNames;
    }
}
