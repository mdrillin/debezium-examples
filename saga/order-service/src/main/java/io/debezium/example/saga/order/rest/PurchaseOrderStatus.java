package io.debezium.example.saga.order.rest;

public enum PurchaseOrderStatus {
    CREATED, PROCESSING, CANCELLED, COMPLETED;
}
