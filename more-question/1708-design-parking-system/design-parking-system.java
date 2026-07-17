class ParkingSystem {
    int []arr;
    public ParkingSystem(int big, int medium, int small) {
        this.arr = new int[]{0,big,medium,small};
    }
    
    public boolean addCar(int carType) {
        if(this.arr[carType]>0){
            this.arr[carType]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */