package com.scoolfx.desktop.api.auth;

@FunctionalInterface
public interface IAuthorization<T> {

	boolean authorize(T data);
}
