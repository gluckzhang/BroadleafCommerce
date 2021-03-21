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
public class TestOrderImplPanktiGen {
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
    public void testFinalizeItemPrices1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices1-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices2-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices3-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices4-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices5-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices6-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices7-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices8-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices9-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices10-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices11-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices12-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices13-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices14-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices15-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices16-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices17-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices18-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices19-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices20-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices21-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices22-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices23-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices24-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices25-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices26-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices27-receiving.xml").getFile());
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }
}