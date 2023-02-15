package Automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamTutorial {

	
		//@Test
//		public  void regular()
//		{
//			ArrayList<String> names=new ArrayList<String>();
//			names.add("harshil");
//			names.add("sheth");
//			names.add("harsh");
//			names.add("joshi");
//			
//			for(int i=0;i<names.size();i++)
//			{
//				String actual=names.get(i);
//				if(actual.startsWith("a"))
//				{
//					System.out.println(actual);
//				}
//			}
//		}
		@Test
		public void streamMap()
		{
			ArrayList<String> names=new ArrayList<String>();
			names.add("ASHAHA");
			names.add("sheth");
			names.add("harsh");
			names.add("joshi");
			Long c=names.stream().filter(s->s.startsWith("h")).count();
			System.out.println(c);			
			Stream.of("ASHAHA","Sheth","Harsh","Joshi").filter(s->s.endsWith("l"));
			List<String> names1=Arrays.asList("ASHAHA","AA","B","BC");
			names1.stream().filter(s->s.length()<4).forEach(s->System.out.println(s));
			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));		
			Stream.concat(names.stream(),names1.stream());
			List<Integer> values=Arrays.asList(3,2,5,7,1);
			
			
	}

}
