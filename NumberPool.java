class NumberPool {
	private int size;
	private int[] pool;
	private static final int UPPERBOUND = 999;

	NumberPool(int size) {
		this.size = size;
		pool = new int[size];
		populate();
	}

	private void populate() {
		for (int i = 0; i < size; ++i) {
			pool[i] = i + 1;
		}
	}

	public void shuffle() {
		int iterations = (int)(Math.random() * UPPERBOUND + 1);

		for (int i = 0; i <= iterations; ++i) {
			int destination = (int)(Math.random() * size);
			int	source = (int)(Math.random() * size);
			swap(source, destination);
		}
	}

	public void swap(int source, int destination) {
		int temp = pool[source];
		pool[source] = pool[destination];
		pool[destination] = temp;
	}

	public int[] getPool() {
		return pool;
	}
}