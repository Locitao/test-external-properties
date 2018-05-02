package com.test.testexternalproperties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Configuration
public class PropertyConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        final PropertySourcesPlaceholderConfigurer ppc = new PropertySourcesPlaceholderConfigurer();

        ppc.setIgnoreResourceNotFound(true);

        final List<Resource> resources = new ArrayList<>();

        final String locationOfConfigFile = "application.properties";

        resources.add(new FileSystemResource(locationOfConfigFile));

        ppc.setLocations(resources.toArray(new Resource[]{}));

        return ppc;
    }
}
