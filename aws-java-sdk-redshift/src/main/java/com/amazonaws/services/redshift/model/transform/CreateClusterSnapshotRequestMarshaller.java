/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateClusterSnapshotRequest Marshaller
 */

public class CreateClusterSnapshotRequestMarshaller
        implements
        Marshaller<Request<CreateClusterSnapshotRequest>, CreateClusterSnapshotRequest> {

    public Request<CreateClusterSnapshotRequest> marshall(
            CreateClusterSnapshotRequest createClusterSnapshotRequest) {

        if (createClusterSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateClusterSnapshotRequest> request = new DefaultRequest<CreateClusterSnapshotRequest>(
                createClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateClusterSnapshot");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils
                    .fromString(createClusterSnapshotRequest
                            .getSnapshotIdentifier()));
        }

        if (createClusterSnapshotRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils
                    .fromString(createClusterSnapshotRequest
                            .getClusterIdentifier()));
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createClusterSnapshotRequest
                .getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key",
                            StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter(
                            "Tags.Tag." + tagsListIndex + ".Value",
                            StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
