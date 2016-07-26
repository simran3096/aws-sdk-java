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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a get pipeline state action.
 * </p>
 */
public class GetPipelineStateRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline about which you want to get information.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name of the pipeline about which you want to get information.
     * </p>
     * 
     * @param name
     *        The name of the pipeline about which you want to get information.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline about which you want to get information.
     * </p>
     * 
     * @return The name of the pipeline about which you want to get information.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline about which you want to get information.
     * </p>
     * 
     * @param name
     *        The name of the pipeline about which you want to get information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetPipelineStateRequest withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineStateRequest == false)
            return false;
        GetPipelineStateRequest other = (GetPipelineStateRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineStateRequest clone() {
        return (GetPipelineStateRequest) super.clone();
    }
}
