public class MobilePhone {
    public int limit;
    public String[] contactNames;
    public int[] contactNumbers;
    public int totalSaved;
    public void setContactCapacity(int size) {
        limit = size;
        contactNames = new String[limit];
        contactNumbers = new int[limit];
        totalSaved = 0;
    }

    public void details() {
        System.out.println("Total Contacts: " + totalSaved);
        System.out.println("Contact List:");
        for (int i = 0; i < totalSaved; i++) {
            System.out.println(contactNames[i] + " -> " + contactNumbers[i]);
        }
    }

    public void addContact(String person, int num) {
        if (totalSaved == limit) {
            System.out.println("Storage Full!!");
            return;
        }

        contactNames[totalSaved] = person;
        contactNumbers[totalSaved] = num;
        totalSaved++;
        System.out.println("The contact of "+person+" is added");
    }

    public void makeCall(int num) {
        for (int i = 0; i < totalSaved; i++) {
            if (contactNumbers[i] == num) {
                System.out.println("Calling " + contactNames[i] + "...");
                return;
            }
        }
        System.out.println("Calling " + num + "...");
    }
}
