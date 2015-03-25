package com.afgibson84.har.main;

import com.afgibson84.har.model.Har;
import com.afgibson84.har.parser.HarParser;
import com.afgibson84.har.parser.HarParserUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 */
public class DemoAppTileServerExport {
    public static final void main(String [] args){
        String path = "Downloads/www.google.com.har";



        Har har = HarParser.parserHarFromFile(path);
        int entryCount = HarParserUtil.getEntryCount(har);

        int tileCount = 0;
        for (int i=0; i < entryCount; i++) {
            // Grab the request URL
            String url = HarParserUtil.getEntryRequestUrl(i, har);

            if (url.endsWith(".png") && url.contains("<word>")) {
                //
                String text = HarParserUtil.getEntryResponseText(i, har);
                // Converting a Base64 String into Image byte array
                byte[] imageByteArray = HarParserUtil.decodeImage(text);

                if (imageByteArray != null) {


                    String outPath = "images/tiles" + removeProtocolAndDomain(url);
                    File file = new File(outPath);
                    new File(file.getParent()).mkdirs();

                    if (!file.exists()) {
                        try {
                            file.createNewFile();
                            FileOutputStream imageOutFile = new FileOutputStream(file);
                            System.out.println(url);
                            System.out.println(file.getAbsolutePath());
                            imageOutFile.write(imageByteArray);
                            imageOutFile.close();
                            tileCount++;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("SKIPPING");
                    }

                }

            }

            //System.out.println(text);
        }

        System.out.println(tileCount+" tiles created");
    }

    private static String removeProtocolAndDomain(String url){
        if (url == null)
            return null;

        try {
            URL aURL = new URL(url);
            String protocol = aURL.getProtocol();
            String authority = aURL.getAuthority();
            String returnUrl = new String(url);
            if (protocol != null)
                returnUrl = returnUrl.replaceAll(protocol+"://", "");
            if (authority != null)
                returnUrl = returnUrl.replaceAll(authority, "");

            return returnUrl;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
