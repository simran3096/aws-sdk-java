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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateEnvironmentRequest Marshaller
 */

public class CreateEnvironmentRequestMarshaller implements
        Marshaller<Request<CreateEnvironmentRequest>, CreateEnvironmentRequest> {

    public Request<CreateEnvironmentRequest> marshall(
            CreateEnvironmentRequest createEnvironmentRequest) {

        if (createEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateEnvironmentRequest> request = new DefaultRequest<CreateEnvironmentRequest>(
                createEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateEnvironment");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createEnvironmentRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils
                    .fromString(createEnvironmentRequest.getApplicationName()));
        }

        if (createEnvironmentRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils
                    .fromString(createEnvironmentRequest.getEnvironmentName()));
        }

        if (createEnvironmentRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils
                    .fromString(createEnvironmentRequest.getGroupName()));
        }

        if (createEnvironmentRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils
                    .fromString(createEnvironmentRequest.getDescription()));
        }

        if (createEnvironmentRequest.getCNAMEPrefix() != null) {
            request.addParameter("CNAMEPrefix", StringUtils
                    .fromString(createEnvironmentRequest.getCNAMEPrefix()));
        }

        EnvironmentTier tier = createEnvironmentRequest.getTier();
        if (tier != null) {

            if (tier.getName() != null) {
                request.addParameter("Tier.Name",
                        StringUtils.fromString(tier.getName()));
            }

            if (tier.getType() != null) {
                request.addParameter("Tier.Type",
                        StringUtils.fromString(tier.getType()));
            }

            if (tier.getVersion() != null) {
                request.addParameter("Tier.Version",
                        StringUtils.fromString(tier.getVersion()));
            }
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createEnvironmentRequest
                .getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex
                            + ".Key",
                            StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex
                            + ".Value",
                            StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        if (createEnvironmentRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils
                    .fromString(createEnvironmentRequest.getVersionLabel()));
        }

        if (createEnvironmentRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils
                    .fromString(createEnvironmentRequest.getTemplateName()));
        }

        if (createEnvironmentRequest.getSolutionStackName() != null) {
            request.addParameter("SolutionStackName",
                    StringUtils.fromString(createEnvironmentRequest
                            .getSolutionStackName()));
        }

        com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettingsList = (com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>) createEnvironmentRequest
                .getOptionSettings();
        if (!optionSettingsList.isEmpty()
                || !optionSettingsList.isAutoConstruct()) {
            int optionSettingsListIndex = 1;

            for (ConfigurationOptionSetting optionSettingsListValue : optionSettingsList) {

                if (optionSettingsListValue.getResourceName() != null) {
                    request.addParameter("OptionSettings.member."
                            + optionSettingsListIndex + ".ResourceName",
                            StringUtils.fromString(optionSettingsListValue
                                    .getResourceName()));
                }

                if (optionSettingsListValue.getNamespace() != null) {
                    request.addParameter("OptionSettings.member."
                            + optionSettingsListIndex + ".Namespace",
                            StringUtils.fromString(optionSettingsListValue
                                    .getNamespace()));
                }

                if (optionSettingsListValue.getOptionName() != null) {
                    request.addParameter("OptionSettings.member."
                            + optionSettingsListIndex + ".OptionName",
                            StringUtils.fromString(optionSettingsListValue
                                    .getOptionName()));
                }

                if (optionSettingsListValue.getValue() != null) {
                    request.addParameter("OptionSettings.member."
                            + optionSettingsListIndex + ".Value", StringUtils
                            .fromString(optionSettingsListValue.getValue()));
                }
                optionSettingsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<OptionSpecification> optionsToRemoveList = (com.amazonaws.internal.SdkInternalList<OptionSpecification>) createEnvironmentRequest
                .getOptionsToRemove();
        if (!optionsToRemoveList.isEmpty()
                || !optionsToRemoveList.isAutoConstruct()) {
            int optionsToRemoveListIndex = 1;

            for (OptionSpecification optionsToRemoveListValue : optionsToRemoveList) {

                if (optionsToRemoveListValue.getResourceName() != null) {
                    request.addParameter("OptionsToRemove.member."
                            + optionsToRemoveListIndex + ".ResourceName",
                            StringUtils.fromString(optionsToRemoveListValue
                                    .getResourceName()));
                }

                if (optionsToRemoveListValue.getNamespace() != null) {
                    request.addParameter("OptionsToRemove.member."
                            + optionsToRemoveListIndex + ".Namespace",
                            StringUtils.fromString(optionsToRemoveListValue
                                    .getNamespace()));
                }

                if (optionsToRemoveListValue.getOptionName() != null) {
                    request.addParameter("OptionsToRemove.member."
                            + optionsToRemoveListIndex + ".OptionName",
                            StringUtils.fromString(optionsToRemoveListValue
                                    .getOptionName()));
                }
                optionsToRemoveListIndex++;
            }
        }

        return request;
    }

}
