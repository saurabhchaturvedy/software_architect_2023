package DesignPatternAug2023.Structural.Adapter;

class UsbCtoAAdapter implements UsbACharger {
    private UsbCCable usbCCable;

    public UsbCtoAAdapter(UsbCCable usbCCable) {
        this.usbCCable = usbCCable;
    }

    @Override
    public void chargeWithUsbA() {
        System.out.println("Using USB-C to USB-A adapter");
        usbCCable.chargeWithUsbC();
    }
}