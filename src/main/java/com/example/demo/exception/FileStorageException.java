package com.example.demo.exception;

public class FileStorageException extends RuntimeException {
	
	private static final long serialVersionUID = 9162584509085447198L;

	public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
