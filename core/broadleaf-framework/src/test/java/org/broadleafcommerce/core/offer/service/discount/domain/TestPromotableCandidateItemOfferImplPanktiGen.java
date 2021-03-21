package org.broadleafcommerce.core.offer.service.discount.domain;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestPromotableCandidateItemOfferImplPanktiGen {
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
    public void testGetMinimumRequiredTargetQuantity1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity1-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity2-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity3-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity4-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity5-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity6-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity7-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity8-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity9-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity10-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity11-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity12-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity13-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity14-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity15-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity16-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity17-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity18-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity19-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity20-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity21-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity22-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity23-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity24-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity25-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity26-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity27-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity28-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity29-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity30-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity31-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity32-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity33-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity34-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity35-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity36-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity37-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity38-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity39-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity40() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity40-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity41-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity42-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity43() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity43-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity44-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity45() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity45-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity46-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity47-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity48-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity49() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity49-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity50() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity50-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity51() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity51-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity52() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity52-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity53() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity53-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity54() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity54-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity55() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity55-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity56() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity56-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity57() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity57-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity58() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity58-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity59() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity59-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity60() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity60-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity61() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity61-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity62() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity62-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity63() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity63-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity64() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity64-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity65() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity65-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity66() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity66-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity67() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity67-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity68() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity68-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity69() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity69-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity70() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity70-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity71() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity71-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity72() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity72-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity73() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity73-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity74() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity74-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity75() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity75-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity76() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity76-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity77() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity77-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity78() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity78-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity79() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity79-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity80() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity80-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity81() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity81-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity82() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity82-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity83() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity83-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity84() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity84-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity85() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity85-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity86() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity86-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity87() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity87-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity88() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity88-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity89() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity89-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity90() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity90-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity91() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity91-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity92() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity92-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity93() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity93-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity94() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity94-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity95() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity95-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity96() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity96-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity97() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity97-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity98() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity98-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity99() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity99-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity100() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity100-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity101() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity101-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity102() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity102-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity103() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity103-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity104() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity104-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity105() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity105-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity106() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity106-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity107() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity107-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity108() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity108-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity109() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity109-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity110() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity110-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity111() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity111-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity112() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity112-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity113() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity113-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity114() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity114-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity115() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity115-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity116() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity116-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity117() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity117-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity118() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity118-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity119() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity119-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testGetMinimumRequiredTargetQuantity120() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getMinimumRequiredTargetQuantity120-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.getMinimumRequiredTargetQuantity());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer1-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer2-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer3-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer4-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer5-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer6-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer7-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer8-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer9-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer10-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer11-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer12-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer13-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer14-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer15-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer16-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer17-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer18-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer19-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer20-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer21-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer22-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer23-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer24-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer25-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer26-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer27-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer28-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer29-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(2, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer30-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer31-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer32-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer33-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer34-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer35-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer36-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer37-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer38-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer39-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer40() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer40-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer41-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer42-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer43() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer43-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(1, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer44-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(2, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer45() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer45-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer46-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer47-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer48-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer49() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer49-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer50() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer50-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer51() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer51-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer52() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer52-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer53() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer53-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer54() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer54-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer55() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer55-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer56() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer56-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer57() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer57-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer58() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer58-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer59() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer59-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer60() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer60-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer61() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer61-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(2, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer62() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer62-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer63() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer63-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer64() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer64-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer65() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer65-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer66() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer66-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer67() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer67-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer68() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer68-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer69() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer69-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer70() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer70-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer71() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer71-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer72() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer72-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer73() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer73-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testCalculateTargetQuantityForTieredOffer74() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.calculateTargetQuantityForTieredOffer74-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(5, receivingObject.calculateTargetQuantityForTieredOffer());
    }

    @Test
    public void testGetWeightedPercentSaved1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved1-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>12.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved2-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>12.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved3-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>12.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved4-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>10</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved5-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>10</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved6-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>12.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved7-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>10</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved8-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>10</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved9-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>2.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved10-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>7.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved11-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>12.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved12-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>2.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved13-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>2.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }

    @Test
    public void testGetWeightedPercentSaved14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl.getWeightedPercentSaved14-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.domain.PromotableCandidateItemOfferImpl receivingObject = deserializeObject(fileReceiving);
        String returnedObjectStr = 
        "<big-decimal>2.00</big-decimal>";
        java.math.BigDecimal expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getWeightedPercentSaved());
    }
}