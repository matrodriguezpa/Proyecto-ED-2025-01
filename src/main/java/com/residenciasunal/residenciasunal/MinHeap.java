package com.residenciasunal.residenciasunal;

import java.util.ArrayList;

public class MinHeap {

    private ArrayList<Estudiante> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void clear() {
        heap.clear();
    }

    public Estudiante peek() {
        if (heap.isEmpty()) return null;
        return heap.get(0);
    }

    public void insert(Estudiante estudiante) {
        heap.add(estudiante);
        heapifyUp(heap.size() - 1);
    }

    public Estudiante extractMin() {
        if (heap.isEmpty()) return null;

        Estudiante min = heap.get(0);
        Estudiante last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }

        return min;
    }

    public void actualizarPuntaje(int id, long nuevoPuntaje) {
        for (int i = 0; i < heap.size(); i++) {
            if (heap.get(i).getCedula() == id) {
                heap.get(i).setPuntaje(nuevoPuntaje);
                heapifyUp(i);
                heapifyDown(i);
                break;
            }
        }
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int padre = (index - 1) / 2;
            if (heap.get(index).getPuntaje() < heap.get(padre).getPuntaje()) {
                intercambiar(index, padre);
                index = padre;
            } else break;
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int izq = 2 * index + 1;
            int der = 2 * index + 2;
            int menor = index;

            if (izq < size && heap.get(izq).getPuntaje() < heap.get(menor).getPuntaje()) {
                menor = izq;
            }

            if (der < size && heap.get(der).getPuntaje() < heap.get(menor).getPuntaje()) {
                menor = der;
            }

            if (menor != index) {
                intercambiar(index, menor);
                index = menor;
            } else break;
        }
    }

    private void intercambiar(int i, int j) {
        Estudiante temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void imprimirHeap() {
        for (Estudiante e : heap) {
            System.out.println(e);
        }
    }
}
