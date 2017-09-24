
public class SmartCacheItem implements CacheItem {
	private Object value;
	private String key;

	public SmartCacheItem(Object item, String key) {
		this.value = item;
		this.key = key;
	}

	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public Object getValue() {
		return this.value;
	}

	public String toString() {
		return key;
	}
}
