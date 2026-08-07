

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Frekansları say
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Min-Heap oluştur. İçindeki kural: "Frekansı küçük olanı en üste koy"
        // Java'da PriorityQueue içine (a, b) şeklinde bir kıyaslama (comparator) verebiliriz.
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // 3. Elemanları kuyruğa ekle
        for (int key : map.keySet()) {
            heap.add(key);
            
            // Eğer boyut k'yı geçerse, frekansı en düşük olanı (en üsttekini) at
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // 4. Kuyrukta kalan son k elemanı sonuç dizisine aktar
        int[] sonuc = new int[k];
        for (int i = 0; i < k; i++) {
            sonuc[i] = heap.poll();
        }

        return sonuc;
    }
}