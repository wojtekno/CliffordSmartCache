# CliffordSmartCache


- SmartCacheItem 
	- jednostka zapisywana w naszym programie, sk�ada si� z Object value; oraz String key;

- SmartCahceView 
	- lista w kt�rej zapisujemy nasze jednostki (SmartCacheItem)
	za�o�enia: 
		int size; - wskazuje ilo�� zapisanych jednostek w li�cie
		int capacity; - wskazuje ile maksymalnie jednostek mo�emy zapisa� w li�cie
- SmartCache 
	- rodzaj wyj�cia dla u�ytokwnia(innego programisty), mog�oby zosta� pomini�te, 
	bo wszystkie operacje wykonuje na SmartCacheView,
	- mo�naby rozszerzy� pojemno�� tak, �eby m�g� przyjmowa� wi�cej zapyta�
	(�eby nie by� zawsze na 3, a m�g� przyj�� inn� warto��) 

- Dodane UnitTests

Spostrze�enia:
	- mozna do tego podej�� z innej strony i stworzy� tylko jedn� klas� publiczn� - SmartCache,
	natomiast SmartCacheView oraz SmartCacheItem mog�yby by� klasami prwatnymi, 
	kt�re by�yby tylko do u�ytku klasy SmartCache. Mo�na to zrobi�, poniewa� za pomoc� SmartCache
	mamy dost�p do ca�ej funkcjonalno�ci struktury.
