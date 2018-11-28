package computer;

public class Processor {
    private String type;
    private int countOfCore;
    private double frequency;
    private Country producer;

    public Processor(String type, int countOfCore, double frequency, Country producer) {
        this.type = type;
        this.countOfCore = countOfCore;
        this.frequency = frequency;
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCountOfCore() {
        return countOfCore;
    }

    public void setCountOfCore(int countOfCore) {
        this.countOfCore = countOfCore;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Country getProducer() {
        return producer;
    }

    public void setProducer(Country producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Processor)) return false;

        Processor processor = (Processor) o;

        if (getCountOfCore() != processor.getCountOfCore()) return false;
        if (Double.compare(processor.getFrequency(), getFrequency()) != 0) return false;
        if (getType() != null ? !getType().equals(processor.getType()) : processor.getType() != null) return false;
        return getProducer() == processor.getProducer();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getType() != null ? getType().hashCode() : 0;
        result = 31 * result + getCountOfCore();
        temp = Double.doubleToLongBits(getFrequency());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getProducer() != null ? getProducer().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", countOfCore=" + countOfCore +
                ", frequency=" + frequency +
                ", producer=" + producer +
                '}';
    }
}
