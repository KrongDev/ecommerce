package io.geon.common.dto;

public interface JpaEntity<T> {
    JpaEntity<T> from(T domain);
    T toDomain();
}
