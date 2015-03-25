package com.afgibson84.har.parser;

import com.afgibson84.har.model.Har;
import com.afgibson84.har.model.HarEntry;
import org.apache.commons.codec.binary.Base64;

/**

 */
public class HarParserUtil {
    public static String getEntryRequestUrl(int entryId, Har har) {
        if (har == null)
            return null;

        if (har.getLog() == null)
            return null;

        if (har.getLog().getEntries()  == null)
            return null;

        if (har.getLog().getEntries().size() <= entryId)
            return null;


        HarEntry entry = har.getLog().getEntries().get(entryId);

        if (entry.getRequest() == null)
            return null;

        return entry.getRequest().getUrl();
    }

    public static int getEntryCount(Har har) {
        if (har == null)
            return 0;

        if (har.getLog() == null)
            return 0;

        if (har.getLog().getEntries() == null)
            return 0;

        return har.getLog().getEntries().size();
    }

    public static String getEntryResponseText(int entryId, Har har) {
        if (har == null)
            return null;

        if (har.getLog() == null)
            return null;

        if (har.getLog().getEntries()  == null)
            return null;

        if (har.getLog().getEntries().size() <= entryId)
            return null;


        HarEntry entry = har.getLog().getEntries().get(entryId);

        if (entry.getResponse() == null)
            return null;

        return entry.getResponse().getContent().getText();
    }

    public static byte[] decodeImage(String imageDataString) {
        return Base64.decodeBase64(imageDataString);
    }
}
