package DesignPatternAug2023.Structural.Adapter;

public class DesignExecutor2 {
    public static void main(String[] args) {
        UsbCCable usbCCable = new UsbCCable();
        UsbACharger usbACharger = new UsbCtoAAdapter(usbCCable);

        usbACharger.chargeWithUsbA(); // This will charge the smartphone using USB-A through the USB-C cable
    }
}