class Monitor {
    public void connect(VGA connect) {
        System.out.println("Monitor expecting HDMI and VGA connector");
        connect.connectWithVGA();
        System.out.println("connecting started.");
    }
}