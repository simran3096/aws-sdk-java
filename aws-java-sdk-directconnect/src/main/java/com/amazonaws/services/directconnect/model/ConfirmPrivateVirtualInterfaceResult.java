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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response received when ConfirmPrivateVirtualInterface is called.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPrivateVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmPrivateVirtualInterfaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String virtualInterfaceState;

    /**
     * @param virtualInterfaceState
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }

    /**
     * @return
     * @see VirtualInterfaceState
     */

    @com.fasterxml.jackson.annotation.JsonProperty("virtualInterfaceState")
    public String getVirtualInterfaceState() {
        return this.virtualInterfaceState;
    }

    /**
     * @param virtualInterfaceState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public ConfirmPrivateVirtualInterfaceResult withVirtualInterfaceState(String virtualInterfaceState) {
        setVirtualInterfaceState(virtualInterfaceState);
        return this;
    }

    /**
     * @param virtualInterfaceState
     * @see VirtualInterfaceState
     */

    @com.fasterxml.jackson.annotation.JsonIgnore
    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        withVirtualInterfaceState(virtualInterfaceState);
    }

    /**
     * @param virtualInterfaceState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public ConfirmPrivateVirtualInterfaceResult withVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
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
        if (getVirtualInterfaceState() != null)
            sb.append("VirtualInterfaceState: ").append(getVirtualInterfaceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmPrivateVirtualInterfaceResult == false)
            return false;
        ConfirmPrivateVirtualInterfaceResult other = (ConfirmPrivateVirtualInterfaceResult) obj;
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null)
            return false;
        if (other.getVirtualInterfaceState() != null && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmPrivateVirtualInterfaceResult clone() {
        try {
            return (ConfirmPrivateVirtualInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
