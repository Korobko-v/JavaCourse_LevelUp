package org.levelup.lesson5.comparison;

import java.util.Objects;

public class Computer {
    private int ram;
    private long diskSize;
    private String brand;

    public long getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(long diskSize) {
        this.diskSize = diskSize;
    }

    public Computer(String brand, int ram) {
        this.brand = brand;
      this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void changeRam (int ram) {
        if (ram > 0) {
            this.ram = ram;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram &&
                diskSize == computer.diskSize &&
                Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, diskSize, brand);
    }
}
