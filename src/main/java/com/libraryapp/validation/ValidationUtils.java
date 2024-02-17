package com.libraryapp.validation;

public class ValidationUtils {

    public boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    
}