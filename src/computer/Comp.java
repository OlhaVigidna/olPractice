package computer;

public class Comp {
    private String model;
    private int year;
    private long memoryCapacity;
    private int price;
    private HardDrive hardDrive;
    private Processor processor;

    public Comp(String model, int year, long memoryCapacity, int price, HardDrive hardDrive, Processor processor) {
        this.model = model;
        this.year = year;
        this.memoryCapacity = memoryCapacity;
        this.price = price;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(long memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comp)) return false;

        Comp comp = (Comp) o;

        if (getYear() != comp.getYear()) return false;
        if (getMemoryCapacity() != comp.getMemoryCapacity()) return false;
        if (getPrice() != comp.getPrice()) return false;
        if (getModel() != null ? !getModel().equals(comp.getModel()) : comp.getModel() != null) return false;
        if (getHardDrive() != null ? !getHardDrive().equals(comp.getHardDrive()) : comp.getHardDrive() != null)
            return false;
        return getProcessor() != null ? getProcessor().equals(comp.getProcessor()) : comp.getProcessor() == null;
    }

    @Override
    public int hashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + getYear();
        result = 31 * result + (int) (getMemoryCapacity() ^ (getMemoryCapacity() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + (getHardDrive() != null ? getHardDrive().hashCode() : 0);
        result = 31 * result + (getProcessor() != null ? getProcessor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memoryCapacity=" + memoryCapacity +
                ", price=" + price +
                ", hardDrive=" + hardDrive +
                ", processor=" + processor +
                '}';
    }
}
