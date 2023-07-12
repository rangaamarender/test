package com.lucid.core.azure;

import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureBlobServiceClientConfig {

    //@Value("${azure.storage.connection-string}")
    private String azureConnectionString;
    public BlobServiceClient createServiceClient(){
        return new BlobServiceClientBuilder().connectionString(azureConnectionString).buildClient();
    }
}
