package com.jdbc_practice.connection;

import java.sql.*;

public class CrudOperations {

	public static void insertStudent(String name, String email, int age, String grade) {
		String sql = "INSERT INTO students(name,email,age,grade,enrollment_date) VALUES(?,?,?,?,? )";
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){ //Query compiled
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3,  age);
			pstmt.setString(4,  grade);
			pstmt.setDate(5,  new java.sql.Date(System.currentTimeMillis()));
			int rowsAffected = pstmt.executeUpdate(); // Execute query here
			System.out.println(rowsAffected + "row(s) inserted successfully");
		}		 
		catch(SQLException e) {
			System.err.println("Insert failed: "+ e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void getAllStudents() {
		
		String sql = "SELECT * FROM students";
		try(Connection conn = BasicConnection.getConnection();
			Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			System.out.println("ID\tName\t\tEmail\tAge\tGrade");
			System.out.println("--------------------------------------");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String grade = rs.getString("grade");
				
				System.out.printf("%d\t%s\t %s\t%d\t%s%n", id,name,email,age,grade);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void updateStudentGrade(int studentId, String newGrade) {
		String sql = "UPDATE students SET grade = ? WHERE id = ?";
		
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, newGrade);
			pstmt.setInt(2, studentId);
			
			int rowsAffected = pstmt.executeUpdate();
			if(rowsAffected > 0) {
				System.out.println("Grade updated succesfully");
			}
			else {
				System.out.println("Student not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteStudent(int studnetId) {
		String sql = "DELETE FROM students WHERE id = ?";
		
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setInt(1, studnetId);
			int rowsAffected = pstmt.executeUpdate();
			if(rowsAffected > 0) {
				System.out.println("Student deleted successfully!");
			}else {
				System.out.println("Student not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void batchInsert() {
		String sql = "INSERT INTO students(name,email,age,grade) VALUES(?,?,?,?)";
		
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			while(true) {
				 
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
//		insertStudent("vansh", "abc@gmail.com", 21, "A");
//		insertStudent("Riya", "xyz@gmail.com", 19, "A+");
//		insertStudent("Hello", "z@gmail.com", 19, "A+");
//		getAllStudents();
//		updateStudentGrade(9, "A");
//		getAllStudents();
		deleteStudent(9);
		getAllStudents();
	}
}
