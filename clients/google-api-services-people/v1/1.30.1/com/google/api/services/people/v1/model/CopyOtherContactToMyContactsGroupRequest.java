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

package com.google.api.services.people.v1.model;

/**
 * A request to copy an "Other contact" to my contacts group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CopyOtherContactToMyContactsGroupRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. A field mask to restrict which fields are copied into the new contact. Valid values
   * are: * emailAddresses * names * phoneNumbers
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String copyMask;

  /**
   * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can
   * be specified by separating them with commas. Defaults to the copy mask with metadata and
   * membership fields if not set. Valid values are: * addresses * ageRanges * biographies *
   * birthdays * calendarUrls * coverPhotos * emailAddresses * events * externalIds * genders *
   * imClients * interests * locales * memberships * metadata * names * nicknames * occupations *
   * organizations * phoneNumbers * photos * relations * residences * sipAddresses * skills * urls *
   * userDefined
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readMask;

  /**
   * Optional. A mask of what source types to return. Defaults to ReadSourceType.CONTACT and
   * ReadSourceType.PROFILE if not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sources;

  /**
   * Required. A field mask to restrict which fields are copied into the new contact. Valid values
   * are: * emailAddresses * names * phoneNumbers
   * @return value or {@code null} for none
   */
  public String getCopyMask() {
    return copyMask;
  }

  /**
   * Required. A field mask to restrict which fields are copied into the new contact. Valid values
   * are: * emailAddresses * names * phoneNumbers
   * @param copyMask copyMask or {@code null} for none
   */
  public CopyOtherContactToMyContactsGroupRequest setCopyMask(String copyMask) {
    this.copyMask = copyMask;
    return this;
  }

  /**
   * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can
   * be specified by separating them with commas. Defaults to the copy mask with metadata and
   * membership fields if not set. Valid values are: * addresses * ageRanges * biographies *
   * birthdays * calendarUrls * coverPhotos * emailAddresses * events * externalIds * genders *
   * imClients * interests * locales * memberships * metadata * names * nicknames * occupations *
   * organizations * phoneNumbers * photos * relations * residences * sipAddresses * skills * urls *
   * userDefined
   * @return value or {@code null} for none
   */
  public String getReadMask() {
    return readMask;
  }

  /**
   * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can
   * be specified by separating them with commas. Defaults to the copy mask with metadata and
   * membership fields if not set. Valid values are: * addresses * ageRanges * biographies *
   * birthdays * calendarUrls * coverPhotos * emailAddresses * events * externalIds * genders *
   * imClients * interests * locales * memberships * metadata * names * nicknames * occupations *
   * organizations * phoneNumbers * photos * relations * residences * sipAddresses * skills * urls *
   * userDefined
   * @param readMask readMask or {@code null} for none
   */
  public CopyOtherContactToMyContactsGroupRequest setReadMask(String readMask) {
    this.readMask = readMask;
    return this;
  }

  /**
   * Optional. A mask of what source types to return. Defaults to ReadSourceType.CONTACT and
   * ReadSourceType.PROFILE if not set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSources() {
    return sources;
  }

  /**
   * Optional. A mask of what source types to return. Defaults to ReadSourceType.CONTACT and
   * ReadSourceType.PROFILE if not set.
   * @param sources sources or {@code null} for none
   */
  public CopyOtherContactToMyContactsGroupRequest setSources(java.util.List<java.lang.String> sources) {
    this.sources = sources;
    return this;
  }

  @Override
  public CopyOtherContactToMyContactsGroupRequest set(String fieldName, Object value) {
    return (CopyOtherContactToMyContactsGroupRequest) super.set(fieldName, value);
  }

  @Override
  public CopyOtherContactToMyContactsGroupRequest clone() {
    return (CopyOtherContactToMyContactsGroupRequest) super.clone();
  }

}
