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
package org.broadleafcommerce.core.offer.service.discount.domain;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestPromotableOrderItemImplPanktiGen {
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
    public void testGetCurrency1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency1-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency2-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency3-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency4-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency5-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency6-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency7-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency8-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency9-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency10-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency11-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency12-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency13-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency14-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency15-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency16-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency17-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency18-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency19-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency20-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency21-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency22-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency23-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency24-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency25-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency26-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency27-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency28-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency29-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency30-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency31-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency32-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency33-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency34-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency35-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency36-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency37-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency38-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency39-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency40() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency40-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency41-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency42-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency43() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency43-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency44-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency45() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency45-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency46-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency47-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency48-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency49() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency49-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency50() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency50-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency51() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency51-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency52() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency52-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency53() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency53-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency54() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency54-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency55() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency55-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency56() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency56-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency57() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency57-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency58() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency58-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency59() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency59-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency60() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency60-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency61() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency61-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency62() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency62-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency63() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency63-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency64() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency64-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency65() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency65-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency66() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency66-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency67() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency67-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency68() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency68-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency69() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency69-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency70() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency70-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency71() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency71-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency72() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency72-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency73() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency73-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency74() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency74-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency75() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency75-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency76() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency76-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency77() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency77-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency78() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency78-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency79() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency79-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency80() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency80-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency81() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency81-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency82() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency82-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency83() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency83-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency84() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency84-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency85() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency85-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency86() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency86-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency87() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency87-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency88() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency88-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency89() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency89-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency90() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency90-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency91() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency91-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency92() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency92-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency93() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency93-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency94() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency94-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency95() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency95-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency96() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency96-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency97() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency97-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency98() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency98-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency99() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency99-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency100() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency100-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency101() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency101-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency102() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency102-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency103() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency103-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency104() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency104-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency105() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency105-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency106() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency106-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency107() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency107-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency108() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency108-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency109() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency109-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency110() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency110-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency111() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency111-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency112() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency112-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency113() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency113-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency114() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency114-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency115() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency115-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency116() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency116-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency117() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency117-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency118() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency118-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency119() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency119-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency120() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency120-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency121() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency121-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency122() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency122-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency123() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency123-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency124() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency124-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency125() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency125-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency126() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency126-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency127() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency127-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency128() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency128-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency129() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency129-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency130() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency130-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency131() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency131-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency132() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency132-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency133() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency133-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency134() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency134-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency135() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency135-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency136() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency136-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency137() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency137-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency138() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency138-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency139() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency139-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency140() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency140-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency141() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency141-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency142() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency142-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency143() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency143-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency144() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency144-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency145() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency145-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency146() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency146-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency147() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency147-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency148() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency148-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency149() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency149-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency150() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency150-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency151() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency151-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency152() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency152-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency153() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency153-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency154() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency154-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency155() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency155-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency156() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency156-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency157() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency157-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency158() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency158-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency159() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency159-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency160() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency160-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency161() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency161-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency162() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency162-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency163() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency163-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency164() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency164-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency165() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency165-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency166() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency166-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency167() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency167-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency168() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency168-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency169() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency169-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency170() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency170-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency171() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency171-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency172() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency172-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency173() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency173-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency174() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency174-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency175() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency175-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency176() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency176-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency177() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency177-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency178() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency178-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency179() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency179-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency180() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency180-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency181() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency181-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency182() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency182-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency183() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency183-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency184() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency184-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency185() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency185-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency186() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency186-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency187() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency187-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency188() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency188-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency189() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency189-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency190() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency190-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency191() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency191-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency192() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency192-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency193() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency193-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency194() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency194-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency195() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency195-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency196() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency196-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency197() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency197-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency198() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency198-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency199() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency199-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency200() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency200-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency201() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency201-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency202() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency202-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency203() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency203-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency204() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency204-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency205() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency205-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency206() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency206-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency207() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency207-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency208() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl.getCurrency208-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableOrderItemImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }
}