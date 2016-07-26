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
package com.amazonaws.services.cloudtrail.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ListTagsRequest Marshaller
 */
public class ListTagsRequestMarshaller implements
        Marshaller<Request<ListTagsRequest>, ListTagsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListTagsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListTagsRequest> marshall(ListTagsRequest listTagsRequest) {

        if (listTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListTagsRequest> request = new DefaultRequest<ListTagsRequest>(
                listTagsRequest, "AWSCloudTrail");
        request.addHeader("X-Amz-Target",
                "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101.ListTags");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory
                    .createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> resourceIdListList = (com.amazonaws.internal.SdkInternalList<String>) listTagsRequest
                    .getResourceIdList();
            if (!resourceIdListList.isEmpty()
                    || !resourceIdListList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ResourceIdList");
                jsonGenerator.writeStartArray();
                for (String resourceIdListListValue : resourceIdListList) {
                    if (resourceIdListListValue != null) {
                        jsonGenerator.writeValue(resourceIdListListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (listTagsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(
                        listTagsRequest.getNextToken());
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
