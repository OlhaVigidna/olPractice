package computer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Comp> computers = new ArrayList<>();
        computers.add(new Comp("model1", 2012, 2345, 45,
                new HardDrive("hardDriveModel", Type.HDD, 501, Country.INDIA),
                new Processor("processorType", 4, 456, Country.CHINA)));

        computers.add(new Comp("model2", 2009, 678, 54,
                new HardDrive("hardDriveModel", Type.SSD, 490, Country.USA),
                new Processor("i7", 8, 456, Country.KOREA)));

        computers.add(new Comp("model2", 2011, 876, 23,
                new HardDrive("hardDriveModel", Type.HDD, 550, Country.CHINA),
                new Processor("model4", 6, 500, Country.KOREA)));

        computers.add(new Comp("model2", 2014, 806, 43,
                new HardDrive("hardDriveModel", Type.HDD, 600, Country.INDIA),
                new Processor("i7", 7, 550, Country.USA)));


        computers.add(new Comp("model2", 2017, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 600, Country.USA),
                new Processor("i7", 6, 345, Country.CHINA)));

        computers.add(new Comp("model2", 2008, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 600, Country.KOREA),
                new Processor("model5", 6, 345, Country.USA)));

        computers.add(new Comp("model2", 2016, 786, 18,
                new HardDrive("hardDriveModel", Type.HDD, 600, Country.CHINA),
                new Processor("i7", 6, 345, Country.CHINA)));

        computers.add(new Comp("model2", 2015, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 600, Country.INDIA),
                new Processor("model6", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2008, 786, 18,
                new HardDrive("hardDriveModel", Type.HDD, 600, Country.INDIA),
                new Processor("i7", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2015, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 600, Country.INDIA),
                new Processor("i7", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2013, 786, 18,
                new HardDrive("hardDriveModel", Type.HDD, 600, Country.INDIA),
                new Processor("i7", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2015, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 600, Country.INDIA),
                new Processor("model6", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 201, 786, 18,
                new HardDrive("hardDriveModel", Type.HDD, 600, Country.INDIA),
                new Processor("i7", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2015, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 600, Country.INDIA),
                new Processor("model6", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2018, 786, 18,
                new HardDrive("hardDriveModel", Type.HDD, 650, Country.INDIA),
                new Processor("i7", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2018, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 700, Country.INDIA),
                new Processor("model6", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2007, 786, 18,
                new HardDrive("hardDriveModel", Type.HDD, 600, Country.KOREA),
                new Processor("i7", 6, 345, Country.INDIA)));

        computers.add(new Comp("model2", 2008, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 450, Country.INDIA),
                new Processor("i7", 6, 345, Country.KOREA)));

        computers.add(new Comp("model2", 2006, 786, 18,
                new HardDrive("hardDriveModel", Type.SSD, 400, Country.CHINA),
                new Processor("model6", 6, 345, Country.CHINA)));

        computers.add(new Comp("model2", 2009, 786, 18,
                new HardDrive("hardDriveModel", Type.HDD, 600, Country.USA),
                new Processor("i7", 6, 345, Country.USA)));


        List<Comp> yearMore2010 = computers.stream().filter(comp -> comp.getYear() > 2010).collect(Collectors.toList());
        System.out.println(yearMore2010);
        List<Comp> yearMore2010AndCountryChina = computers.stream().filter(comp -> (comp.getYear()>2010) &&
                (comp.getProcessor().getProducer().equals(Country.CHINA))).collect(Collectors.toList());

    }
}
