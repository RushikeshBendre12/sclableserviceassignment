package com.sclableservices.Assignment.CourseAddition;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Course {


		@Id
	    private int id;

	    @NotEmpty(message = "Title cannot be empty")
	    private String title;

	    @NotEmpty(message = "Description cannot be empty")
	    private String description;

	    public Course() {}

	    public Course(int id, String title, String description) {
	        this.id = id;
	        this.title = title;
	        this.description = description;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	}


