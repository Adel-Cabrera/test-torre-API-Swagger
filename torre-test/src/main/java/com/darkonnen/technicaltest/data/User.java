package com.darkonnen.technicaltest.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@JsonIgnoreProperties
@Data
public class User {
	
	private Name name;
	
}
