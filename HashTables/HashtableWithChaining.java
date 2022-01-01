/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

import java.util.LinkedList;

/**
 *
 * @author welcom
 */
public class HashtableWithChaining {

    public static void main(String args[]) {
        Hashtable table = new Hashtable();
        table.put(1, "a");
        table.put(3, "b");
        table.put(6, "c");
        table.put(6, "c++");
        System.out.println(table.get(9));

    }
}

class Hashtable {

    private class entry {

        private int key;
        private String value;

        entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    LinkedList<entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        int index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList();
        }
        for (entry en : entries[index]) {
            if (en.key == key) {
                en.value = value;
                return;
            }
        }
        entry en = new entry(key, value);
        entries[index].addLast(en);
    }

    public String get(int key) {
        int index = hash(key);
        if (entries[index] != null) {
            for (entry en : entries[index]) {
                if (en.key == key) {
                    return en.value;
                }
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        if (entries[index] != null) {
            for (entry en : entries[index]) {
                if (en.key == key) {
                    entries[index].remove();
                    return;
                }
            }
        }
        throw new IllegalStateException();
    }

    private int hash(int key) {
        return key % entries.length;
    }

}
