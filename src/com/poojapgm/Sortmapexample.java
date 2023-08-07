
package com.poojapgm;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sortmapexample {
	public static void main(String[] args) {
		sortmap();
	}
		
	static void sortmap() {
		SortedMap<Integer,String>set = new TreeMap<Integer,String>();  //Create a TreeMap of SortedMap
	    set.put(10,"ABCD");//Adding Element to Sortedmap
		set.put(20,"EFGH");
		set.put(30,"IJKL");
		set.put(40,"NOPQ");
		set.put(50,"RSWT");
		System.out.println("SETMAP========"+set);
		
		System.out.println("FirstKey========="+set.firstKey());//first element ahe to print hoel
		
		System.out.println("LastKey==========="+set.lastKey());//last element print hoel
		
		System.out.println("Headmap=========="+set.headMap(30));//jo element pass kela ahe to greater samjala jato typeksha less element 
                                                                  //  display hotat(jo element apan dila ahe to include kela jat nahi.)
                                                           
		
		System.out.println("Tailmap========="+set.tailMap(15)); //jo element pass kela ahe tyla small samjl jaat ani include kele jate
                                                                 //typeksha greater display kele jate
		
		System.out.println("submap==========="+set.subMap(10, 40));//submap cha use start -last end point (source-Destination)
                                                     //start and last madhil element display krtat(start element include kartat)
		
		
	}
	class emp{
		int id;
		String ename;
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the ename
		 */
		public String getEname() {
			return ename;
		}
		/**
		 * @param ename the ename to set
		 */
		public void setEname(String ename) {
			this.ename = ename;
		}
		/**
		 * @param id
		 * @param ename
		 */
		public emp(int id, String ename) {
			super();
			this.id = id;
			this.ename = ename;
		}
		@Override
		public String toString() {
			return "emp [id=" + id + ", ename=" + ename + "]";
		}
	}
	}



