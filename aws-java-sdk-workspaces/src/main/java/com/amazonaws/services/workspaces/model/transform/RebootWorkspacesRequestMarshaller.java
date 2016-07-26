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
package com.amazonaws.services.workspaces.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RebootWorkspacesRequest Marshaller
 */
public class RebootWorkspacesRequestMarshaller implements
        Marshaller<Request<RebootWorkspacesRequest>, RebootWorkspacesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RebootWorkspacesRequestMarshaller(
            SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RebootWorkspacesRequest> marshall(
            RebootWorkspacesRequest rebootWorkspacesRequest) {

        if (rebootWorkspacesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RebootWorkspacesRequest> request = new DefaultRequest<RebootWorkspacesRequest>(
                rebootWorkspacesRequest, "AmazonWorkspaces");
        request.addHeader("X-Amz-Target", "WorkspacesService.RebootWorkspaces");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory
                    .createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<RebootRequest> rebootWorkspaceRequestsList = (com.amazonaws.internal.SdkInternalList<RebootRequest>) rebootWorkspacesRequest
                    .getRebootWorkspaceRequests();
            if (!rebootWorkspaceRequestsList.isEmpty()
                    || !rebootWorkspaceRequestsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("RebootWorkspaceRequests");
                jsonGenerator.writeStartArray();
                for (RebootRequest rebootWorkspaceRequestsListValue : rebootWorkspaceRequestsList) {
                    if (rebootWorkspaceRequestsListValue != null) {

                        RebootRequestJsonMarshaller.getInstance()
                                .marshall(rebootWorkspaceRequestsListValue,
                                        jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
