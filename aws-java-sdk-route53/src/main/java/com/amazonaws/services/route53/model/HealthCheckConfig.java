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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the health check configuration.
 * </p>
 */
public class HealthCheckConfig implements Serializable, Cloneable {

    /**
     * <p>
     * IP Address of the instance being checked.
     * </p>
     */
    private String iPAddress;
    /**
     * <p>
     * Port on which connection will be opened to the instance to health check.
     * For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is not
     * specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if the port
     * is not specified.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The type of health check to be performed. Currently supported types are
     * TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, CALCULATED and
     * CLOUDWATCH_METRIC.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
     * </p>
     */
    private String resourcePath;
    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     */
    private String fullyQualifiedDomainName;
    /**
     * <p>
     * A string to search for in the body of a health check response. Required
     * for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks. Amazon Route 53
     * considers case when searching for <code>SearchString</code> in the
     * response body.
     * </p>
     */
    private String searchString;
    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request.
     * </p>
     * <p>
     * Each Amazon Route 53 health checker makes requests at this interval.
     * Valid values are 10 and 30. The default value is 30.
     * </p>
     */
    private Integer requestInterval;
    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     */
    private Integer failureThreshold;
    /**
     * <p>
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions and
     * your endpoint and to display CloudWatch latency graphs in the Amazon
     * Route 53 console.
     * </p>
     */
    private Boolean measureLatency;
    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     */
    private Boolean inverted;
    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     */
    private Integer healthThreshold;
    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> childHealthChecks;
    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     */
    private Boolean enableSNI;
    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that you want Amazon
     * Route 53 to use to perform health checks for the specified endpoint. You
     * must specify at least three regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;
    /**
     * <p>
     * A complex type that contains information to uniquely identify the
     * CloudWatch alarm that you're associating with a Route 53 health check.
     * </p>
     */
    private AlarmIdentifier alarmIdentifier;
    /**
     * <p>
     * The status of the health check when CloudWatch has insufficient data
     * about the state of associated alarm. Valid values are
     * <code>Healthy</code>, <code>Unhealthy</code> and
     * <code>LastKnownStatus</code>.
     * </p>
     */
    private String insufficientDataHealthStatus;

    /**
     * <p>
     * IP Address of the instance being checked.
     * </p>
     * 
     * @param iPAddress
     *        IP Address of the instance being checked.
     */

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * IP Address of the instance being checked.
     * </p>
     * 
     * @return IP Address of the instance being checked.
     */

    public String getIPAddress() {
        return this.iPAddress;
    }

    /**
     * <p>
     * IP Address of the instance being checked.
     * </p>
     * 
     * @param iPAddress
     *        IP Address of the instance being checked.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withIPAddress(String iPAddress) {
        setIPAddress(iPAddress);
        return this;
    }

    /**
     * <p>
     * Port on which connection will be opened to the instance to health check.
     * For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is not
     * specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if the port
     * is not specified.
     * </p>
     * 
     * @param port
     *        Port on which connection will be opened to the instance to health
     *        check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port
     *        is not specified. For HTTPS and HTTPS_STR_MATCH this defaults to
     *        443 if the port is not specified.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Port on which connection will be opened to the instance to health check.
     * For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is not
     * specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if the port
     * is not specified.
     * </p>
     * 
     * @return Port on which connection will be opened to the instance to health
     *         check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the
     *         port is not specified. For HTTPS and HTTPS_STR_MATCH this
     *         defaults to 443 if the port is not specified.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Port on which connection will be opened to the instance to health check.
     * For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is not
     * specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if the port
     * is not specified.
     * </p>
     * 
     * @param port
     *        Port on which connection will be opened to the instance to health
     *        check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port
     *        is not specified. For HTTPS and HTTPS_STR_MATCH this defaults to
     *        443 if the port is not specified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The type of health check to be performed. Currently supported types are
     * TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, CALCULATED and
     * CLOUDWATCH_METRIC.
     * </p>
     * 
     * @param type
     *        The type of health check to be performed. Currently supported
     *        types are TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH,
     *        CALCULATED and CLOUDWATCH_METRIC.
     * @see HealthCheckType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of health check to be performed. Currently supported types are
     * TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, CALCULATED and
     * CLOUDWATCH_METRIC.
     * </p>
     * 
     * @return The type of health check to be performed. Currently supported
     *         types are TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH,
     *         CALCULATED and CLOUDWATCH_METRIC.
     * @see HealthCheckType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of health check to be performed. Currently supported types are
     * TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, CALCULATED and
     * CLOUDWATCH_METRIC.
     * </p>
     * 
     * @param type
     *        The type of health check to be performed. Currently supported
     *        types are TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH,
     *        CALCULATED and CLOUDWATCH_METRIC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of health check to be performed. Currently supported types are
     * TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, CALCULATED and
     * CLOUDWATCH_METRIC.
     * </p>
     * 
     * @param type
     *        The type of health check to be performed. Currently supported
     *        types are TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH,
     *        CALCULATED and CLOUDWATCH_METRIC.
     * @see HealthCheckType
     */

