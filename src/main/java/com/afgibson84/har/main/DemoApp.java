package com.afgibson84.har.main;

import com.afgibson84.har.model.Har;
import com.afgibson84.har.parser.HarParser;
import com.afgibson84.har.parser.HarParserUtil;

/**
 * Demo class to show examples
 */
public class DemoApp {
    public static final void main(String [] args){
        String path = "www.google.com.har";

        Har har = HarParser.parserHarFromFile(path);
        int entryCount = HarParserUtil.getEntryCount(har);

        for (int i=0; i < entryCount; i++) {
            String url = HarParserUtil.getEntryRequestUrl(i, har);
            String text = HarParserUtil.getEntryResponseText(i, har);
            System.out.println(url);
            System.out.println(text);
        }


    }
}
