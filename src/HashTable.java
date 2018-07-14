import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {
        Hashtable<String,Integer> hashTable = new Hashtable<String,Integer>();
        hashTable.put("Humza",1);
        hashTable.put("Humna",2);
        //does not allow same keys
        //if add duplicates keys then recent key value is stored, previous is taken down
        hashTable.put("Humza",3);
        //when retrieve value using duplicate key "Humza", value 3 is returned in console
        hashTable.put("Yumna",4);
        //Hashtable does not allow null keys and values
        System.out.printf("Interger value is "+hashTable.get("Humza"));
    }

}
