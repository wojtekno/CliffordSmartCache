import java.util.ArrayList;
import java.util.List;

public class SmartCacheView implements CacheView {

	private int capacity;
	private List<CacheItem> list;

	public SmartCacheView() {
		list = new ArrayList<CacheItem>();
		capacity = 3;
	}

	public CacheItem saveCacheItem(CacheItem item) {
		if (list.size() == capacity) {
			list.remove(0);
		}
		list.add(item);
		return item;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public CacheItem getItem(int index) {
		if (index > list.size() - 1 || index < 0) {
			return null;
		}
		return list.get(index);
	}

	@Override
	public CacheItem getItem(String key) {
		for (CacheItem item : list) {
			if (item.getKey().equals(key)) {
				return list.get(list.indexOf(item));
			}
		}
		return null;
	}

	public void invalidateCache() {
		list.clear();
	}

	public String toString() {
		return "Cache = " + list;
	}

}
