package JavaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CountRepeatingAlphabet 
{
    
	/**
	 * Count repeating alphabet starting with "A" in normal way  
	 */
	@Test
	public void calculaterepeatingAlphabet() {
		
		/* Calculate no of "a" present in string starting with A/a */
		
		ArrayList<String> characters = new ArrayList<>();
		characters.add("Abinash");
		characters.add("abinash");
		characters.add("Sipun");
		characters.add("Abinashg1");
		characters.add("Abinashg2");
		int count =0;
		System.out.println("Size of character : " + characters.size());
		
		for(int i=0; i<characters.size();i++) {
//			if(characters.get(i).equalsIgnoreCase("a") | characters.get(i).equalsIgnoreCase("A")) {
//				count ++;
//			}
			if(characters.get(i).startsWith("A") || characters.get(i).startsWith("a")) {
				System.out.println(characters.get(i));
				count ++;
			}
		}
		System.out.println("Total no of a/A present are :" + count);
	}
	
	
	/* Count Repeating alphabet by Stream method */
	
	@Test
	public void countRepeatingAplhabetByStream() {
		
		ArrayList<String> characters = new ArrayList<>();
		characters.add("Abinash");
		characters.add("Sipun");
		characters.add("Abinashg1");
		characters.add("Abinashg2");
		
		/*Here "characters" are converted to stream and with "filter" method operation is performed by lambda expression
		  where logic is given in 2nd part of operation "startsWith("A")" */
		Long alphabetcount = characters.stream().filter(s->s.startsWith("A")).count();
		System.out.println("Part 1 : "+alphabetcount);
		
								/******* OR ******/
		
		Long alphabetcounts = Stream.of("Abinas","Sipun","Abinash1","Abinash2").filter(s->s.startsWith("A")).count();
		System.out.println("Part 2 : "+alphabetcounts);
		
		
								/****** OR *******/
		
		Long alphabetscounts = Stream.of("Abinas","Sipun","Abinash1","Abinash2").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		System.out.println("Part 3 : "+alphabetscounts);
		
		characters.stream().filter(s->s.length()<=3).forEach(s->System.out.println("NAMES : " + s));

	}
	
	/**
	 * Finds string ending with "a" and converts it to upper case  
	 */
	@Test
	public void streamMap() {
		Stream.of("Abinas","Abinasha","Sipun").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		  forEach(s->System.out.println(s));
		
		Stream.of("Abhinas","Abinasha","ASipun").sorted().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
	}
	
	
	/**
	 * Merging two strings
	 */
	@Test
	public void concartinateString() {
		
		System.out.println("Entered for concartination");
		
		String Array1[] = {"Abinash", "Abinash1", "Abinash2"};
		String Array2[] = {"Abinash3", "Abinash4", "Abinash5"};
		
		List<String> names = Arrays.asList(Array1);
		List<String> names1 = Arrays.asList(Array2);
		
		Stream<String> mergedname = Stream.concat(names.stream(), names1.stream());
		mergedname.sorted().forEach(s->System.out.println(s));
		boolean flag = mergedname.anyMatch(s->s.equalsIgnoreCase("Abinash3"));
		Assert.assertTrue(flag, "Value matched");
		
	}
	
	
	/**
	 * This method converts the result back to List by the method "collect"
	 */
	@Test
	public void convertToList() {
		System.out.println("********* Entered to convertToList *******");
		
		List<String> list = Stream.of("Abhinas","Abinasha","Sipun").sorted().filter(s->s.startsWith("A")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		
		int array1[] = {1,1,2,2,3,4,5,5,6,7,7};
		List<int[]> numbers = Arrays.asList(array1);
		numbers.stream().distinct().forEach(s->System.out.println(s));
		List<int[]> lists = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(lists.get(1));
		System.out.println(lists);
		
	}
}


