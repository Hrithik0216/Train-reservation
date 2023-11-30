public class Train {
    private int trainNo;
    private Boolean ac;
    private int capacity;

    Train(int trainNo, Boolean ac, int capacity) {
        this.trainNo = trainNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean getAc() {
        return ac;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }

    public void displyTrainInfo() {
        System.out.println("train No: " + trainNo + " AC: " + "Train Capacity: " + capacity);
    }

}
