	 
public class SmartCache implements Cache {

	public SmartCacheView cacheView;

	public SmartCache() {
		cacheView = new SmartCacheView();
	}

	@Override
	public CacheItem cacheItem(Object item, String key) {
		CacheItem cacheItem = new SmartCacheItem(item, key);
		cacheView.saveCacheItem(cacheItem);
		return cacheItem;
	}

	@Override
	public void invalidateCache() {
		cacheView.invalidateCache();
	}

	@Override
	public CacheView getView() {
		return cacheView;
	}
	

}