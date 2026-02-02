package com.method_references.invoice_obj_creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceCreation {
	public static void main(String[] args) {
		List<Integer> transactionIds = Arrays.asList(101, 102, 201, 202); 
		
		List<Invoice> invoices = transactionIds
				.stream() // make stream of list (101->102)
				.map(Invoice :: new) // Constructor reference - (new Invoice())
				.toList(); // 
		invoices.forEach(System.out::println);
	}

}
