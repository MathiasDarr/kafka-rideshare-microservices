package org.mddarr.userrequestservice.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}
