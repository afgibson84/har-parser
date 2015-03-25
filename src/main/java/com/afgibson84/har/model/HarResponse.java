package com.afgibson84.har.model;

public class HarResponse {
    private int status;
    private String statusText;
    private String httpVersion;
    //private List<HarHeader> headers;
    //private List<HarCookie> cookies;
    private HarContent content;
    private String redirectURL;
    private Long headersSize;
    private Long bodySize;
    private String _transferSize;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getHttpVersion() {
        return httpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    public HarContent getContent() {
        return content;
    }

    public void setContent(HarContent content) {
        this.content = content;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
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

    public String get_transferSize() {
        return _transferSize;
    }

    public void set_transferSize(String _transferSize) {
        this._transferSize = _transferSize;
    }
}
