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
package com.amazonaws.services.servicecatalog.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SearchProductsRequest Marshaller
 */
public class SearchProductsRequestMarshaller implements
        Marshaller<Request<SearchProductsRequest>, SearchProductsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SearchProductsRequestMarshaller(
            SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SearchProductsRequest> marshall(
            SearchProductsRequest searchProductsRequest) {

        if (searchProductsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SearchProductsRequest> request = new DefaultRequest<SearchProductsRequest>(
                searchProductsRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target",
                "AWS242ServiceCatalogService.SearchProducts");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory
                    .createGenerator();

            jsonGenerator.writeStartObject();

            if (searchProductsRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(
                        searchProductsRequest.getAcceptLanguage());
            }

            java.util.Map<String, java.util.List<String>> filtersMap = searchProductsRequest
                    .getFilters();
            if (filtersMap != null) {
                jsonGenerator.writeFieldName("Filters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> filtersMapValue : filtersMap
                        .entrySet()) {
                    if (filtersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(filtersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String filtersMapValueList : filtersMapValue
                                .getValue()) {
                            if (filtersMapValueList != null) {
                                jsonGenerator.writeValue(filtersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (searchProductsRequest.getPageSize() != null) {
                jsonGenerator.writeFieldName("PageSize").writeValue(
                        searchProductsRequest.getPageSize());
            }
            if (searchProductsRequest.getSortBy() != null) {
                jsonGenerator.writeFieldName("SortBy").writeValue(
                        searchProductsRequest.getSortBy());
            }
            if (searchProductsRequest.getSortOrder() != null) {
                jsonGenerator.writeFieldName("SortOrder").writeValue(
                        searchProductsRequest.getSortOrder());
            }
            if (searchProductsRequest.getPageToken() != null) {
                jsonGenerator.writeFieldName("PageToken").writeValue(
                        searchProductsRequest.getPageToken());
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
