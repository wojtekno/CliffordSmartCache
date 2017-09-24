import static org.junit.Assert.*;

import org.junit.Test;

public class TestSmartCacheView {

	@Test
	public void testEmptyCache() {
		Cache cache = new SmartCache();

		assertEquals(0, cache.getView().size());
		assertEquals(null, cache.getView().getItem(0));
	}

	@Test
	public void testSaveCacheItem() {
		Cache cache = new SmartCache();
		CacheItem item = cache.cacheItem(new A(), "A");

		assertEquals(item, cache.getView().getItem(0));
	}

	private Cache save5Cache() {
		Cache cache = new SmartCache();

		cache.cacheItem(new A(), "A");
		cache.cacheItem(new D(), "D1");
		cache.cacheItem(new B(), "B");
		cache.cacheItem(new C(), "C");
		cache.cacheItem(new D(), "D2");

		return cache;
	}

	@Test
	public void testMultipleCaches() {
		Cache cache = save5Cache();

		assertEquals(3, cache.getView().size());
		assertEquals("B", cache.getView().getItem(0).getKey());
		assertEquals("C", cache.getView().getItem(1).getKey());
		assertEquals("D2", cache.getView().getItem(2).getKey());
	}

	@Test
	public void testGetByKeyCache() {
		Cache cache = save5Cache();

		assertNull(cache.getView().getItem("A"));
		assertNull(cache.getView().getItem("D1"));
		assertEquals("B", cache.getView().getItem("B").getKey());
		assertEquals("C", cache.getView().getItem("C").getKey());
		assertEquals("D2", cache.getView().getItem("D2").getKey());
	}

	@Test
	public void testInvalidateCache() {
		Cache cache = save5Cache();

		cache.invalidateCache();
		assertEquals(0, cache.getView().size());
		cache.cacheItem(new D(), "D3");
		assertEquals(1, cache.getView().size());
		assertEquals("D3", cache.getView().getItem(0).getKey());
	}

}
