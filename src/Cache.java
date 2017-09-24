
public interface Cache {
	CacheItem cacheItem(Object item, String key);// zapisuje obiekt w Cache’u

	void invalidateCache();// czysci nasz Cache

	CacheView getView();// zwraca “widok” na nasz Cache

}
