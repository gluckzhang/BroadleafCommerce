/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2021 Broadleaf Commerce
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
package org.broadleafcommerce.core.offer.service.discount;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestOrderItemPriceComparatorPanktiGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObject(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObject(File serializedObjectFile) throws Exception {
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    @Test
    public void testCompare1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare1-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare2-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare3-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare4-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare5-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare6-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare7-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare8-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare9-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare10-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare11-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare12-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare13-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare14-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare15-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare16-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare17-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare18-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare19-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare20-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare21-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare22-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare23-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare24-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare25-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare26-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare27-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare28-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare29-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare30-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare31-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare32-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare33-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(1, receivingObject.compare(paramObject1, paramObject2));
    }

    @Test
    public void testCompare34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "</org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator>";
        org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.OrderItemPriceComparator.compare34-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject1 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[0];
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem paramObject2 = (org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItem) paramObjects[1];
        Assert.assertEquals(-1, receivingObject.compare(paramObject1, paramObject2));
    }
}