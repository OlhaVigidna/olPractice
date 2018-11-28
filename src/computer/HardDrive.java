package computer;

public class HardDrive {
    private String model;
    private Type hardDriveType;
    private int volume;
    private Country countryProducer;

    public HardDrive(String model, Type hardDriveType, int volume, Country countryProducer) {
        this.model = model;
        this.hardDriveType = hardDriveType;
        this.volume = volume;
        this.countryProducer = countryProducer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getHardDriveType() {
        return hardDriveType;
    }

    public void setHardDriveType(Type hardDriveType) {
        this.hardDriveType = hardDriveType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Country getCountryProducer() {
        return countryProducer;
    }

    public void setCountryProducer(Country countryProducer) {
        this.countryProducer = countryProducer;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "model='" + model + '\'' +
                ", hardDriveType=" + hardDriveType +
                ", volume=" + volume +
                ", countryProducer=" + countryProducer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HardDrive)) return false;

        HardDrive hardDrive = (HardDrive) o;

        if (getVolume() != hardDrive.getVolume()) return false;
        if (getModel() != null ? !getModel().equals(hardDrive.getModel()) : hardDrive.getModel() != null) return false;
        if (getHardDriveType() != hardDrive.getHardDriveType()) return false;
        return getCountryProducer() == hardDrive.getCountryProducer();
    }

    @Override
    public int hashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + (getHardDriveType() != null ? getHardDriveType().hashCode() : 0);
        result = 31 * result + getVolume();
        result = 31 * result + (getCountryProducer() != null ? getCountryProducer().hashCode() : 0);
        return result;
    }
}
