import java.text.DecimalFormat;

class Lottery.java {
	NumberGenerator megaballPool = new NumberGenerator(70);
	NumberGenerator powerballPool = new NumberGenerator(25);

	megaballPool.shuffle();
	powerballPool.shuffle();

	double x = Math.random();
	DecimalFormat df4 = new DecimalFormat(".####");
	String formattedDouble = df4.format(x);
	double a = Double.parseDouble(formattedDouble);
	System.out.println(">>> " + a);
	double y = (0.03 * 70) + 1;
	int z = (int)y;
	System.out.println("Random: " + x);
	System.out.println("Converted: " + y);
	System.out.println("Integer: " + z);
	NumberPool pool = new NumberPool(70);
	int[] numbers = pool.getPool();
	for (int number : numbers) {
		System.out.printf("%d ", number);			
	}
	System.out.println();
	pool.shuffle();
}