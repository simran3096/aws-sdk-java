/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The result from sending a message to an address.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageResult implements Serializable, Cloneable, StructuredPojo {

    /** Delivery status of message. */
    private String deliveryStatus;
    /** Downstream service status code. */
    private Integer statusCode;
    /** Status message for message delivery. */
    private String statusMessage;
    /** If token was updated as part of delivery. (This is GCM Specific) */
    private String updatedToken;

    /**
     * Delivery status of message.
     * 
     * @param deliveryStatus
     *        Delivery status of message.
     * @see DeliveryStatus
     */

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * Delivery status of message.
     * 
     * @return Delivery status of message.
     * @see DeliveryStatus
     */

    @com.fasterxml.jackson.annotation.JsonProperty("deliveryStatus")
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /**
     * Delivery status of message.
     * 
     * @param deliveryStatus
     *        Delivery status of message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public MessageResult withDeliveryStatus(String deliveryStatus) {
        setDeliveryStatus(deliveryStatus);
        return this;
    }

    /**
     * Delivery status of message.
     * 
     * @param deliveryStatus
     *        Delivery status of message.
     * @see DeliveryStatus
     */

    @com.fasterxml.jackson.annotation.JsonIgnore
    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        withDeliveryStatus(deliveryStatus);
    }

    /**
     * Delivery status of message.
     * 
     * @param deliveryStatus
     *        Delivery status of message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public MessageResult withDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus.toString();
        return this;
    }

    /**
     * Downstream service status code.
     * 
     * @param statusCode
     *        Downstream service status code.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Downstream service status code.
     * 
     * @return Downstream service status code.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * Downstream service status code.
     * 
     * @param statusCode
     *        Downstream service status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResult withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * Status message for message delivery.
     * 
     * @param statusMessage
     *        Status message for message delivery.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * Status message for message delivery.
     * 
     * @return Status message for message delivery.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * Status message for message delivery.
     * 
     * @param statusMessage
     *        Status message for message delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * If token was updated as part of delivery. (This is GCM Specific)
     * 
     * @param updatedToken
     *        If token was updated as part of delivery. (This is GCM Specific)
     */

    public void setUpdatedToken(String updatedToken) {
        this.updatedToken = updatedToken;
    }

    /**
     * If token was updated as part of delivery. (This is GCM Specific)
     * 
     * @return If token was updated as part of delivery. (This is GCM Specific)
     */

    public String getUpdatedToken() {
        return this.updatedToken;
    }

    /**
     * If token was updated as part of delivery. (This is GCM Specific)
     * 
     * @param updatedToken
     *        If token was updated as part of delivery. (This is GCM Specific)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResult withUpdatedToken(String updatedToken) {
        setUpdatedToken(updatedToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeliveryStatus() != null)
            sb.append("DeliveryStatus: ").append(getDeliveryStatus()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getUpdatedToken() != null)
            sb.append("UpdatedToken: ").append(getUpdatedToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageResult == false)
            return false;
        MessageResult other = (MessageResult) obj;
        if (other.getDeliveryStatus() == null ^ this.getDeliveryStatus() == null)
            return false;
        if (other.getDeliveryStatus() != null && other.getDeliveryStatus().equals(this.getDeliveryStatus()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getUpdatedToken() == null ^ this.getUpdatedToken() == null)
            return false;
        if (other.getUpdatedToken() != null && other.getUpdatedToken().equals(this.getUpdatedToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStatus() == null) ? 0 : getDeliveryStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getUpdatedToken() == null) ? 0 : getUpdatedToken().hashCode());
        return hashCode;
    }

    @Override
    public MessageResult clone() {
        try {
            return (MessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MessageResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
