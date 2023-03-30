// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.TagRuleUpdatePropertiesInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TagRuleUpdatePropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagRuleUpdatePropertiesInner model =
            BinaryData
                .fromString(
                    "{\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Enabled\",\"filteringTags\":[{\"name\":\"ljkyqxjvuuj\",\"value\":\"idokgjlj\",\"action\":\"Include\"},{\"name\":\"vcltbgsncgh\",\"value\":\"esz\",\"action\":\"Exclude\"}]},\"metricRules\":{\"sendMetrics\":\"Disabled\",\"filteringTags\":[{\"name\":\"vgxbfs\",\"value\":\"nehmpvecx\",\"action\":\"Exclude\"},{\"name\":\"bfqkkr\",\"value\":\"pukgriwflzlfb\",\"action\":\"Include\"},{\"name\":\"zycispn\",\"value\":\"ahmgkbrp\",\"action\":\"Include\"}],\"userEmail\":\"ibnuqqkpik\"}}")
                .toObject(TagRuleUpdatePropertiesInner.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.ENABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals("ljkyqxjvuuj", model.logRules().filteringTags().get(0).name());
        Assertions.assertEquals("idokgjlj", model.logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.INCLUDE, model.logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("vgxbfs", model.metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("nehmpvecx", model.metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("ibnuqqkpik", model.metricRules().userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagRuleUpdatePropertiesInner model =
            new TagRuleUpdatePropertiesInner()
                .withLogRules(
                    new LogRules()
                        .withSendAadLogs(SendAadLogsStatus.DISABLED)
                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                        .withSendActivityLogs(SendActivityLogsStatus.ENABLED)
                        .withFilteringTags(
                            Arrays
                                .asList(
                                    new FilteringTag()
                                        .withName("ljkyqxjvuuj")
                                        .withValue("idokgjlj")
                                        .withAction(TagAction.INCLUDE),
                                    new FilteringTag()
                                        .withName("vcltbgsncgh")
                                        .withValue("esz")
                                        .withAction(TagAction.EXCLUDE))))
                .withMetricRules(
                    new MetricRulesInner()
                        .withSendMetrics(SendMetricsStatus.DISABLED)
                        .withFilteringTags(
                            Arrays
                                .asList(
                                    new FilteringTag()
                                        .withName("vgxbfs")
                                        .withValue("nehmpvecx")
                                        .withAction(TagAction.EXCLUDE),
                                    new FilteringTag()
                                        .withName("bfqkkr")
                                        .withValue("pukgriwflzlfb")
                                        .withAction(TagAction.INCLUDE),
                                    new FilteringTag()
                                        .withName("zycispn")
                                        .withValue("ahmgkbrp")
                                        .withAction(TagAction.INCLUDE)))
                        .withUserEmail("ibnuqqkpik"));
        model = BinaryData.fromObject(model).toObject(TagRuleUpdatePropertiesInner.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.ENABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals("ljkyqxjvuuj", model.logRules().filteringTags().get(0).name());
        Assertions.assertEquals("idokgjlj", model.logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.INCLUDE, model.logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("vgxbfs", model.metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("nehmpvecx", model.metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("ibnuqqkpik", model.metricRules().userEmail());
    }
}