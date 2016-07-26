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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Test JSON Unmarshaller
 */
public class TestJsonUnmarshaller implements
        Unmarshaller<Test, JsonUnmarshallerContext> {

    public Test unmarshall(JsonUnmarshallerContext context) throws Exception {
        Test test = new Test();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    test.setArn(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    test.setName(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    test.setType(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    test.setCreated(context.getUnmarshaller(
                            java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    test.setStatus(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    context.nextToken();
                    test.setResult(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("started", targetDepth)) {
                    context.nextToken();
                    test.setStarted(context.getUnmarshaller(
                            java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("stopped", targetDepth)) {
                    context.nextToken();
                    test.setStopped(context.getUnmarshaller(
                            java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("counters", targetDepth)) {
                    context.nextToken();
                    test.setCounters(CountersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    test.setMessage(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("deviceMinutes", targetDepth)) {
                    context.nextToken();
                    test.setDeviceMinutes(DeviceMinutesJsonUnmarshaller
                            .getInstance().unmarshall(context));
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

        return test;
    }

    private static TestJsonUnmarshaller instance;

    public static TestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestJsonUnmarshaller();
        return instance;
    }
}