    public void setType(HealthCheckType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of health check to be performed. Currently supported types are
     * TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, CALCULATED and
     * CLOUDWATCH_METRIC.
     * </p>
     * 
     * @param type
     *        The type of health check to be performed. Currently supported
     *        types are TCP, HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH,
     *        CALCULATED and CLOUDWATCH_METRIC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(HealthCheckType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
     * </p>
     * 
     * @param resourcePath
     *        Path to ping on the instance to check the health. Required for
     *        HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks.
     *        The HTTP request is issued to the instance on the given port and
     *        path.
     */

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * <p>
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
     * </p>
     * 
     * @return Path to ping on the instance to check the health. Required for
     *         HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks.
     *         The HTTP request is issued to the instance on the given port and
     *         path.
     */

    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * <p>
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
     * </p>
     * 
     * @param resourcePath
     *        Path to ping on the instance to check the health. Required for
     *        HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks.
     *        The HTTP request is issued to the instance on the given port and
     *        path.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withResourcePath(String resourcePath) {
        setResourcePath(resourcePath);
        return this;
    }

    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Fully qualified domain name of the instance to be health checked.
     */

    public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     * 
     * @return Fully qualified domain name of the instance to be health checked.
     */

    public String getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Fully qualified domain name of the instance to be health checked.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withFullyQualifiedDomainName(
            String fullyQualifiedDomainName) {
        setFullyQualifiedDomainName(fullyQualifiedDomainName);
        return this;
    }

    /**
     * <p>
     * A string to search for in the body of a health check response. Required
     * for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks. Amazon Route 53
     * considers case when searching for <code>SearchString</code> in the
     * response body.
     * </p>
     * 
     * @param searchString
     *        A string to search for in the body of a health check response.
     *        Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     *        Amazon Route 53 considers case when searching for
     *        <code>SearchString</code> in the response body.
     */

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * A string to search for in the body of a health check response. Required
     * for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks. Amazon Route 53
     * considers case when searching for <code>SearchString</code> in the
     * response body.
     * </p>
     * 
     * @return A string to search for in the body of a health check response.
     *         Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     *         Amazon Route 53 considers case when searching for
     *         <code>SearchString</code> in the response body.
     */

    public String getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * A string to search for in the body of a health check response. Required
     * for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks. Amazon Route 53
     * considers case when searching for <code>SearchString</code> in the
     * response body.
     * </p>
     * 
     * @param searchString
     *        A string to search for in the body of a health check response.
     *        Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     *        Amazon Route 53 considers case when searching for
     *        <code>SearchString</code> in the response body.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withSearchString(String searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request.
     * </p>
     * <p>
     * Each Amazon Route 53 health checker makes requests at this interval.
     * Valid values are 10 and 30. The default value is 30.
     * </p>
     * 
     * @param requestInterval
     *        The number of seconds between the time that Amazon Route 53 gets a
     *        response from your endpoint and the time that it sends the next
     *        health-check request.</p>
     *        <p>
     *        Each Amazon Route 53 health checker makes requests at this
     *        interval. Valid values are 10 and 30. The default value is 30.
     */

    public void setRequestInterval(Integer requestInterval) {
        this.requestInterval = requestInterval;
    }

    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request.
     * </p>
     * <p>
     * Each Amazon Route 53 health checker makes requests at this interval.
     * Valid values are 10 and 30. The default value is 30.
     * </p>
     * 
     * @return The number of seconds between the time that Amazon Route 53 gets
     *         a response from your endpoint and the time that it sends the next
     *         health-check request.</p>
     *         <p>
     *         Each Amazon Route 53 health checker makes requests at this
     *         interval. Valid values are 10 and 30. The default value is 30.
     */

    public Integer getRequestInterval() {
        return this.requestInterval;
    }

    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request.
     * </p>
     * <p>
     * Each Amazon Route 53 health checker makes requests at this interval.
     * Valid values are 10 and 30. The default value is 30.
     * </p>
     * 
     * @param requestInterval
     *        The number of seconds between the time that Amazon Route 53 gets a
     *        response from your endpoint and the time that it sends the next
     *        health-check request.</p>
     *        <p>
     *        Each Amazon Route 53 health checker makes requests at this
     *        interval. Valid values are 10 and 30. The default value is 30.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withRequestInterval(Integer requestInterval) {
        setRequestInterval(requestInterval);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass
     *        or fail for Amazon Route 53 to change the current status of the
     *        endpoint from unhealthy to healthy or vice versa.</p>
     *        <p>
     *        Valid values are integers between 1 and 10. For more information,
     *        see
     *        "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in
     *        the Amazon Route 53 Developer Guide.
     */

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @return The number of consecutive health checks that an endpoint must
     *         pass or fail for Amazon Route 53 to change the current status of
     *         the endpoint from unhealthy to healthy or vice versa.</p>
     *         <p>
     *         Valid values are integers between 1 and 10. For more information,
     *         see
     *         "How Amazon Route 53 Determines Whether an Endpoint Is Healthy"
     *         in the Amazon Route 53 Developer Guide.
     */

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass
     *        or fail for Amazon Route 53 to change the current status of the
     *        endpoint from unhealthy to healthy or vice versa.</p>
     *        <p>
     *        Valid values are integers between 1 and 10. For more information,
     *        see
     *        "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in
     *        the Amazon Route 53 Developer Guide.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withFailureThreshold(Integer failureThreshold) {
        setFailureThreshold(failureThreshold);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions and
     * your endpoint and to display CloudWatch latency graphs in the Amazon
     * Route 53 console.
     * </p>
     * 
     * @param measureLatency
     *        A Boolean value that indicates whether you want Amazon Route 53 to
     *        measure the latency between health checkers in multiple AWS
     *        regions and your endpoint and to display CloudWatch latency graphs
     *        in the Amazon Route 53 console.
     */

    public void setMeasureLatency(Boolean measureLatency) {
        this.measureLatency = measureLatency;
    }

    /**
     * <p>
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions and
     * your endpoint and to display CloudWatch latency graphs in the Amazon
     * Route 53 console.
     * </p>
     * 
     * @return A Boolean value that indicates whether you want Amazon Route 53
     *         to measure the latency between health checkers in multiple AWS
     *         regions and your endpoint and to display CloudWatch latency
     *         graphs in the Amazon Route 53 console.
     */

    public Boolean getMeasureLatency() {
        return this.measureLatency;
    }

    /**
     * <p>
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions and
     * your endpoint and to display CloudWatch latency graphs in the Amazon
     * Route 53 console.
     * </p>
     * 
     * @param measureLatency
     *        A Boolean value that indicates whether you want Amazon Route 53 to
     *        measure the latency between health checkers in multiple AWS
     *        regions and your endpoint and to display CloudWatch latency graphs
     *        in the Amazon Route 53 console.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withMeasureLatency(Boolean measureLatency) {
        setMeasureLatency(measureLatency);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions and
     * your endpoint and to display CloudWatch latency graphs in the Amazon
     * Route 53 console.
     * </p>
     * 
     * @return A Boolean value that indicates whether you want Amazon Route 53
     *         to measure the latency between health checkers in multiple AWS
     *         regions and your endpoint and to display CloudWatch latency
     *         graphs in the Amazon Route 53 console.
     */

    public Boolean isMeasureLatency() {
        return this.measureLatency;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * 
     * @param inverted
     *        A boolean value that indicates whether the status of health check
     *        should be inverted. For example, if a health check is healthy but
     *        <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *        considers the health check to be unhealthy.
     */

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * 
     * @return A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.
     */

    public Boolean getInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * 
     * @param inverted
     *        A boolean value that indicates whether the status of health check
     *        should be inverted. For example, if a health check is healthy but
     *        <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *        considers the health check to be unhealthy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withInverted(Boolean inverted) {
        setInverted(inverted);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * 
     * @return A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.
     */

    public Boolean isInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     * 
     * @param healthThreshold
     *        The minimum number of child health checks that must be healthy for
     *        Amazon Route 53 to consider the parent health check to be healthy.
     *        Valid values are integers between 0 and 256, inclusive.
     */

    public void setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
    }

    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     * 
     * @return The minimum number of child health checks that must be healthy
     *         for Amazon Route 53 to consider the parent health check to be
     *         healthy. Valid values are integers between 0 and 256, inclusive.
     */

    public Integer getHealthThreshold() {
        return this.healthThreshold;
    }

    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     * 
     * @param healthThreshold
     *        The minimum number of child health checks that must be healthy for
     *        Amazon Route 53 to consider the parent health check to be healthy.
     *        Valid values are integers between 0 and 256, inclusive.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withHealthThreshold(Integer healthThreshold) {
        setHealthThreshold(healthThreshold);
        return this;
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * 
     * @return For a specified parent health check, a list of
     *         <code>HealthCheckId</code> values for the associated child health
     *         checks.
     */

    public java.util.List<String> getChildHealthChecks() {
        if (childHealthChecks == null) {
            childHealthChecks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return childHealthChecks;
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * 
     * @param childHealthChecks
     *        For a specified parent health check, a list of
     *        <code>HealthCheckId</code> values for the associated child health
     *        checks.
     */

    public void setChildHealthChecks(
            java.util.Collection<String> childHealthChecks) {
        if (childHealthChecks == null) {
            this.childHealthChecks = null;
            return;
        }

        this.childHealthChecks = new com.amazonaws.internal.SdkInternalList<String>(
                childHealthChecks);
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setChildHealthChecks(java.util.Collection)} or
     * {@link #withChildHealthChecks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param childHealthChecks
     *        For a specified parent health check, a list of
     *        <code>HealthCheckId</code> values for the associated child health
     *        checks.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withChildHealthChecks(String... childHealthChecks) {
        if (this.childHealthChecks == null) {
            setChildHealthChecks(new com.amazonaws.internal.SdkInternalList<String>(
                    childHealthChecks.length));
        }
        for (String ele : childHealthChecks) {
            this.childHealthChecks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * 
     * @param childHealthChecks
     *        For a specified parent health check, a list of
     *        <code>HealthCheckId</code> values for the associated child health
     *        checks.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withChildHealthChecks(
            java.util.Collection<String> childHealthChecks) {
        setChildHealthChecks(childHealthChecks);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * 
     * @param enableSNI
     *        Specify whether you want Amazon Route 53 to send the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the
     *        <code>client_hello</code> message during TLS negotiation. If you
     *        don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *        defaults to <code>true</code> when <code>Type</code> is
     *        <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults to
     *        <code>false</code> when <code>Type</code> is any other value.
     */

    public void setEnableSNI(Boolean enableSNI) {
        this.enableSNI = enableSNI;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to send the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the
     *         <code>client_hello</code> message during TLS negotiation. If you
     *         don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *         defaults to <code>true</code> when <code>Type</code> is
     *         <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults
     *         to <code>false</code> when <code>Type</code> is any other value.
     */

    public Boolean getEnableSNI() {
        return this.enableSNI;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * 
     * @param enableSNI
     *        Specify whether you want Amazon Route 53 to send the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the
     *        <code>client_hello</code> message during TLS negotiation. If you
     *        don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *        defaults to <code>true</code> when <code>Type</code> is
     *        <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults to
     *        <code>false</code> when <code>Type</code> is any other value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withEnableSNI(Boolean enableSNI) {
        setEnableSNI(enableSNI);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to send the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the
     *         <code>client_hello</code> message during TLS negotiation. If you
     *         don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *         defaults to <code>true</code> when <code>Type</code> is
     *         <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults
     *         to <code>false</code> when <code>Type</code> is any other value.
     */

    public Boolean isEnableSNI() {
        return this.enableSNI;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that you want Amazon
     * Route 53 to use to perform health checks for the specified endpoint. You
     * must specify at least three regions.
     * </p>
     * 
     * @return A list of <code>HealthCheckRegion</code> values that you want
     *         Amazon Route 53 to use to perform health checks for the specified
     *         endpoint. You must specify at least three regions.
     * @see HealthCheckRegion
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that you want Amazon
     * Route 53 to use to perform health checks for the specified endpoint. You
     * must specify at least three regions.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that you want
     *        Amazon Route 53 to use to perform health checks for the specified
     *        endpoint. You must specify at least three regions.
     * @see HealthCheckRegion
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(
                regions);
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that you want Amazon
     * Route 53 to use to perform health checks for the specified endpoint. You
     * must specify at least three regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRegions(java.util.Collection)} or
     * {@link #withRegions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that you want
     *        Amazon Route 53 to use to perform health checks for the specified
     *        endpoint. You must specify at least three regions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckConfig withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(
                    regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that you want Amazon
     * Route 53 to use to perform health checks for the specified endpoint. You
     * must specify at least three regions.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that you want
     *        Amazon Route 53 to use to perform health checks for the specified
     *        endpoint. You must specify at least three regions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckConfig withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that you want Amazon
     * Route 53 to use to perform health checks for the specified endpoint. You
     * must specify at least three regions.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that you want
     *        Amazon Route 53 to use to perform health checks for the specified
     *        endpoint. You must specify at least three regions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckConfig withRegions(HealthCheckRegion... regions) {
        com.amazonaws.internal.SdkInternalList<String> regionsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                regions.length);
        for (HealthCheckRegion value : regions) {
            regionsCopy.add(value.toString());
        }
        if (getRegions() == null) {
            setRegions(regionsCopy);
        } else {
            getRegions().addAll(regionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information to uniquely identify the
     * CloudWatch alarm that you're associating with a Route 53 health check.
     * </p>
     * 
     * @param alarmIdentifier
     *        A complex type that contains information to uniquely identify the
     *        CloudWatch alarm that you're associating with a Route 53 health
     *        check.
     */

    public void setAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
    }

    /**
     * <p>
     * A complex type that contains information to uniquely identify the
     * CloudWatch alarm that you're associating with a Route 53 health check.
     * </p>
     * 
     * @return A complex type that contains information to uniquely identify the
     *         CloudWatch alarm that you're associating with a Route 53 health
     *         check.
     */

    public AlarmIdentifier getAlarmIdentifier() {
        return this.alarmIdentifier;
    }

    /**
     * <p>
     * A complex type that contains information to uniquely identify the
     * CloudWatch alarm that you're associating with a Route 53 health check.
     * </p>
     * 
     * @param alarmIdentifier
     *        A complex type that contains information to uniquely identify the
     *        CloudWatch alarm that you're associating with a Route 53 health
     *        check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheckConfig withAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        setAlarmIdentifier(alarmIdentifier);
        return this;
    }

    /**
     * <p>
     * The status of the health check when CloudWatch has insufficient data
     * about the state of associated alarm. Valid values are
     * <code>Healthy</code>, <code>Unhealthy</code> and
     * <code>LastKnownStatus</code>.
     * </p>
     * 
     * @param insufficientDataHealthStatus
     *        The status of the health check when CloudWatch has insufficient
     *        data about the state of associated alarm. Valid values are
     *        <code>Healthy</code>, <code>Unhealthy</code> and
     *        <code>LastKnownStatus</code>.
     * @see InsufficientDataHealthStatus
     */

    public void setInsufficientDataHealthStatus(
            String insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
    }

    /**
     * <p>
     * The status of the health check when CloudWatch has insufficient data
     * about the state of associated alarm. Valid values are
     * <code>Healthy</code>, <code>Unhealthy</code> and
     * <code>LastKnownStatus</code>.
     * </p>
     * 
     * @return The status of the health check when CloudWatch has insufficient
     *         data about the state of associated alarm. Valid values are
     *         <code>Healthy</code>, <code>Unhealthy</code> and
     *         <code>LastKnownStatus</code>.
     * @see InsufficientDataHealthStatus
     */

    public String getInsufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus;
    }

    /**
     * <p>
     * The status of the health check when CloudWatch has insufficient data
     * about the state of associated alarm. Valid values are
     * <code>Healthy</code>, <code>Unhealthy</code> and
     * <code>LastKnownStatus</code>.
     * </p>
     * 
     * @param insufficientDataHealthStatus
     *        The status of the health check when CloudWatch has insufficient
     *        data about the state of associated alarm. Valid values are
     *        <code>Healthy</code>, <code>Unhealthy</code> and
     *        <code>LastKnownStatus</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InsufficientDataHealthStatus
     */

    public HealthCheckConfig withInsufficientDataHealthStatus(
            String insufficientDataHealthStatus) {
        setInsufficientDataHealthStatus(insufficientDataHealthStatus);
        return this;
    }

    /**
     * <p>
     * The status of the health check when CloudWatch has insufficient data
     * about the state of associated alarm. Valid values are
     * <code>Healthy</code>, <code>Unhealthy</code> and
     * <code>LastKnownStatus</code>.
     * </p>
     * 
     * @param insufficientDataHealthStatus
     *        The status of the health check when CloudWatch has insufficient
     *        data about the state of associated alarm. Valid values are
     *        <code>Healthy</code>, <code>Unhealthy</code> and
     *        <code>LastKnownStatus</code>.
     * @see InsufficientDataHealthStatus
     */

    public void setInsufficientDataHealthStatus(
            InsufficientDataHealthStatus insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus
                .toString();
    }

    /**
     * <p>
     * The status of the health check when CloudWatch has insufficient data
     * about the state of associated alarm. Valid values are
     * <code>Healthy</code>, <code>Unhealthy</code> and
     * <code>LastKnownStatus</code>.
     * </p>
     * 
     * @param insufficientDataHealthStatus
     *        The status of the health check when CloudWatch has insufficient
     *        data about the state of associated alarm. Valid values are
     *        <code>Healthy</code>, <code>Unhealthy</code> and
     *        <code>LastKnownStatus</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InsufficientDataHealthStatus
     */

    public HealthCheckConfig withInsufficientDataHealthStatus(
            InsufficientDataHealthStatus insufficientDataHealthStatus) {
        setInsufficientDataHealthStatus(insufficientDataHealthStatus);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIPAddress() != null)
            sb.append("IPAddress: " + getIPAddress() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getResourcePath() != null)
            sb.append("ResourcePath: " + getResourcePath() + ",");
        if (getFullyQualifiedDomainName() != null)
            sb.append("FullyQualifiedDomainName: "
                    + getFullyQualifiedDomainName() + ",");
        if (getSearchString() != null)
            sb.append("SearchString: " + getSearchString() + ",");
        if (getRequestInterval() != null)
            sb.append("RequestInterval: " + getRequestInterval() + ",");
        if (getFailureThreshold() != null)
            sb.append("FailureThreshold: " + getFailureThreshold() + ",");
        if (getMeasureLatency() != null)
            sb.append("MeasureLatency: " + getMeasureLatency() + ",");
        if (getInverted() != null)
            sb.append("Inverted: " + getInverted() + ",");
        if (getHealthThreshold() != null)
            sb.append("HealthThreshold: " + getHealthThreshold() + ",");
        if (getChildHealthChecks() != null)
            sb.append("ChildHealthChecks: " + getChildHealthChecks() + ",");
        if (getEnableSNI() != null)
            sb.append("EnableSNI: " + getEnableSNI() + ",");
        if (getRegions() != null)
            sb.append("Regions: " + getRegions() + ",");
        if (getAlarmIdentifier() != null)
            sb.append("AlarmIdentifier: " + getAlarmIdentifier() + ",");
        if (getInsufficientDataHealthStatus() != null)
            sb.append("InsufficientDataHealthStatus: "
                    + getInsufficientDataHealthStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckConfig == false)
            return false;
        HealthCheckConfig other = (HealthCheckConfig) obj;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null
                && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null
                && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourcePath() == null ^ this.getResourcePath() == null)
            return false;
        if (other.getResourcePath() != null
                && other.getResourcePath().equals(this.getResourcePath()) == false)
            return false;
        if (other.getFullyQualifiedDomainName() == null
                ^ this.getFullyQualifiedDomainName() == null)
            return false;
        if (other.getFullyQualifiedDomainName() != null
                && other.getFullyQualifiedDomainName().equals(
                        this.getFullyQualifiedDomainName()) == false)
            return false;
        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null
                && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getRequestInterval() == null
                ^ this.getRequestInterval() == null)
            return false;
        if (other.getRequestInterval() != null
                && other.getRequestInterval().equals(this.getRequestInterval()) == false)
            return false;
        if (other.getFailureThreshold() == null
                ^ this.getFailureThreshold() == null)
            return false;
        if (other.getFailureThreshold() != null
                && other.getFailureThreshold().equals(
                        this.getFailureThreshold()) == false)
            return false;
        if (other.getMeasureLatency() == null
                ^ this.getMeasureLatency() == null)
            return false;
        if (other.getMeasureLatency() != null
                && other.getMeasureLatency().equals(this.getMeasureLatency()) == false)
            return false;
        if (other.getInverted() == null ^ this.getInverted() == null)
            return false;
        if (other.getInverted() != null
                && other.getInverted().equals(this.getInverted()) == false)
            return false;
        if (other.getHealthThreshold() == null
                ^ this.getHealthThreshold() == null)
            return false;
        if (other.getHealthThreshold() != null
                && other.getHealthThreshold().equals(this.getHealthThreshold()) == false)
            return false;
        if (other.getChildHealthChecks() == null
                ^ this.getChildHealthChecks() == null)
            return false;
        if (other.getChildHealthChecks() != null
                && other.getChildHealthChecks().equals(
                        this.getChildHealthChecks()) == false)
            return false;
        if (other.getEnableSNI() == null ^ this.getEnableSNI() == null)
            return false;
        if (other.getEnableSNI() != null
                && other.getEnableSNI().equals(this.getEnableSNI()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null
                && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getAlarmIdentifier() == null
                ^ this.getAlarmIdentifier() == null)
            return false;
        if (other.getAlarmIdentifier() != null
                && other.getAlarmIdentifier().equals(this.getAlarmIdentifier()) == false)
            return false;
        if (other.getInsufficientDataHealthStatus() == null
                ^ this.getInsufficientDataHealthStatus() == null)
            return false;
        if (other.getInsufficientDataHealthStatus() != null
                && other.getInsufficientDataHealthStatus().equals(
                        this.getInsufficientDataHealthStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourcePath() == null) ? 0 : getResourcePath()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFullyQualifiedDomainName() == null) ? 0
                        : getFullyQualifiedDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSearchString() == null) ? 0 : getSearchString()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestInterval() == null) ? 0 : getRequestInterval()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFailureThreshold() == null) ? 0 : getFailureThreshold()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMeasureLatency() == null) ? 0 : getMeasureLatency()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInverted() == null) ? 0 : getInverted().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthThreshold() == null) ? 0 : getHealthThreshold()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getChildHealthChecks() == null) ? 0
                        : getChildHealthChecks().hashCode());
        hashCode = prime * hashCode
                + ((getEnableSNI() == null) ? 0 : getEnableSNI().hashCode());
        hashCode = prime * hashCode
                + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlarmIdentifier() == null) ? 0 : getAlarmIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInsufficientDataHealthStatus() == null) ? 0
                        : getInsufficientDataHealthStatus().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckConfig clone() {
        try {
            return (HealthCheckConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
