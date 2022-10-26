package com.example.demo;

import java.util.ArrayList;
import java.util.List;



public class VdpRelationsModel {

	public long id;
	public long vpd_id;
	public String door_no;
	public String caste;
	public String first_name;
	public String last_name;
	public String first_name_te;
	public String last_name_te;
	public String gender;
	public String relation_type;
	public int age;
	public String relationship_name;
	public String relationlastnameen;
	public String relationshipName;
	public String relationshipSurname;
	public String village_or_ward_name;
	public String relationship_namescore;
	public String first_namescore;
	
	public List<VdpRelationsModel> sonsList;
	public List<VdpRelationsModel> daughterList;
	public List<VdpRelationsModel> wifeList;
	
	
	
	
	public String getRelationship_namescore() {
		return relationship_namescore;
	}


	public void setRelationship_namescore(String relationship_namescore) {
		this.relationship_namescore = relationship_namescore;
	}


	public String getFirst_namescore() {
		return first_namescore;
	}


	public void setFirst_namescore(String first_namescore) {
		this.first_namescore = first_namescore;
	}


	public VdpRelationsModel(Vdp i) {
		// TODO Auto-generated constructor stub
		super();
		this.id = i.getId();
		this.vpd_id = i.getVpd_id();
		this.door_no = i.getDoor_no();
		this.caste = i.getCaste();
		this.first_name = i.first_name;
		this.last_name = i.last_name;
		this.first_name_te = i.getFirst_name_te();
		this.last_name_te = i.getLast_name_te();
		this.gender = i.gender;
		this.relation_type = i.relation_type;
		this.age = i.age;
		this.relationship_name = i.relationship_name;
		this.relationlastnameen = i.relationlastnameen;
		this.relationshipName = i.relationshipName;
		this.relationshipSurname = i.relationshipSurname;
		this.village_or_ward_name = i.village_or_ward_name;
		this.sonsList = new ArrayList<VdpRelationsModel>();
		this.daughterList = new ArrayList<VdpRelationsModel>();
		this.wifeList = new ArrayList<VdpRelationsModel>();
		this.first_namescore = i.getFirst_namescore();
		this.relationship_namescore = i.getRelationship_namescore();

	}
	

	public VdpRelationsModel(long id, long vpd_id, String door_no, String caste, String first_name, String last_name,
			String first_name_te, String last_name_te, String gender, String relation_type, int age,
			String relationship_name,  String relationlastnameen, String relationshipName,
			String relationshipSurname, String village_or_ward_name, List<VdpRelationsModel> sonsList,
			List<VdpRelationsModel> daughterList, List<VdpRelationsModel> wifeList, String first_namescore, String relationship_namescore) {
		super();
		this.id = id;
		this.vpd_id = vpd_id;
		this.door_no = door_no;
		this.caste = caste;
		this.first_name = first_name;
		this.last_name = last_name;
		this.first_name_te = first_name_te;
		this.last_name_te = last_name_te;
		this.gender = gender;
		this.relation_type = relation_type;
		this.age = age;
		this.relationship_name = relationship_name;
		this.relationlastnameen = relationlastnameen;
		this.relationshipName = relationshipName;
		this.relationshipSurname = relationshipSurname;
		this.village_or_ward_name = village_or_ward_name;
		this.sonsList = sonsList;
		this.daughterList = daughterList;
		this.wifeList = wifeList;
		this.first_namescore = first_namescore;
		this.relationship_namescore = relationship_namescore;
	}


	public VdpRelationsModel() {
		// TODO Auto-generated constructor stub
		super();
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVpd_id() {
		return vpd_id;
	}

	public void setVpd_id(long vpd_id) {
		this.vpd_id = vpd_id;
	}

	public String getDoor_no() {
		return door_no;
	}

	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name_te() {
		return first_name_te;
	}

	public void setFirst_name_te(String first_name_te) {
		this.first_name_te = first_name_te;
	}

	public String getLast_name_te() {
		return last_name_te;
	}

	public void setLast_name_te(String last_name_te) {
		this.last_name_te = last_name_te;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRelation_type() {
		return relation_type;
	}

	public void setRelation_type(String relation_type) {
		this.relation_type = relation_type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRelationship_name() {
		return relationship_name;
	}

	public void setRelationship_name(String relationship_name) {
		this.relationship_name = relationship_name;
	}


	public String getRelationlastnameen() {
		return relationlastnameen;
	}

	public void setRelationlastnameen(String relationlastnameen) {
		this.relationlastnameen = relationlastnameen;
	}

	public String getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

	public String getRelationshipSurname() {
		return relationshipSurname;
	}

	public void setRelationshipSurname(String relationshipSurname) {
		this.relationshipSurname = relationshipSurname;
	}

	public String getVillage_or_ward_name() {
		return village_or_ward_name;
	}

	public void setVillage_or_ward_name(String village_or_ward_name) {
		this.village_or_ward_name = village_or_ward_name;
	}

	public List<VdpRelationsModel> getSonsList() {
		return sonsList;
	}

	public void setSonsList(List<VdpRelationsModel> sonsList) {
		this.sonsList = sonsList;
	}

	public List<VdpRelationsModel> getDaughterList() {
		return daughterList;
	}

	public void setDaughterList(List<VdpRelationsModel> daughterList) {
		this.daughterList = daughterList;
	}

	public List<VdpRelationsModel> getWifeList() {
		return wifeList;
	}

	public void setWifeList(List<VdpRelationsModel> wifeList) {
		this.wifeList = wifeList;
	}
	

}
