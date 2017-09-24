
public interface CacheItem {
	//? w interface też mam robić public/private?
	String getKey();// zwraca klucz obiektu

	Object getValue();// zwraca obiekt zapisanych w Cache’u

}
