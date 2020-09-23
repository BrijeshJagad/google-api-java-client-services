/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.healthcare.v1beta1.model;

/**
 * User signature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Signature extends com.google.api.client.json.GenericJson {

  /**
   * An image of the user's signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image image;

  /**
   * Metadata associated with the user's signature. For example, the user's name or the user's
   * title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Timestamp of the signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String signatureTime;

  /**
   * User's UUID provided by the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * An image of the user's signature.
   * @return value or {@code null} for none
   */
  public Image getImage() {
    return image;
  }

  /**
   * An image of the user's signature.
   * @param image image or {@code null} for none
   */
  public Signature setImage(Image image) {
    this.image = image;
    return this;
  }

  /**
   * Metadata associated with the user's signature. For example, the user's name or the user's
   * title.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with the user's signature. For example, the user's name or the user's
   * title.
   * @param metadata metadata or {@code null} for none
   */
  public Signature setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Timestamp of the signature.
   * @return value or {@code null} for none
   */
  public String getSignatureTime() {
    return signatureTime;
  }

  /**
   * Timestamp of the signature.
   * @param signatureTime signatureTime or {@code null} for none
   */
  public Signature setSignatureTime(String signatureTime) {
    this.signatureTime = signatureTime;
    return this;
  }

  /**
   * User's UUID provided by the client.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * User's UUID provided by the client.
   * @param userId userId or {@code null} for none
   */
  public Signature setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public Signature set(String fieldName, Object value) {
    return (Signature) super.set(fieldName, value);
  }

  @Override
  public Signature clone() {
    return (Signature) super.clone();
  }

}
