/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pulsar;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PulsarComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.pulsar.PulsarConfiguration getOrCreateConfiguration(PulsarComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.pulsar.PulsarConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PulsarComponent target = (PulsarComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ackgrouptimemillis":
        case "ackGroupTimeMillis": getOrCreateConfiguration(target).setAckGroupTimeMillis(property(camelContext, long.class, value)); return true;
        case "acktimeoutmillis":
        case "ackTimeoutMillis": getOrCreateConfiguration(target).setAckTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "allowmanualacknowledgement":
        case "allowManualAcknowledgement": getOrCreateConfiguration(target).setAllowManualAcknowledgement(property(camelContext, boolean.class, value)); return true;
        case "autoconfiguration":
        case "autoConfiguration": target.setAutoConfiguration(property(camelContext, org.apache.camel.component.pulsar.utils.AutoConfiguration.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batcherbuilder":
        case "batcherBuilder": getOrCreateConfiguration(target).setBatcherBuilder(property(camelContext, org.apache.pulsar.client.api.BatcherBuilder.class, value)); return true;
        case "batchingenabled":
        case "batchingEnabled": getOrCreateConfiguration(target).setBatchingEnabled(property(camelContext, boolean.class, value)); return true;
        case "batchingmaxmessages":
        case "batchingMaxMessages": getOrCreateConfiguration(target).setBatchingMaxMessages(property(camelContext, int.class, value)); return true;
        case "batchingmaxpublishdelaymicros":
        case "batchingMaxPublishDelayMicros": getOrCreateConfiguration(target).setBatchingMaxPublishDelayMicros(property(camelContext, long.class, value)); return true;
        case "blockifqueuefull":
        case "blockIfQueueFull": getOrCreateConfiguration(target).setBlockIfQueueFull(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "compressiontype":
        case "compressionType": getOrCreateConfiguration(target).setCompressionType(property(camelContext, org.apache.pulsar.client.api.CompressionType.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.pulsar.PulsarConfiguration.class, value)); return true;
        case "consumername":
        case "consumerName": getOrCreateConfiguration(target).setConsumerName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumernameprefix":
        case "consumerNamePrefix": getOrCreateConfiguration(target).setConsumerNamePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerqueuesize":
        case "consumerQueueSize": getOrCreateConfiguration(target).setConsumerQueueSize(property(camelContext, int.class, value)); return true;
        case "deadlettertopic":
        case "deadLetterTopic": getOrCreateConfiguration(target).setDeadLetterTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "initialsequenceid":
        case "initialSequenceId": getOrCreateConfiguration(target).setInitialSequenceId(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpendingmessages":
        case "maxPendingMessages": getOrCreateConfiguration(target).setMaxPendingMessages(property(camelContext, int.class, value)); return true;
        case "maxpendingmessagesacrosspartitions":
        case "maxPendingMessagesAcrossPartitions": getOrCreateConfiguration(target).setMaxPendingMessagesAcrossPartitions(property(camelContext, int.class, value)); return true;
        case "maxredelivercount":
        case "maxRedeliverCount": getOrCreateConfiguration(target).setMaxRedeliverCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "messagerouter":
        case "messageRouter": getOrCreateConfiguration(target).setMessageRouter(property(camelContext, org.apache.pulsar.client.api.MessageRouter.class, value)); return true;
        case "messageroutingmode":
        case "messageRoutingMode": getOrCreateConfiguration(target).setMessageRoutingMode(property(camelContext, org.apache.pulsar.client.api.MessageRoutingMode.class, value)); return true;
        case "negativeackredeliverydelaymicros":
        case "negativeAckRedeliveryDelayMicros": getOrCreateConfiguration(target).setNegativeAckRedeliveryDelayMicros(property(camelContext, long.class, value)); return true;
        case "numberofconsumers":
        case "numberOfConsumers": getOrCreateConfiguration(target).setNumberOfConsumers(property(camelContext, int.class, value)); return true;
        case "producername":
        case "producerName": getOrCreateConfiguration(target).setProducerName(property(camelContext, java.lang.String.class, value)); return true;
        case "pulsarclient":
        case "pulsarClient": target.setPulsarClient(property(camelContext, org.apache.pulsar.client.api.PulsarClient.class, value)); return true;
        case "pulsarmessagereceiptfactory":
        case "pulsarMessageReceiptFactory": target.setPulsarMessageReceiptFactory(property(camelContext, org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class, value)); return true;
        case "sendtimeoutms":
        case "sendTimeoutMs": getOrCreateConfiguration(target).setSendTimeoutMs(property(camelContext, int.class, value)); return true;
        case "subscriptioninitialposition":
        case "subscriptionInitialPosition": getOrCreateConfiguration(target).setSubscriptionInitialPosition(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": getOrCreateConfiguration(target).setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptiontype":
        case "subscriptionType": getOrCreateConfiguration(target).setSubscriptionType(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class, value)); return true;
        default: return false;
        }
    }

}

