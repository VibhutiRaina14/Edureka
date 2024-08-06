package com.org.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamClass {
	List<String> myList=Arrays.asList("apple","banana");
	List<Integer> l=Arrays.asList(1,2,8,6,5,9);
	List<Integer> natural_sortedl=l.stream().sorted().collect(Collectors.toList());
	List<Integer> reverse_sortedl=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("natural_sortedl:"+natural_sortedl);
	System.out.println("reverse_sortedl:"+reverse_sortedl);
	
//	Stream<Integer> st=Stream.of(1,8,9,6,4,7);
//	st.sorted((a,b)->b-a).forEach(System.out::println);
//	Stream<String> sequentialStream=myList.stream();//sequential stream
//	Stream<String> parallelStream=myList.parallelStream();
//	
//	Stream<String> stream=Stream.of("apple","banana");
//	sequentialStream=Stream.of("red","blue");
//	stream.forEach(System.out::println);
//	sequentialStream.forEach(System.out::println);
	//IntStream s3=Arrays.stream(arr1);
	//List<String> filter1=myList.stream().filter(stream.length()>3).collect(null)
}