package com.poojapgm;

public class Cloneexg {

	public static void main(String[] args) {
		stud s1=new stud(1,"abc");
		try {
			stud s2= (stud) s1.clone();//Creates and returns a copy of this object. s1 object clone bnval te s2 to la same milte.
			                               //The precise meaningof "copy" may depend on the class of the object.
			                               //handle karyche try ani catch ne
			System.out.println("s1=========="+s1);
			System.out.println("s2=========="+s2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}
		
	class stud implements Cloneable //exception yeu naye manun marker interface cloneable write kela jato
	{
		int id;
		String name;
		
		/**
		 * @param id
		 * @param name
		 */
		public stud(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public stud(String string, String string2, int i) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "stud [id=" + id + ", name=" + name + "]";
		}
		
		@Override   //clone override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	}
/*notes- to create the exact copy from existing  object.
	*/