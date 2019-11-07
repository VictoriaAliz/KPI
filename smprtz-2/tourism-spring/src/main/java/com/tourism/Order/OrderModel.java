package com.tourism.Order;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.DataModel;

public class OrderModel implements DataModel {

    private Long id;
    private Long touristId;
    private Long equipmentId;

    @JsonCreator
    public OrderModel(@JsonProperty("id") Long id, @JsonProperty("touristId") Long touristId, @JsonProperty("equipmentId") Long equipmentId) {
        this.id = id;
        this.touristId = touristId;
        this.equipmentId = equipmentId;
    }

    public OrderModel () { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Long getTouristId() {
        return touristId;
    }

    public void setTouristId(Long touristId) {
        this.touristId = touristId;
    }

    @Override
    public String toString() {
        return String.format("Order: id=%d touristId=%d equipmentId=%d", id, touristId, equipmentId);
    }
}
