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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RecordOutputMarshaller
 */
public class RecordOutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RecordOutput recordOutput,
            StructuredJsonGenerator jsonGenerator) {

        if (recordOutput == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (recordOutput.getOutputKey() != null) {
                jsonGenerator.writeFieldName("OutputKey").writeValue(
                        recordOutput.getOutputKey());
            }
            if (recordOutput.getOutputValue() != null) {
                jsonGenerator.writeFieldName("OutputValue").writeValue(
                        recordOutput.getOutputValue());
            }
            if (recordOutput.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(
                        recordOutput.getDescription());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RecordOutputJsonMarshaller instance;

    public static RecordOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordOutputJsonMarshaller();
        return instance;
    }

}
