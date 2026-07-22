class MyCircularQueue {
    int arr[];
    int f,r,n;
    public MyCircularQueue(int k) {
        n=k+1;
        arr=new int [k+1];
        f=0;r=0;
    }
    public boolean enQueue(int value) {
        if(isFull()) return false;
        arr[r]=value;
        r=(r+1)%n;
        return true;
    }
    public boolean deQueue() {
        if(isEmpty()) return false;
        int v=arr[f];
        f=(f+1)%n;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[f];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(r-1+n)%n];
    }
    
    public boolean isEmpty() {
        return f==r;
    }
    
    public boolean isFull() {
        return (r+1)%n==f;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */