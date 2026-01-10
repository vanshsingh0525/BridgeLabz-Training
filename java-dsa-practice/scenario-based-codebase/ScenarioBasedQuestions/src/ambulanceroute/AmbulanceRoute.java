package ambulanceroute;

public class AmbulanceRoute {

    private HospitalUnit head = null;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head; // circular link
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("Redirect patient to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("All units busy!");
    }
    
    public void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(name)) {

                // Only one unit
                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                // Removing head
                if (curr == head) {
                    HospitalUnit temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(name + " removed for maintenance");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}

