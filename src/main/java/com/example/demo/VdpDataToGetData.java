package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class VdpDataToGetData {

	
	public long id;
	public String relationship_namescore;
	public String first_namescore;
	public String relation_type;

	public String surname;
	public String familyId;
	
	@JsonIgnore
	public List<VdpDataToGetData> sonsList;
	@JsonIgnore
	public List<VdpDataToGetData> daughterList;
	@JsonIgnore
	public List<VdpDataToGetData> wifeList;
	
}
