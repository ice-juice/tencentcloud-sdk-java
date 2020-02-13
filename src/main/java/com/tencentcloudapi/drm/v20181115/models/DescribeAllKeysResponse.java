/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllKeysResponse extends AbstractModel{

    /**
    * 加密密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private Key [] Keys;

    /**
    * 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionKey")
    @Expose
    private String SessionKey;

    /**
    * 内容ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加密密钥列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 加密密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Key [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 加密密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 加密密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(Key [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionKey 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionKey() {
        return this.SessionKey;
    }

    /**
     * Set 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionKey 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionKey(String SessionKey) {
        this.SessionKey = SessionKey;
    }

    /**
     * Get 内容ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentId 内容ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 内容ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentId 内容ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "SessionKey", this.SessionKey);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
