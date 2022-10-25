package com.example.demo;

//@Entity(name="vdp")
public class Vdp {

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
	public String score;
	public String relationlastnameen;
	public String relationshipName;
	public String relationshipSurname;
	public String village_or_ward_name;
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
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
	public Vdp(String id,  String door_no, String caste, String first_name, String last_name,
			String first_name_te, String last_name_te, String gender, String relation_type, String age,
			String relationship_name, String score, String relationlastnameen, String relationshipName,
			String relationshipSurname, String village_or_ward_name) {
		super();
		this.id = Integer.parseInt(id) ;
		this.vpd_id = Integer.parseInt(id);
		this.door_no = door_no;
		this.caste = caste;
		this.first_name = first_name;
		this.last_name = last_name;
		this.first_name_te = first_name_te;
		this.last_name_te = last_name_te;
		this.gender = gender;
		this.relation_type = relation_type;
		this.age = Integer.parseInt(age);
		this.relationship_name = relationship_name;
		this.score = score;
		this.relationlastnameen = relationlastnameen;
		this.relationshipName = relationshipName;
		this.relationshipSurname = relationshipSurname;
		this.village_or_ward_name = village_or_ward_name;
	}
	
	
}
