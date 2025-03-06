package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String field;
    String fieldName;
    Long fieldId;
    public ResourceNotFoundException(){}
    public ResourceNotFoundException(String resourceName, String fieldName, String field) {
        super(String.format("%s not found with %s:%s",resourceName,fieldName,field));
        this.fieldName = fieldName;
        this.field=field;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String resourceName, String field, Long fieldId) {
        super(String.format("%s not found with %s:%d",resourceName,fieldId,field));
        this.fieldId= fieldId;
        this.field= field;
        this.resourceName = resourceName;
    }
}
