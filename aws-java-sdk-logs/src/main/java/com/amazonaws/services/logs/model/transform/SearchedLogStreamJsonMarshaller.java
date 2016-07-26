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
package com.amazonaws.services.logs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SearchedLogStreamMarshaller
 */
public class SearchedLogStreamJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SearchedLogStream searchedLogStream,
            StructuredJsonGenerator jsonGenerator) {

        if (searchedLogStream == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (searchedLogStream.getLogStreamName() != null) {
                jsonGenerator.writeFieldName("logStreamName").writeValue(
                        searchedLogStream.getLogStreamName());
            }
            if (searchedLogStream.getSearchedCompletely() != null) {
                jsonGenerator.writeFieldName("searchedCompletely").writeValue(
                        searchedLogStream.getSearchedCompletely());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SearchedLogStreamJsonMarshaller instance;

    public static SearchedLogStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchedLogStreamJsonMarshaller();
        return instance;
    }

}
