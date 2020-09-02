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

package com.google.api.services.container.model;

/**
 * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoprovisioningNodePoolDefaults extends com.google.api.client.json.GenericJson {

  /**
   * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the
   * node pool. This should be of the form
   * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For
   * more information about protecting resources with Cloud KMS Keys please see:
   * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootDiskKmsKey;

  /**
   * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is
   * 10GB. If unspecified, the default disk size is 100GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer diskSizeGb;

  /**
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd') If unspecified, the
   * default disk type is 'pd-standard'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * Specifies the node management options for NAP created node-pools.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeManagement management;

  /**
   * Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on
   * the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset
   * the min cpu platform field pass "automatic" as field value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minCpuPlatform;

  /**
   * Scopes that are used by NAP when creating node pools.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> oauthScopes;

  /**
   * The Google Cloud Platform Service Account to be used by the node VMs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Shielded Instance options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedInstanceConfig shieldedInstanceConfig;

  /**
   * Specifies the upgrade settings for NAP created node pools
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpgradeSettings upgradeSettings;

  /**
   * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the
   * node pool. This should be of the form
   * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For
   * more information about protecting resources with Cloud KMS Keys please see:
   * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
   * @return value or {@code null} for none
   */
  public java.lang.String getBootDiskKmsKey() {
    return bootDiskKmsKey;
  }

  /**
   * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the
   * node pool. This should be of the form
   * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For
   * more information about protecting resources with Cloud KMS Keys please see:
   * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
   * @param bootDiskKmsKey bootDiskKmsKey or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setBootDiskKmsKey(java.lang.String bootDiskKmsKey) {
    this.bootDiskKmsKey = bootDiskKmsKey;
    return this;
  }

  /**
   * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is
   * 10GB. If unspecified, the default disk size is 100GB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is
   * 10GB. If unspecified, the default disk size is 100GB.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setDiskSizeGb(java.lang.Integer diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd') If unspecified, the
   * default disk type is 'pd-standard'
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd') If unspecified, the
   * default disk type is 'pd-standard'
   * @param diskType diskType or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * Specifies the node management options for NAP created node-pools.
   * @return value or {@code null} for none
   */
  public NodeManagement getManagement() {
    return management;
  }

  /**
   * Specifies the node management options for NAP created node-pools.
   * @param management management or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setManagement(NodeManagement management) {
    this.management = management;
    return this;
  }

  /**
   * Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on
   * the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset
   * the min cpu platform field pass "automatic" as field value.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinCpuPlatform() {
    return minCpuPlatform;
  }

  /**
   * Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on
   * the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset
   * the min cpu platform field pass "automatic" as field value.
   * @param minCpuPlatform minCpuPlatform or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setMinCpuPlatform(java.lang.String minCpuPlatform) {
    this.minCpuPlatform = minCpuPlatform;
    return this;
  }

  /**
   * Scopes that are used by NAP when creating node pools.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOauthScopes() {
    return oauthScopes;
  }

  /**
   * Scopes that are used by NAP when creating node pools.
   * @param oauthScopes oauthScopes or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setOauthScopes(java.util.List<java.lang.String> oauthScopes) {
    this.oauthScopes = oauthScopes;
    return this;
  }

  /**
   * The Google Cloud Platform Service Account to be used by the node VMs.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The Google Cloud Platform Service Account to be used by the node VMs.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Shielded Instance options.
   * @return value or {@code null} for none
   */
  public ShieldedInstanceConfig getShieldedInstanceConfig() {
    return shieldedInstanceConfig;
  }

  /**
   * Shielded Instance options.
   * @param shieldedInstanceConfig shieldedInstanceConfig or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setShieldedInstanceConfig(ShieldedInstanceConfig shieldedInstanceConfig) {
    this.shieldedInstanceConfig = shieldedInstanceConfig;
    return this;
  }

  /**
   * Specifies the upgrade settings for NAP created node pools
   * @return value or {@code null} for none
   */
  public UpgradeSettings getUpgradeSettings() {
    return upgradeSettings;
  }

  /**
   * Specifies the upgrade settings for NAP created node pools
   * @param upgradeSettings upgradeSettings or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults setUpgradeSettings(UpgradeSettings upgradeSettings) {
    this.upgradeSettings = upgradeSettings;
    return this;
  }

  @Override
  public AutoprovisioningNodePoolDefaults set(String fieldName, Object value) {
    return (AutoprovisioningNodePoolDefaults) super.set(fieldName, value);
  }

  @Override
  public AutoprovisioningNodePoolDefaults clone() {
    return (AutoprovisioningNodePoolDefaults) super.clone();
  }

}
