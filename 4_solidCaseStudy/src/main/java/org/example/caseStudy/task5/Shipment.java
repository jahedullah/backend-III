package org.example.caseStudy.task5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shipment {
    private int shipmentId;
    private String Address;
    private Invoice invoice;
    private ShipmentStatus shipmentStatus;
}
