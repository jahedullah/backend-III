package org.example.caseStudy.task5;

import java.security.SecureRandom;
import java.util.UUID;

public class ShipmentService {
    private SecureRandom secureRandom;
    private ShipmentService() {

    }

    private static class ShipmentHelper {
        private static final ShipmentService shipmentService = new ShipmentService();
    }

    public ShipmentService getInstance() {
        return ShipmentHelper.shipmentService;
    }

    public void initiateShipment(String address, Invoice invoice){
        Shipment shipment = new Shipment();
        shipment.setShipmentId(Integer.parseInt(String.valueOf(UUID.randomUUID())));
        shipment.setInvoice(invoice);
        shipment.setAddress(address);
        shipment.setShipmentStatus(ShipmentStatus.INITIATED_FROM_HUB);
    }

    public void updateShipmentStatus(Shipment shipment, ShipmentStatus shipmentStatus){
        shipment.setShipmentStatus(shipmentStatus);
    }
}
