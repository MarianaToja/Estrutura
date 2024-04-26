package ExemploEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

	public static void main(String[] args) {
//		System.out.println(new String("Pedro")== new String ("Pedro"));//Imprime false
//		System.out.println(new String ("Pedro").equals(new String("Pedro")));//Imprime true
//		
//		
//		System.out.println(gs.hashCode);
//		System.out.pritnln(menu.hashCode());
		
	HashSet<String> hashSet = new HashSet<String>();		
	hashSet.add("Moto");
	
	System.out.println("Elementos no HashSet");
	for(String veiculo:hashSet) {
		System.out.println(veiculo);
}
	Iterator<String> iterator = hashSet.iterator();
	LinkedHashSet<String> lkHash = new LinkedHashSet<String>();
	Iterator<String> iteratorLkHash = lkHash.iterator();
	 
	Set<String> setMap = new TreeSet<String>();
	Iterator<String> setMapIterator = setMap.iterator();
	
	System.out.println("Listando elementos com Iterator");
	while(iterator.hasNext()) {
		String item = iterator.next();

		System.out.println(item);
		}
		
		
 
		
		

	}
}


		