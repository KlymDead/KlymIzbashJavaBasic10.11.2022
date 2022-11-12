public class fitInfo {
    public int weight;
    public int pressure;
    public int steps;

    public fitInfo(int weight, int pressure, int steps) {
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }



    @Override
    public String toString() {
        return "fitInfo{" +
                "weight=" + weight +
                ", pressure=" + pressure +
                ", steps=" + steps +
                '}';
    }
}
