class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            nItems++;
            System.out.println(value + " enqueued to queue");
        }
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        } else {
            int temp = queueArray[front];
            front = (front + 1) % maxSize;
            nItems--;
            return temp;
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Nothing to peek.");
            return -1;
        } else {
            return queueArray[front];
        }
    }
    public boolean isEmpty() {
        return (nItems == 0);
    }
    public boolean isFull() {
        return (nItems == maxSize);
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is " + queue.peek());
        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
