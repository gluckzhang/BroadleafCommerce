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
package org.broadleafcommerce.core.order.domain;
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
public class TestOrderImplPanktiGen {
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
    public void testFinalizeItemPrices1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testGetHasOrderAdjustments1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }

    @Test
    public void testGetHasOrderAdjustments2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }

    @Test
    public void testGetHasOrderAdjustments3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }

    @Test
    public void testGetHasOrderAdjustments4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }

    @Test
    public void testGetHasOrderAdjustments5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }

    @Test
    public void testGetHasOrderAdjustments6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }
}