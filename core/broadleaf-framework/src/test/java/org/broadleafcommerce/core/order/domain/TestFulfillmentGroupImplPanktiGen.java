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