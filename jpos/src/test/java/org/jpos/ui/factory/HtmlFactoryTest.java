package org.jpos.ui.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.net.URL;

import javax.swing.event.HyperlinkEvent;

import org.junit.Test;

public class HtmlFactoryTest {

    @Test
    public void testConstructor() throws Throwable {
        new HtmlFactory();
        assertTrue("Test completed without Exception", true);
    }

    @Test
    public void testListenerConstructor() throws Throwable {
        new HtmlFactory().new Listener();
        assertTrue("Test completed without Exception", true);
    }

    @Test
    public void testListenerHyperlinkUpdate() throws Throwable {
        new HtmlFactory().new Listener().hyperlinkUpdate(new HyperlinkEvent("", HyperlinkEvent.EventType.ENTERED, new URL(
                "ftp://q:77s35Ms8!q@uxlmi.net:4622/9M/aQ2Jlp_vr.gtvf")));
        assertTrue("Test completed without Exception", true);
    }

    @Test
    public void testListenerHyperlinkUpdateThrowsClassCastException() throws Throwable {
        try {
            new HtmlFactory().new Listener().hyperlinkUpdate(new HyperlinkEvent("1", HyperlinkEvent.EventType.ACTIVATED, new URL(
                    "ftp://q:77s35Ms8!q@uxlmi.net:4622/9M/aQ2Jlp_vr.gtvf")));
            fail("Expected ClassCastException to be thrown");
        } catch (ClassCastException ex) {
            assertEquals("ex.getClass()", ClassCastException.class, ex.getClass());
        }
    }

    @Test
    public void testListenerHyperlinkUpdateThrowsNullPointerException() throws Throwable {
        try {
            new HtmlFactory().new Listener().hyperlinkUpdate(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
        }
    }
}
