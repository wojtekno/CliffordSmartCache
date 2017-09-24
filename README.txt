# CliffordSmartCache


- SmartCacheItem 
	- jednostka zapisywana w naszym programie, sk³ada siê z Object value; oraz String key;

- SmartCahceView 
	- lista w której zapisujemy nasze jednostki (SmartCacheItem)
	za³o¿enia: 
		int size; - wskazuje iloœæ zapisanych jednostek w liœcie
		int capacity; - wskazuje ile maksymalnie jednostek mo¿emy zapisaæ w liœcie
- SmartCache 
	- rodzaj wyjœcia dla u¿ytokwnia(innego programisty), mog³oby zostaæ pominiête, 
	bo wszystkie operacje wykonuje na SmartCacheView,
	- mo¿naby rozszerzyæ pojemnoœæ tak, ¿eby móg³ przyjmowaæ wiêcej zapytañ
	(¿eby nie by³ zawsze na 3, a móg³ przyj¹æ inn¹ wartoœæ) 

- Dodane UnitTests

Spostrze¿enia:
	- mozna do tego podejœæ z innej strony i stworzyæ tylko jedn¹ klasê publiczn¹ - SmartCache,
	natomiast SmartCacheView oraz SmartCacheItem mog³yby byæ klasami prwatnymi, 
	które by³yby tylko do u¿ytku klasy SmartCache. Mo¿na to zrobiæ, poniewa¿ za pomoc¹ SmartCache
	mamy dostêp do ca³ej funkcjonalnoœci struktury.
