import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SortTest {

	@Test
	public void testSortInts() {
		final int[] numbers = {3, 1, 4, 5, 4};
		final int[] expected = {1, 3, 4, 4, 5};
		
		Arrays.sort(numbers);
		assertArrayEquals(numbers, expected);
	}

	@Test
	public void testSortObjects() {
		final String[] strings = {"z", "y", "x", "aa", "ab"};
		final String[] expected = {"aa", "ab", "x", "y", "z"};
		
		Arrays.sort(strings);
		assertArrayEquals(strings, expected);
	}

	static class NotComparable {
		int i;
		NotComparable(final int i) {
			this.i = i;
		}
	}
	
	@Test
	public void testNotComparable() {
		final List<NotComparable> objects = new ArrayList<>();
		for (int i =0; i < 10; i++) {
			objects.add(new NotComparable(i));
		}
		
		// cannot be cast
		Arrays.sort(objects.toArray());
	}
	
}
