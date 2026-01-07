package hashmap_hashfunctions;

public class CustomHashmap {

    // Node class
    public static class Node {
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int size = 10;
    public Node[] buckets;

    // Constructor
    public CustomHashmap() {
        buckets = new Node[size];
    }

    // Hash function
    public int getIndex(int key) {
        return key % size;
    }

    // Insert or update
    public void put(int key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Get value
    public int get(int key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return -1;
    }

    // Remove key
    public void remove(int key) {
        int index = getIndex(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }
    public static void main(String[] args) {

    	CustomHashmap map = new CustomHashmap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(11, 110);   // collision case

        System.out.println(map.get(1));   // 10
        System.out.println(map.get(2));   // 20
        System.out.println(map.get(11));  // 110

        map.remove(2);
        System.out.println(map.get(2));   // -1
    }
}
