class HDMI implements VGA {
    private HDMI Hdmi;

    public HDMI(HDMI Hdmi) {
        this.Hdmi = Hdmi;
    }

    @Override
    public void connectWithVGA() {
        System.out.println("Adapting HDMI to VGA...");
        Hdmi.connectWithVGA();
    }
}
