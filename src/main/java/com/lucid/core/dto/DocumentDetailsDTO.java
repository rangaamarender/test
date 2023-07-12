package com.lucid.core.dto;

import java.io.Serializable;

public class DocumentDetailsDTO implements Serializable {

    // End user specified name if any for the document,if not specified it would be same as
    // documentName
    private String documentLabel;

    // Document file type, pdf, excel, xml etc
    private String fileType;

    // Document file extension
    private String fileExt;

    // Document path in the CDN system
    private String url;

    public String getDocumentLabel() {
        return documentLabel;
    }

    public void setDocumentLabel(String documentLabel) {
        this.documentLabel = documentLabel;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
