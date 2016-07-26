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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutEventsResult JSON Unmarshaller
 */
public class PutEventsResultJsonUnmarshaller implements
        Unmarshaller<PutEventsResult, JsonUnmarshallerContext> {

    public PutEventsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        PutEventsResult putEventsResult = new PutEventsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FailedEntryCount", targetDepth)) {
                    context.nextToken();
                    putEventsResult
                            .setFailedEntryCount(context.getUnmarshaller(
                                    Integer.class).unmarshall(context));
                }
                if (context.testExpression("Entries", targetDepth)) {
                    context.nextToken();
                    putEventsResult
                            .setEntries(new ListUnmarshaller<PutEventsResultEntry>(
                                    PutEventsResultEntryJsonUnmarshaller
                                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putEventsResult;
    }

    private static PutEventsResultJsonUnmarshaller instance;

    public static PutEventsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutEventsResultJsonUnmarshaller();
        return instance;
    }
}
