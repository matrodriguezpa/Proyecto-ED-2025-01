package com.residenciasunal.residenciasunal;

public class PruebasRendimiento {

    public static void main(String[] args) {
        int[] tamanos = {10, 100, 1000, 10000, 100000};

        System.out.println("=== PRUEBAS DE RENDIMIENTO (en segundos) ===\n");

        System.out.println("HashMap");
        System.out.println("╔══════════════╦═════════════════════════════════════════════════╗");
        System.out.println("║       N      ║     put()     |     get()     |    remove()     ║");
        System.out.println("╠══════════════╬═════════════════════════════════════════════════╣");
        for (int n : tamanos) {
            double[] tiempos = probarHashMap(n);
            System.out.printf("║ %,10d   ║ %12.6f  | %12.6f  | %12.6f    ║\n", n, tiempos[0], tiempos[1], tiempos[2]);
        }
        System.out.println("╚══════════════╩═════════════════════════════════════════════════╝\n");

        System.out.println("MinHeap");
        System.out.println("╔══════════════╦══════════════════════════════════════╗");
        System.out.println("║      N       ║     insert()    |   extractMin()     ║");
        System.out.println("╠══════════════╬══════════════════════════════════════╣");
        for (int n : tamanos) {
            double[] tiempos = probarMinHeap(n);
            System.out.printf("║ %,10d   ║ %14.6f  | %14.6f     ║\n", n, tiempos[0], tiempos[1]);
        }
        System.out.println("╚══════════════╩══════════════════════════════════════╝\n");

        System.out.println("LinkedList");
        System.out.println("╔══════════════╦═══════════════════════════════════════════════════╗");
        System.out.println("║      N       ║     add()     |   get(index)  |   remove(index)   ║");
        System.out.println("╠══════════════╬═══════════════════════════════════════════════════╣");
        for (int n : tamanos) {
            double[] tiempos = probarLinkedList(n);
            System.out.printf("║ %,10d   ║ %12.6f  | %12.6f  | %12.6f      ║\n", n, tiempos[0], tiempos[1], tiempos[2]);
        }
        System.out.println("╚══════════════╩═══════════════════════════════════════════════════╝\n");
    }

    public static double[] probarHashMap(int n) {
        HashMap mapa = new HashMap();

        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++)
            mapa.put("key" + i, new Estudiante(i, "Est" + i, "Ing", i));
        long t2 = System.nanoTime();
        for (int i = 0; i < n; i++)
            mapa.get("key" + i);
        long t3 = System.nanoTime();
        for (int i = 0; i < n; i++)
            mapa.remove("key" + i);
        long t4 = System.nanoTime();

        return new double[] {
            (t2 - t1) / 1_000_000_000.0,
            (t3 - t2) / 1_000_000_000.0,
            (t4 - t3) / 1_000_000_000.0
        };
    }

    public static double[] probarMinHeap(int n) {
        MinHeap heap = new MinHeap();

        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++)
            heap.insert(new Estudiante(i, "Est" + i, "Ing", i));
        long t2 = System.nanoTime();
        for (int i = 0; i < n; i++)
            heap.extractMin();
        long t3 = System.nanoTime();

        return new double[] {
            (t2 - t1) / 1_000_000_000.0,
            (t3 - t2) / 1_000_000_000.0
        };
    }

    public static double[] probarLinkedList(int n) {
        LinkedList<Estudiante> lista = new LinkedList<>();

        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++)
            lista.add(new Estudiante(i, "Est" + i, "Ing", i));
        long t2 = System.nanoTime();
        for (int i = 0; i < n; i++)
            lista.get(i);
        long t3 = System.nanoTime();
        for (int i = n - 1; i >= 0; i--)
            lista.remove(lista.get(i));
        long t4 = System.nanoTime();

        return new double[] {
            (t2 - t1) / 1_000_000_000.0,
            (t3 - t2) / 1_000_000_000.0,
            (t4 - t3) / 1_000_000_000.0
        };
    }
}
