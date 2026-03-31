package unit_2_oop_concept;

interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying " + type + " filter to image");
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying " + type + " filter to data");
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

public class Filterable_Interface {
    public static void main(String[] args) {
        Filterable img = new ImageProcessor();
        Filterable data = new DataAnalyzer();

        img.apply_filter("Blur");
        data.apply_filter("Noise Reduction");
    }
}
