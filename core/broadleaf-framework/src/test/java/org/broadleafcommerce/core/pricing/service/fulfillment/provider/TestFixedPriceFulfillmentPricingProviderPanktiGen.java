/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2020 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.core.pricing.service.fulfillment.provider;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestFixedPriceFulfillmentPricingProviderPanktiGen {
    static XStream xStream = new XStream();

    @BeforeClass
    public static void setupConverters() {
        xStream.registerConverter(new Converter() {
            @Override
            public void marshal(Object o, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
            }

            @Override
            public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
                return null;
            }

            @Override
            public boolean canConvert(Class aClass) {
                return aClass.getCanonicalName().equals("java.sql.Timestamp");
            }
        });
    }

    @Test
    public void testCanCalculateCostForFulfillmentGroup1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider/>";
        org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider receivingObject = (org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider) xStream.fromXML(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider.canCalculateCostForFulfillmentGroup1-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsObjectStr = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.FulfillmentGroup paramObject1 = (org.broadleafcommerce.core.order.domain.FulfillmentGroup) paramObjects[0];
        org.broadleafcommerce.core.order.domain.FulfillmentOption paramObject2 = (org.broadleafcommerce.core.order.domain.FulfillmentOption) paramObjects[1];
        Assert.assertEquals(true, receivingObject.canCalculateCostForFulfillmentGroup(paramObject1, paramObject2));
    }

    @Test
    public void testCanCalculateCostForFulfillmentGroup2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider/>";
        org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider receivingObject = (org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider) xStream.fromXML(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider.canCalculateCostForFulfillmentGroup2-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsObjectStr = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.FulfillmentGroup paramObject1 = (org.broadleafcommerce.core.order.domain.FulfillmentGroup) paramObjects[0];
        org.broadleafcommerce.core.order.domain.FulfillmentOption paramObject2 = (org.broadleafcommerce.core.order.domain.FulfillmentOption) paramObjects[1];
        Assert.assertEquals(true, receivingObject.canCalculateCostForFulfillmentGroup(paramObject1, paramObject2));
    }
}