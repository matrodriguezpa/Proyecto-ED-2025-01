package com.residenciasunal.residenciasunal;
public class HashMap {
    // Nodo de la lista enlazada para cada bucket
    private static class Entry {
        String key;
        Estudiante value;
        Entry next;

        Entry(String key, Estudiante value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Entry[] buckets;
    private int size;
    private int threshold;

    public HashMap() {
        this.buckets = new Entry[INITIAL_CAPACITY];
        this.threshold = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
        this.size = 0;
    }

    //Inserta o actualiza un estudiante en el mapa.
    public void put(String key, Estudiante value) {
        if (key == null) {
            throw new IllegalArgumentException("La clave no puede ser null");
        }
        int index = indexFor(hash(key), buckets.length);
        Entry current = buckets[index];

        // Reemplazo si ya existe la clave
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Nuevo nodo al frente de la lista
        Entry entry = new Entry(key, value);
        entry.next = buckets[index];
        buckets[index] = entry;
        size++;

        if (size > threshold) {
            resize(2 * buckets.length);
        }
    }

    // Obtiene un estudiante por ID, o null si no existe.
    public Estudiante get(String key) {
        if (key == null) {
            throw new IllegalArgumentException("La clave no puede ser null");
        }
        int index = indexFor(hash(key), buckets.length);
        Entry current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    //Elimina el estudiante con la clave dada y lo devuelve, o null si no existía.
     
    public Estudiante remove(String key) {
        if (key == null) {
            throw new IllegalArgumentException("La clave no puede ser null");
        }
        int index = indexFor(hash(key), buckets.length);
        Entry prev = null;
        Entry current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    //     Verifica si existe un estudiante con ese ID.
     
    public boolean containsKey(String key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    //limpia todas las entradas
    public void clear() {
        buckets = new Entry[INITIAL_CAPACITY];
        size = 0;
        threshold = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
    }

    private int hash(String key) {
        return (key == null) ? 0 : key.hashCode();
    }

    private int indexFor(int hash, int length) {
        return (hash & 0x7FFFFFFF) % length;
    }

    private void resize(int newCapacity) {
        Entry[] old = buckets;
        Entry[] next = new Entry[newCapacity];
        threshold = (int) (newCapacity * LOAD_FACTOR);

        for (Entry head : old) {
            while (head != null) {
                Entry e = head;
                head = head.next;

                int idx = indexFor(hash(e.key), newCapacity);
                e.next = next[idx];
                next[idx] = e;
            }
        }
        buckets = next;
    }
}
