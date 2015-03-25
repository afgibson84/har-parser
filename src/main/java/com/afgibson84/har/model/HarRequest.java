package com.afgibson84.har.model;


public class HarRequest {
    private String method;
    private String url;
    private String httpVersion;
    //private List<HarHeader> headers;
    //private List<HarQueryParam> queryString;
    //private List<HarCookie> cookies;
    private Long headersSize;
    private Long bodySize;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHttpVersion() {
        return httpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    public Long getHeadersSize() {
        return headersSize;
    }

    public void setHeadersSize(Long headersSize) {
        this.headersSize = headersSize;
    }

    public Long getBodySize() {
        return bodySize;
    }

    public void setBodySize(Long bodySize) {
        this.bodySize = bodySize;
    }
}
