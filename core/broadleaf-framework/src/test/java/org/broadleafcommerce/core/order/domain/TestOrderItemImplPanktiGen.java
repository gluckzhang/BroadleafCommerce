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
package org.broadleafcommerce.core.order.domain;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestOrderItemImplPanktiGen {
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
    public void testIsChildOrderItem1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem1-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem2-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem3-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem4-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem5-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem6-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem7-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem8-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem9-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem10-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem11-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem12-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem13-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem14-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem15-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem16-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem17-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem18-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem19-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem20-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem21-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem22-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem23-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem24-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem25-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem26-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem27-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem28-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem29-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }

    @Test
    public void testIsChildOrderItem30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderItemImpl.isChildOrderItem30-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.DiscreteOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.isChildOrderItem());
    }
}