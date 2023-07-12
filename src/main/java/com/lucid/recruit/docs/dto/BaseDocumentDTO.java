package com.lucid.recruit.docs.dto;

import com.lucid.core.dto.BaseDTO;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public abstract class BaseDocumentDTO extends BaseDTO {

    @NotBlank
    private String documentType;

    // Standard name given to the document name by system
    private String documentName;

    // Document code from external system like tax exempt doc #,tax # etc
    private String externalDocCode;

    // End user specified name if any for the document,if not specified it would be same as
    // documentName
    private String documentLabel;

    // Provision to create a tag for the document to group the documents
    private String documentTag;

    // Document file type, pdf, excel, xml etc
    private String fileType;

    // Document file extension
    private String fileExt;

    // Document path in the CDN system
    private String url;

    // Document source like SYSTEM (loaded), DOCSIGN etc
    private String documentSource;

    // Document is active/inactive/discarded in the system
    private Integer status;

    // Reference to the document definition ID
    private String documentDefID;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getExternalDocCode() {
        return externalDocCode;
    }

    public void setExternalDocCode(String externalDocCode) {
        this.externalDocCode = externalDocCode;
    }

    public String getDocumentLabel() {
        return documentLabel;
    }

    public void setDocumentLabel(String documentLabel) {
        this.documentLabel = documentLabel;
    }

    public String getDocumentTag() {
        return documentTag;
    }

    public void setDocumentTag(String documentTag) {
        this.documentTag = documentTag;
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

    public String getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDocumentDefID() {
        return documentDefID;
    }

    public void setDocumentDefID(String documentDefID) {
        this.documentDefID = documentDefID;
    }

}
