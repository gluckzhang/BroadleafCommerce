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
public class TestFulfillmentGroupImplPanktiGen {
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
    public void testGetSaleFulfillmentPrice1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl.getSaleFulfillmentPrice1-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getSaleFulfillmentPrice());
    }

    @Test
    public void testGetSaleFulfillmentPrice2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl.getSaleFulfillmentPrice2-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getSaleFulfillmentPrice());
    }

    @Test
    public void testGetSaleFulfillmentPrice3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl.getSaleFulfillmentPrice3-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getSaleFulfillmentPrice());
    }

    @Test
    public void testGetSaleFulfillmentPrice4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl.getSaleFulfillmentPrice4-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getSaleFulfillmentPrice());
    }

    @Test
    public void testGetSaleFulfillmentPrice5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl.getSaleFulfillmentPrice5-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getSaleFulfillmentPrice());
    }

    @Test
    public void testGetSaleFulfillmentPrice6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl.getSaleFulfillmentPrice6-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getSaleFulfillmentPrice());
    }

    @Test
    public void testGetSaleFulfillmentPrice7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl.getSaleFulfillmentPrice7-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getSaleFulfillmentPrice());
    }
}