package com.lucid.recruit.org.domain;


import jakarta.validation.constraints.NotNull;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class WebAddressUtil {

    @NotNull
    public static List<String> getDomains(List<String> urls) throws URISyntaxException {
        List<String> domains = new ArrayList<>();
        for (String url : urls) {
            URI uri = new URI(url);
            String host = uri.getHost();
            String domain = host.substring(host.indexOf('.') + 1);
            domains.add(domain);
        }
        return domains;
    }

    public static void main(String[] args) throws URISyntaxException {
        List<String> urls = new ArrayList<>();
        urls.add("https://www.gkjrhfjksdb.oogle.com");
        urls.add("https://www.facebmcbnzb.ook.com");
        urls.add("https://www.twksnckln.itter.com");

        List<String> domains = getDomains(urls);

        for (String domain : domains) {
            System.out.println(domain);
        }
    }
}