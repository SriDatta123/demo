package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class voter_data_pedakurapadu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public java.sql.Date created_at;
	public String created_by;
	public java.sql.Date updated_at;
	public String updated_by;
	public byte active;
	public String caste;
	public String current_location_city;
	public String current_location_country;
	public String current_location_state;
	public String door_no;
	public String first_name;
	public String gender;
	public byte inactive;
	public String inactive_notes;
	public String inactive_reason;
	public String influencer;
	public String influencer_type;
	public String infuencer_notes;
	public String issue_notes;
	public String issue_type;
	public String last_name;
	public String score;
	public String mobile_number;
	public String party_affliation;
	public String partyAffiliationStrength;
	public String party_role;
	public String pb_no;
	public String profession;
	public String qualification;
	public String ready_to_volunteer;
	public String relation_type;
	public String relationship_name;
	public String sectionnameen;
	public String relationlastnameen;
	public String polingstationaddressen;
	public String road_name;
	public String sub_caste;
	public String village_or_ward_name;
	public String voter_id;
	public long bla_id;
	public long ri_id;
	public int age;
	public String constituency_name;
	public String constituency_type;
	public byte isverified;
	public String feedback;
	public String color;
	public String religion;
	public String first_name_te;
	public String last_name_te;
	public String updatedSurname;
	public String updatedSurnameEn;
	public byte isSurnameUpdated;
	public String relationshipName;
	public String relationshipSurname;
	public String familyId;
	public byte isFamilyHead;
	public String relationShipType;
	public byte isLeader;
	public String type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public java.sql.Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(java.sql.Date created_at) {
		this.created_at = created_at;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public java.sql.Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(java.sql.Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getCurrent_location_city() {
		return current_location_city;
	}
	public void setCurrent_location_city(String current_location_city) {
		this.current_location_city = current_location_city;
	}
	public String getCurrent_location_country() {
		return current_location_country;
	}
	public void setCurrent_location_country(String current_location_country) {
		this.current_location_country = current_location_country;
	}
	public String getCurrent_location_state() {
		return current_location_state;
	}
	public void setCurrent_location_state(String current_location_state) {
		this.current_location_state = current_location_state;
	}
	public String getDoor_no() {
		return door_no;
	}
	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public byte getInactive() {
		return inactive;
	}
	public void setInactive(byte inactive) {
		this.inactive = inactive;
	}
	public String getInactive_notes() {
		return inactive_notes;
	}
	public void setInactive_notes(String inactive_notes) {
		this.inactive_notes = inactive_notes;
	}
	public String getInactive_reason() {
		return inactive_reason;
	}
	public void setInactive_reason(String inactive_reason) {
		this.inactive_reason = inactive_reason;
	}
	public String getInfluencer() {
		return influencer;
	}
	public void setInfluencer(String influencer) {
		this.influencer = influencer;
	}
	public String getInfluencer_type() {
		return influencer_type;
	}
	public void setInfluencer_type(String influencer_type) {
		this.influencer_type = influencer_type;
	}
	public String getInfuencer_notes() {
		return infuencer_notes;
	}
	public void setInfuencer_notes(String infuencer_notes) {
		this.infuencer_notes = infuencer_notes;
	}
	public String getIssue_notes() {
		return issue_notes;
	}
	public void setIssue_notes(String issue_notes) {
		this.issue_notes = issue_notes;
	}
	public String getIssue_type() {
		return issue_type;
	}
	public void setIssue_type(String issue_type) {
		this.issue_type = issue_type;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getParty_affliation() {
		return party_affliation;
	}
	public void setParty_affliation(String party_affliation) {
		this.party_affliation = party_affliation;
	}
	public String getPartyAffiliationStrength() {
		return partyAffiliationStrength;
	}
	public void setPartyAffiliationStrength(String partyAffiliationStrength) {
		this.partyAffiliationStrength = partyAffiliationStrength;
	}
	public String getParty_role() {
		return party_role;
	}
	public void setParty_role(String party_role) {
		this.party_role = party_role;
	}
	public String getPb_no() {
		return pb_no;
	}
	public void setPb_no(String pb_no) {
		this.pb_no = pb_no;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getReady_to_volunteer() {
		return ready_to_volunteer;
	}
	public void setReady_to_volunteer(String ready_to_volunteer) {
		this.ready_to_volunteer = ready_to_volunteer;
	}
	public String getRelation_type() {
		return relation_type;
	}
	public void setRelation_type(String relation_type) {
		this.relation_type = relation_type;
	}
	public String getRelationship_name() {
		return relationship_name;
	}
	public void setRelationship_name(String relationship_name) {
		this.relationship_name = relationship_name;
	}
	public String getSectionnameen() {
		return sectionnameen;
	}
	public void setSectionnameen(String sectionnameen) {
		this.sectionnameen = sectionnameen;
	}
	public String getRelationlastnameen() {
		return relationlastnameen;
	}
	public void setRelationlastnameen(String relationlastnameen) {
		this.relationlastnameen = relationlastnameen;
	}
	public String getPolingstationaddressen() {
		return polingstationaddressen;
	}
	public void setPolingstationaddressen(String polingstationaddressen) {
		this.polingstationaddressen = polingstationaddressen;
	}
	public String getRoad_name() {
		return road_name;
	}
	public void setRoad_name(String road_name) {
		this.road_name = road_name;
	}
	public String getSub_caste() {
		return sub_caste;
	}
	public void setSub_caste(String sub_caste) {
		this.sub_caste = sub_caste;
	}
	public String getVillage_or_ward_name() {
		return village_or_ward_name;
	}
	public void setVillage_or_ward_name(String village_or_ward_name) {
		this.village_or_ward_name = village_or_ward_name;
	}
	public String getVoter_id() {
		return voter_id;
	}
	public void setVoter_id(String voter_id) {
		this.voter_id = voter_id;
	}
	public long getBla_id() {
		return bla_id;
	}
	public void setBla_id(long bla_id) {
		this.bla_id = bla_id;
	}
	public long getRi_id() {
		return ri_id;
	}
	public void setRi_id(long ri_id) {
		this.ri_id = ri_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getConstituency_name() {
		return constituency_name;
	}
	public void setConstituency_name(String constituency_name) {
		this.constituency_name = constituency_name;
	}
	public String getConstituency_type() {
		return constituency_type;
	}
	public void setConstituency_type(String constituency_type) {
		this.constituency_type = constituency_type;
	}
	public byte getIsverified() {
		return isverified;
	}
	public void setIsverified(byte isverified) {
		this.isverified = isverified;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
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
	public String getUpdatedSurname() {
		return updatedSurname;
	}
	public void setUpdatedSurname(String updatedSurname) {
		this.updatedSurname = updatedSurname;
	}
	public String getUpdatedSurnameEn() {
		return updatedSurnameEn;
	}
	public void setUpdatedSurnameEn(String updatedSurnameEn) {
		this.updatedSurnameEn = updatedSurnameEn;
	}
	public byte getIsSurnameUpdated() {
		return isSurnameUpdated;
	}
	public void setIsSurnameUpdated(byte isSurnameUpdated) {
		this.isSurnameUpdated = isSurnameUpdated;
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
	public String getFamilyId() {
		return familyId;
	}
	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}
	public byte getIsFamilyHead() {
		return isFamilyHead;
	}
	public void setIsFamilyHead(byte isFamilyHead) {
		this.isFamilyHead = isFamilyHead;
	}
	public String getRelationShipType() {
		return relationShipType;
	}
	public void setRelationShipType(String relationShipType) {
		this.relationShipType = relationShipType;
	}
	public byte getIsLeader() {
		return isLeader;
	}
	public void setIsLeader(byte isLeader) {
		this.isLeader = isLeader;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
