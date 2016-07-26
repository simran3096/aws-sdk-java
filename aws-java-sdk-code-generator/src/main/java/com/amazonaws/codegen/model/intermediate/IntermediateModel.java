/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.model.intermediate;

import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.util.IOUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class IntermediateModel {

    /**
     * This is used for all service clients unless overridden in the Customizations file.
     */
    private static final String DEFAULT_CLIENT_CONFIG_FACTORY = "ClientConfigurationFactory";

    private final Metadata metadata;

    private final Map<String, OperationModel> operations;

    private final Map<String, ShapeModel> shapes;

    private final CustomizationConfig customizationConfig;

    private final ServiceExamples examples;

    public IntermediateModel(@JsonProperty("metadata") Metadata metadata,
                             @JsonProperty("operations") Map<String, OperationModel> operations,
                             @JsonProperty("shapes") Map<String, ShapeModel> shapes,
                             @JsonProperty("customizationConfig") CustomizationConfig customizationConfig,
                             @JsonProperty("serviceExamples") ServiceExamples examples) {
        this.metadata = metadata;
        this.operations = operations;
        this.shapes = shapes;
        this.customizationConfig = customizationConfig;
        this.examples = examples;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Map<String, OperationModel> getOperations() {
        return operations;
    }

    public Map<String, ShapeModel> getShapes() {
        return shapes;
    }

    public ShapeModel getShapeByC2jName(String c2jName) {
        return Utils.findShapeModelByC2jName(this, c2jName);
    }

    public CustomizationConfig getCustomizationConfig() {
        return customizationConfig;
    }

    public ServiceExamples getExamples() {
        return examples;
    }

    /**
     * ClientConfigurationFactory to use when producing default client configuration for the
     * client.
     */
    public String getClientConfigFactory() {
        if (customizationConfig.getCustomClientConfigFactory() == null) {
            return DEFAULT_CLIENT_CONFIG_FACTORY;
        }
        return customizationConfig.getCustomClientConfigFactory();
    }

    /**
     * @return Exception unmarshaller implementation to use. Currently only needed by XML based
     * protocols.
     */
    public String getExceptionUnmarshallerImpl() {
        if (customizationConfig.getCustomExceptionUnmarshallerImpl() != null) {
            return customizationConfig.getCustomExceptionUnmarshallerImpl();
        } else {
            return metadata.getProtocolDefaultExceptionUmarshallerImpl();
        }
    }

    public String getServiceBaseExceptionFqcn() {
        // TODO Move this into Metadata
        return metadata.getProtocol().getProvider().getBaseExceptionFqcn();
    }

    public String getSdkModeledExceptionBaseFqcn() {
        return String.format("%s.model.%s", metadata.getPackageName(),
                             getSdkModeledExceptionBaseClassName());
    }

    public String getSdkModeledExceptionBaseClassName() {
        if (customizationConfig.getSdkModeledExceptionBaseClassName() != null) {
            return customizationConfig.getSdkModeledExceptionBaseClassName();
        } else {
            return String.format("%sException", metadata.getSyncInterface());
        }
    }

    public String getFileHeader() throws IOException {
        if (customizationConfig.getCustomFileHeader() != null) {
            return String.format("/**%n%s%n*/", customizationConfig.getCustomFileHeader());
        } else {
            return loadDeafultFileHeader();
        }
    }

    private String loadDeafultFileHeader() throws IOException {
        try (InputStream inputStream = getClass()
                .getResourceAsStream("/com/amazonaws/codegen/DefaultFileHeader.txt")) {
            return IOUtils.toString(inputStream)
                    .replaceFirst("%COPYRIGHT_DATE_RANGE%", getCopyrightDateRange());
        }
    }

    private String getCopyrightDateRange() {
        final int currentYear = DateTime.now().getYear();
        final int copyrightStartYear = currentYear - 5;
        return String.format("%d-%d", copyrightStartYear, currentYear);
    }
}
