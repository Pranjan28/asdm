package tdd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Emp {
	private String name;
	private LocalDate doj;
	private static Scanner sc;
	
	static
	{
		sc = new Scanner(System.in);
	}
	
	public Emp()
	{
		System.out.println("Inside EMP CTOR");
	}
	
	public void acceptName()
	{
		System.out.println("Enter the name");
		name = sc.nextLine();
	}
	
	public void acceptDoj()
	{
		System.out.println("Enter in dd-mm-yy format");
		//doj = LocalDate.parse(sc.next());
		doj = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
	

}
