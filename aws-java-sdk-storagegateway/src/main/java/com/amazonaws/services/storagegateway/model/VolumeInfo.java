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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a storage volume object.
 * </p>
 */
public class VolumeInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     */
    private String volumeId;

    private String gatewayARN;
    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     */
    private String gatewayId;

    private String volumeType;
    /**
     * <p>
     * The size, in bytes, of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     */
    private Long volumeSizeInBytes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) for the storage volume. For
     *        example, the following is a valid ARN:</p>
     *        <p>
     *        <code>arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *        </p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the storage volume. For
     *         example, the following is a valid ARN:</p>
     *         <p>
     *         <code>arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *         </p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) for the storage volume. For
     *        example, the following is a valid ARN:</p>
     *        <p>
     *        <code>arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *        </p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeInfo withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param volumeId
     *        The unique identifier assigned to the volume. This ID becomes part
     *        of the volume Amazon Resource Name (ARN), which you use as input
     *        for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @return The unique identifier assigned to the volume. This ID becomes
     *         part of the volume Amazon Resource Name (ARN), which you use as
     *         input for other operations.</p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param volumeId
     *        The unique identifier assigned to the volume. This ID becomes part
     *        of the volume Amazon Resource Name (ARN), which you use as input
     *        for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeInfo withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation.
     *        This ID becomes part of the gateway Amazon Resource Name (ARN),
     *        which you use as input for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @return The unique identifier assigned to your gateway during activation.
     *         This ID becomes part of the gateway Amazon Resource Name (ARN),
     *         which you use as input for other operations.</p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation.
     *        This ID becomes part of the gateway Amazon Resource Name (ARN),
     *        which you use as input for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeInfo withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * @param volumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * @return
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * @param volumeType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeInfo withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size, in bytes, of the volume.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     */

    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @return The size, in bytes, of the volume.</p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     */

    public Long getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size, in bytes, of the volume.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *        and hyphens (-).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeInfo withVolumeSizeInBytes(Long volumeSizeInBytes) {
        setVolumeSizeInBytes(volumeSizeInBytes);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeInfo == false)
            return false;
        VolumeInfo other = (VolumeInfo) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null
                && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null
                ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null
                && other.getVolumeSizeInBytes().equals(
                        this.getVolumeSizeInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeSizeInBytes() == null) ? 0
                        : getVolumeSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public VolumeInfo clone() {
        try {
            return (VolumeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
