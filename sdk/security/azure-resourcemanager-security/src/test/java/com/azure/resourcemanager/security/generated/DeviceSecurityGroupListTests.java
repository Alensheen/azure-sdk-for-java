// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.DeviceSecurityGroupInner;
import com.azure.resourcemanager.security.models.DeviceSecurityGroupList;
import java.util.Arrays;

public final class DeviceSecurityGroupListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeviceSecurityGroupList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"thresholdRules\":[],\"timeWindowRules\":[],\"allowlistRules\":[],\"denylistRules\":[]},\"id\":\"jkcpr\",\"name\":\"nwbxgjvtbvpyssz\",\"type\":\"nruj\"},{\"properties\":{\"thresholdRules\":[],\"timeWindowRules\":[],\"allowlistRules\":[],\"denylistRules\":[]},\"id\":\"ouqfprwz\",\"name\":\"bngui\",\"type\":\"nwui\"},{\"properties\":{\"thresholdRules\":[],\"timeWindowRules\":[],\"allowlistRules\":[],\"denylistRules\":[]},\"id\":\"fizuckyf\",\"name\":\"hr\",\"type\":\"idf\"}],\"nextLink\":\"wdzuhtymwisd\"}")
                .toObject(DeviceSecurityGroupList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeviceSecurityGroupList model =
            new DeviceSecurityGroupList()
                .withValue(
                    Arrays
                        .asList(
                            new DeviceSecurityGroupInner()
                                .withThresholdRules(Arrays.asList())
                                .withTimeWindowRules(Arrays.asList())
                                .withAllowlistRules(Arrays.asList())
                                .withDenylistRules(Arrays.asList()),
                            new DeviceSecurityGroupInner()
                                .withThresholdRules(Arrays.asList())
                                .withTimeWindowRules(Arrays.asList())
                                .withAllowlistRules(Arrays.asList())
                                .withDenylistRules(Arrays.asList()),
                            new DeviceSecurityGroupInner()
                                .withThresholdRules(Arrays.asList())
                                .withTimeWindowRules(Arrays.asList())
                                .withAllowlistRules(Arrays.asList())
                                .withDenylistRules(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(DeviceSecurityGroupList.class);
    }
}