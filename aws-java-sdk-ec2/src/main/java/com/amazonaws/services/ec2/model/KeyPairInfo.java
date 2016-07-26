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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a key pair.
 * </p>
 */
public class KeyPairInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair, this is the
     * SHA-1 digest of the DER encoded private key. If you used
     * <a>ImportKeyPair</a> to provide AWS the public key, this is the MD5
     * public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     */
    private String keyFingerprint;

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @return The name of the key pair.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyPairInfo withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair, this is the
     * SHA-1 digest of the DER encoded private key. If you used
     * <a>ImportKeyPair</a> to provide AWS the public key, this is the MD5
     * public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     * 
     * @param keyFingerprint
     *        If you used <a>CreateKeyPair</a> to create the key pair, this is
     *        the SHA-1 digest of the DER encoded private key. If you used
     *        <a>ImportKeyPair</a> to provide AWS the public key, this is the
     *        MD5 public key fingerprint as specified in section 4 of RFC4716.
     */

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair, this is the
     * SHA-1 digest of the DER encoded private key. If you used
     * <a>ImportKeyPair</a> to provide AWS the public key, this is the MD5
     * public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     * 
     * @return If you used <a>CreateKeyPair</a> to create the key pair, this is
     *         the SHA-1 digest of the DER encoded private key. If you used
     *         <a>ImportKeyPair</a> to provide AWS the public key, this is the
     *         MD5 public key fingerprint as specified in section 4 of RFC4716.
     */

    public String getKeyFingerprint() {
        return this.keyFingerprint;
    }

    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair, this is the
     * SHA-1 digest of the DER encoded private key. If you used
     * <a>ImportKeyPair</a> to provide AWS the public key, this is the MD5
     * public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     * 
     * @param keyFingerprint
     *        If you used <a>CreateKeyPair</a> to create the key pair, this is
     *        the SHA-1 digest of the DER encoded private key. If you used
     *        <a>ImportKeyPair</a> to provide AWS the public key, this is the
     *        MD5 public key fingerprint as specified in section 4 of RFC4716.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyPairInfo withKeyFingerprint(String keyFingerprint) {
        setKeyFingerprint(keyFingerprint);
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
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getKeyFingerprint() != null)
            sb.append("KeyFingerprint: " + getKeyFingerprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyPairInfo == false)
            return false;
        KeyPairInfo other = (KeyPairInfo) obj;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null
                && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getKeyFingerprint() == null
                ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null
                && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint()
                        .hashCode());
        return hashCode;
    }

    @Override
    public KeyPairInfo clone() {
        try {
            return (KeyPairInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
