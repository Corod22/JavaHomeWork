package DZ6;

public class Laptop {
    int screenDiagonal; // Диагональ экрана
    int ram; // Оперативна память
    int ssdVolume; // объём жесткого диска
    String laptopColor; // Цвет ноутбука
    String operatingSystem; // Операционная система

    public Laptop(int screenDiagonal, int ram, int ssdVolume, String laptopColor, String operatingSystem) {
        this.screenDiagonal = screenDiagonal;
        this.ram = ram;
        this.ssdVolume = ssdVolume;
        this.laptopColor = laptopColor;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString(){
        return "Диагональ экрана: " + screenDiagonal +
        ", оперативная память " + ram +
        ", Объём жесткого диска " + ssdVolume +
        ", цвет ноутбука" + laptopColor+
        ", Операционная система " + operatingSystem;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Laptop)
        return ((Laptop) obj).screenDiagonal ==this.screenDiagonal &&
            ((Laptop) obj).ram ==this.ram &&
            ((Laptop) obj).ssdVolume ==this.ssdVolume &&
            ((Laptop) obj).laptopColor.equals(this.laptopColor) &&
            ((Laptop) obj).operatingSystem.equals(this.operatingSystem); 
        else return false;
    }
    public int getDiag(){
        return screenDiagonal;
    }
    public int getRam(){
        return ram;
    }
    public int getSsdVolume(){
        return ssdVolume;
    }
    public String getColor(){
        return laptopColor;
    }
    public String getoper(){
        return operatingSystem;
    }

}
