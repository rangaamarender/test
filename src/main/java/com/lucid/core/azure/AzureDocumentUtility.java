package com.lucid.core.azure;

import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.specialized.BlockBlobClient;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component(AzureDocumentUtility.UTILITY_NAME)
public class AzureDocumentUtility {

    public static final String UTILITY_NAME="documentUtility";

   // @Autowired
    private BlobServiceClient blobServiceClient;

    public String uploadDocument(String azureContainerName, MultipartFile document) throws Exception{
        if (document != null && !document.isEmpty()) {
            //upload document in Azure Blob Storage
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
            String timestamp = LocalDateTime.now().format(formatter);
            String originalFileName = document.getOriginalFilename();
            // Get the file extension
            String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
            String fileNameWithoutExtension = originalFileName.substring(0, originalFileName.lastIndexOf("."));
            // Create the new file name with timestamp appended
            String newFileName = fileNameWithoutExtension + "_" + timestamp + fileExtension;
            try {
            BlockBlobClient blobClient = blobServiceClient.getBlobContainerClient(azureContainerName)
                    .getBlobClient(newFileName)
                    .getBlockBlobClient();
           blobClient.upload(document.getInputStream(), document.getSize());
            return blobClient.getBlobUrl();
            }
            catch (Exception e){
                throw e;
            }
        }
        throw new RuntimeException("No Document Found to upload");
    }

}
