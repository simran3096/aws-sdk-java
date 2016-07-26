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
package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EvaluationResultMarshaller
 */
public class EvaluationResultJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EvaluationResult evaluationResult,
            StructuredJsonGenerator jsonGenerator) {

        if (evaluationResult == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (evaluationResult.getEvaluationResultIdentifier() != null) {
                jsonGenerator.writeFieldName("EvaluationResultIdentifier");
                EvaluationResultIdentifierJsonMarshaller
                        .getInstance()
                        .marshall(
                                evaluationResult
                                        .getEvaluationResultIdentifier(),
                                jsonGenerator);
            }
            if (evaluationResult.getComplianceType() != null) {
                jsonGenerator.writeFieldName("ComplianceType").writeValue(
                        evaluationResult.getComplianceType());
            }
            if (evaluationResult.getResultRecordedTime() != null) {
                jsonGenerator.writeFieldName("ResultRecordedTime").writeValue(
                        evaluationResult.getResultRecordedTime());
            }
            if (evaluationResult.getConfigRuleInvokedTime() != null) {
                jsonGenerator
                        .writeFieldName("ConfigRuleInvokedTime")
                        .writeValue(evaluationResult.getConfigRuleInvokedTime());
            }
            if (evaluationResult.getAnnotation() != null) {
                jsonGenerator.writeFieldName("Annotation").writeValue(
                        evaluationResult.getAnnotation());
            }
            if (evaluationResult.getResultToken() != null) {
                jsonGenerator.writeFieldName("ResultToken").writeValue(
                        evaluationResult.getResultToken());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EvaluationResultJsonMarshaller instance;

    public static EvaluationResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationResultJsonMarshaller();
        return instance;
    }

}
