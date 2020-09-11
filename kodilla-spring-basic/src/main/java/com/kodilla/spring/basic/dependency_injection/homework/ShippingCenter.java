package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService = new DeliveryService() {
        @Override
        public boolean deliverPackage(String address, double weight) {
            return false;
        }
    };
    private NotificationService notificationService = new NotificationService() {
        @Override
        public void success(String address) {

        }

        @Override
        public void fail(String address) {

        }
    };

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
