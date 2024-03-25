public class Payroll {
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] swages = new double[7];


    public double getEmployeeGross(int id)
    {
        int gross;
        for (int i = 0; i < 7; i++)
            if (employeeId[i] == id) return swages[i];

        return -1;
    }
    public void calculateGross()
    {
        for (int i = 0; i < 7; i++)
        {
            swages[i] = payRate[i] * hours[i];
        }
    }
    public void setHours(int[] hours) {
        this.hours = hours;
    }

    public void setPayRate(double[] payRate)
    {
        this.payRate = payRate;
    }
    public int getEmployeeId(int index) {
        return employeeId[index];
    }

    public int[] getHours() {
        return hours;
    }

    public double[] getPayRate() {
        return payRate;
    }

    public double[] getSwages() {
        return swages;
    }
}
